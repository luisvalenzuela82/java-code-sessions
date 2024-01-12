/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.filewriterdemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Luis Valenzuela
 */
public class WavByteGenerator {

    

    public static byte[] generateHeader() {
        return new byte[]{
            // RIFF header
            'R', 'I', 'F', 'F', // ChunkID
            0, 0, 0, 0, // ChunkSize (actualizado después)
            'W', 'A', 'V', 'E', // Format

            // Sub-chunk 1 "fmt "
            'f', 'm', 't', ' ', // Subchunk1ID
            16, 0, 0, 0, // Subchunk1Size (16 para PCM)
            1, 0, // AudioFormat (1 para PCM)
            1, 0, // NumChannels (1 para mono)
            0x44, (byte) 0xAC, 0, 0, // SampleRate (44100 Hz)
            (byte) 0x88, 0x58, 0x01, 0, // ByteRate (SampleRate * NumChannels * BitsPerSample/8)
            2, 0, // BlockAlign (NumChannels * BitsPerSample/8)
            16, 0, // BitsPerSample

            // Sub-chunk 2 "data"
            'd', 'a', 't', 'a', // Subchunk2ID
            0, 0, 0, 0 // Subchunk2Size (actualizado después)
        };
    }

    public static byte[] generateTone(int sampleRate, int frequency, int durationSeconds) {
        int numSamples = durationSeconds * sampleRate;
        byte[] data = new byte[2 * numSamples];
        for (int i = 0; i < numSamples; i++) {
            short sample = (short) (Math.sin(2 * Math.PI * i / (sampleRate / frequency)) * Short.MAX_VALUE);
            data[2 * i] = (byte) (sample & 0xff);
            data[2 * i + 1] = (byte) ((sample >> 8) & 0xff);
        }
        return data;
    }

    public static void updateChunkSizes(FileOutputStream fos, int audioLength) throws IOException {
        fos.getChannel().position(4); // Tamaño del archivo
        fos.write(intToByteArray(36 + audioLength), 0, 4);

        fos.getChannel().position(40); // Tamaño de los datos
        fos.write(intToByteArray(audioLength), 0, 4);
    }

    private static byte[] intToByteArray(int value) {
        return new byte[]{
            (byte) (value & 0xff),
            (byte) ((value >> 8) & 0xff),
            (byte) ((value >> 16) & 0xff),
            (byte) ((value >> 24) & 0xff),};
    }

    public static byte[] generateSimpleBMP() {
        // Encabezado BMP (54 bytes) + Datos de píxeles (4 píxeles x 3 bytes cada uno)
        byte[] bmp = new byte[54 + 4 * 3];

        // Encabezado BMP
        int[] header = new int[]{
            0x42, 0x4D, // Tipo de archivo: BM
            0x3A, 0x00, 0x00, 0x00, // Tamaño del archivo
            0x00, 0x00, // Reservado
            0x00, 0x00, // Reservado
            0x36, 0x00, 0x00, 0x00, // Tamaño del encabezado
            0x28, 0x00, 0x00, 0x00, // Tamaño del DIB header
            0x02, 0x00, 0x00, 0x00, // Ancho
            0x02, 0x00, 0x00, 0x00, // Alto
            0x01, 0x00, // Número de planos de color
            0x18, 0x00, // Bits por píxel
            0x00, 0x00, 0x00, 0x00, // Sin compresión
            0x10, 0x00, 0x00, 0x00, // Tamaño de los datos de la imagen
            0x13, 0x0B, 0x00, 0x00, // Resolución horizontal
            0x13, 0x0B, 0x00, 0x00, // Resolución vertical
            0x00, 0x00, 0x00, 0x00, // Número de colores en la paleta
            0x00, 0x00, 0x00, 0x00 // Número de colores importantes
        };

        // Convertir el encabezado a bytes
        for (int i = 0; i < header.length; i++) {
            bmp[i] = (byte) header[i];
        }

        // Datos de los píxeles (B, G, R)
        for (int i = 54; i < bmp.length; i += 3) {
            bmp[i] = (byte) 255; // Azul
            bmp[i + 1] = (byte) 255; // Verde
            bmp[i + 2] = (byte) 255; // Rojo
        }

        return bmp;
    }
}
