/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Fabian Valero
 */
public class Logicachat {

    public String respuesta(String peticion) {

        String petic;
        petic = "";

        if ("hola".equals(peticion) || "hey".equals(peticion) || "que onda wey".equals(peticion) || "oe".equals(peticion) || "holi".equals(peticion)) {

            petic = "Hola, como va tu dia hoy?";
        } else {
            if ("de donde eres?".equals(peticion) || "donde vives?".equals(peticion) || "Vives por aqui?".equals(peticion) || "que haces por estos lados?".equals(peticion) || "trabas por aqui?".equals(peticion)) {

                petic = "mi ubicación es indeterminada";
            } else {

                if ("Quieres salir?".equals(peticion) || "te invito a comer".equals(peticion) || "deberiamos salir un dia de estos".equals(peticion) || "y si salimos a bailar?".equals(peticion) || "salimos?".equals(peticion)) {

                    petic = "A donde?";
                } else {

                if ("Estudias o trabajas?".equals(peticion) || "En que ocupas tu tiempo libre?".equals(peticion) || "a que te dedicas?".equals(peticion) || "laboras en?".equals(peticion) || "y tu trabajo?".equals(peticion)) {

                    petic = "mi unica función es chatear contigo";
                } else {
                    
                if ("hasta luego".equals(peticion) || "chao".equals(peticion) || "nos charlamos otro dia".equals(peticion) || "luego nos charlamos".equals(peticion) || "adios".equals(peticion)) {

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
