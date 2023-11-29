/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio2;

import org.javacodesessions.programacionorientadaobjetos5.principio2.bad.ReportGeneratorBadIdea;
import org.javacodesessions.programacionorientadaobjetos5.principio2.good.PdfReportGenerator;
import org.javacodesessions.programacionorientadaobjetos5.principio2.good.ReportGeneratorGoodIdea;
import org.javacodesessions.programacionorientadaobjetos5.principio2.good.WordReportGenerator;

/**
 *
 * @author Luis Valenzuela
 */
public class AbiertoCerrado {

    /*
    Principio de Abierto/Cerrado (Open/Closed Principle): 
    Este principio establece que las entidades de software 
    (como clases, módulos y funciones) deben estar abiertas para la extensión,
    pero cerradas para la modificación. 
    
    Esto significa que deberías poder añadir nuevas funcionalidades sin 
    cambiar el código existente.
     */
    public static void main(String[] args) {

        //MALA IDEA
        ReportGeneratorBadIdea reportGeneratorBadIdea = new ReportGeneratorBadIdea();
        reportGeneratorBadIdea.generateReport("PDF");
        reportGeneratorBadIdea.generateReport("Word");

        //BUENA IDEA
        new PdfReportGenerator().generateReport();
        new WordReportGenerator().generateReport();
    }

    /*
    Facilita la Extensión
    Reduce el Riesgo de Errores
    Mejora la Mantenibilidad
     */
}
