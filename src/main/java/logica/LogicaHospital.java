/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabian Valero
 */
public class LogicaHospital {

    
   

    public String respuesta(String peticionH) {

        String petic;
        petic = "";
        
       if ("fabian".equals(peticionH) || "alberto".equals(peticionH) || "valero".equals(peticionH) || "ardila".equals(peticionH) || "86080867".equals(peticionH) || "carlos arturo escobar".equals(peticionH) || "cafam facatativá".equals(peticionH)) {

            petic = "Cédula - Nombre completo - Médico que atendió - Centro Médico\n"
                    + "86.080.867 - Fabian Alberto Valero Ardila - Carlos Arturo Escobar - Cafam Facatativá";
        } else {
            if ("juan".equals(peticionH) || "manuel".equals(peticionH) || "perez".equals(peticionH) || "ovalle".equals(peticionH) || "1121345432".equals(peticionH) || "david santiago ortiz perez".equals(peticionH) || "cafam mosquera".equals(peticionH)) {

                petic = "Cédula - Nombre completo - Médico que atendió - Centro Médico\n"
                        + "1121345432 - Juan Manuel Perez Ovalle - David Santiago Ortiz Perez - Cafam Mosquera";
            } else {

                if ("carlos".equals(peticionH) || "alberto".equals(peticionH) || "rodriguez".equals(peticionH) || "gutierrez".equals(peticionH) || "80.687.546".equals(peticionH) || "camilo perez cubillos".equals(peticionH) || "cafam funza".equals(peticionH)) {

                    petic = "Cédula - Nombre completo - Médico que atendió - Centro Médico\n"
                            + "80.687.546 - carlos alberto rodriguez gutierrez - Camilo Perez Cubillos - Cafam Funza";
                } else {

                    if ("Estudias o trabajas?".equals(peticionH) || "En que ocupas tu tiempo libre?".equals(peticionH) || "a que te dedicas?".equals(peticionH) || "laboras en?".equals(peticionH) || "y tu trabajo?".equals(peticionH)) {

                        petic = "mi unica función es chatear contigo";
                    } else {

                        if ("hasta luego".equals(peticionH) || "chao".equals(peticionH) || "nos charlamos otro dia".equals(peticionH) || "luego nos charlamos".equals(peticionH) || "adios".equals(peticionH)) {

                            petic = "Bueno, fue un placer chatear contigo, que tengas un bonito dia";
                        } else {
                            petic = "vamos muy rapido";
                        }

                    }

                }
            }

        }
        return petic;

        
    }

    
}

/*
        
        if ("fabian".equals(peticionH) || "alberto".equals(peticionH) || "valero".equals(peticionH) || "ardila".equals(peticionH) || "86080867".equals(peticionH) || "carlos arturo escobar".equals(peticionH) || "cafam facatativá".equals(peticionH)) {

            petic = "Cédula - Nombre completo - Médico que atendió - Centro Médico\n"
                    + "86.080.867 - Fabian Alberto Valero Ardila - Carlos Arturo Escobar - Cafam Facatativá";
        } else {
            if ("juan".equals(peticionH) || "manuel".equals(peticionH) || "perez".equals(peticionH) || "ovalle".equals(peticionH) || "1121345432".equals(peticionH) || "david santiago ortiz perez".equals(peticionH) || "cafam mosquera".equals(peticionH)) {

                petic = "Cédula - Nombre completo - Médico que atendió - Centro Médico\n"
                        + "1121345432 - Juan Manuel Perez Ovalle - David Santiago Ortiz Perez - Cafam Mosquera";
            } else {

                if ("carlos".equals(peticionH) || "alberto".equals(peticionH) || "rodriguez".equals(peticionH) || "gutierrez".equals(peticionH) || "80.687.546".equals(peticionH) || "camilo perez cubillos".equals(peticionH) || "cafam funza".equals(peticionH)) {

                    petic = "Cédula - Nombre completo - Médico que atendió - Centro Médico\n"
                            + "80.687.546 - carlos alberto rodriguez gutierrez - Camilo Perez Cubillos - Cafam Funza";
                } else {

                    if ("Estudias o trabajas?".equals(peticionH) || "En que ocupas tu tiempo libre?".equals(peticionH) || "a que te dedicas?".equals(peticionH) || "laboras en?".equals(peticionH) || "y tu trabajo?".equals(peticionH)) {

                        petic = "mi unica función es chatear contigo";
                    } else {

                        if ("hasta luego".equals(peticionH) || "chao".equals(peticionH) || "nos charlamos otro dia".equals(peticionH) || "luego nos charlamos".equals(peticionH) || "adios".equals(peticionH)) {

                            petic = "Bueno, fue un placer chatear contigo, que tengas un bonito dia";
                        } else {
                            petic = "vamos muy rapido";
                        }

                    }

                }
            }

        }
        return petic;
 */
