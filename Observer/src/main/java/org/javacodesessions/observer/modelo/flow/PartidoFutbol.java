/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.observer.modelo.flow;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 *
 * @author Luis Valenzuela
 */
//Similar al Sujeto
public class PartidoFutbol extends SubmissionPublisher<String> implements Flow.Publisher<String> {

    public void publicarEvento(String evento) {
        this.submit(evento); // Envía un evento a todos los suscriptores
    }
}
