/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio2.bad;

/**
 *
 * @author Luis Valenzuela
 */
public class ReportGeneratorBadIdea {

    public void generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            System.out.println("Generando reporte PDF");
        } else if (reportType.equals("Word")) {
            System.out.println("Generando reporte Word");
        }
        // Para añadir un nuevo formato, tendríamos que modificar esta clase
    }
}
