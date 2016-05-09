/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdom.challenge.v1.pkg0.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ignacio Esparza
 */
public final class Conf {
    Respuestas resp;
    Preguntas preg;
    
    public Conf(){
      configuracion(); 
    }
    
    public void configuracion(){
        
        int puntaje=0, pos, cont=0; 
        int pregunta [] = respuestaRandom();
        do{
        pos = pregunta [cont];    
        resp = new Respuestas();
        preg = new Preguntas();
        //aqui llamo solo las alternativas correctas para luego comprarlas la seleccion del usuario
        String [] correctas = resp.resCorrectas;
        
        // con este metodo estoy llamando la pregunta en la posición "pos" que se resive desde el main
        System.out.println(preg.llamarPreguntas(pos));
        
        //aqui al arreglo alter(alternativa) se llena con las alternativas señuelo y la correcta
            String  [] alter = resp.establecerRespuesta(pos);
            System.out.println("A) "+alter[0]);
            System.out.println("B) "+alter[1]);
            System.out.println("C) "+alter[2]);
            System.out.println("D) "+alter[3]);
            
            
        String res=leerstring();
        int resUser = respuestaUser(res);
        
             System.out.println("");
             
         // aqui se comprara la alternativa seleccionada por el usuario con la correcta    
             
        if (alter[resUser].compareTo(correctas[pos])==0){
                System.out.println("Respuesta Correcta");
                System.out.println();
                puntaje++;
            }else{
                System.out.println("Respuesta Incorrecta, La respuesta Correcta es : "+correctas[pos]);
                System.out.println();
        }
        
         System.out.println("Puntaje es : "+puntaje); 
         cont++;
        }while(cont!=10);
    }// fin configuracion
    
    /*public int [] mezcladorAlternativa (){
        
    } //proximamente*/
    
     public static int [] respuestaRandom() {
        int vector [] = new int[12];
        int i, j=0;
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 12);
            while (j < i) {
                if (vector[i] == vector[j]) {
                    vector[i] = (int) (Math.random() * 12);
                    j=0;
                }else{
                    j++;
                }// fin else
            }// fin while
            j=0;
        }// fin for
        return vector;
    }
    
    public static int respuestaUser(String res){
        
        // este método se encarga de que cuando el usuario ingrese la alternativa, a esta se le
        //asigna la posición respectiva de la alternativa, si el carácter ingresado no es alternativa 
        // se ejecutará hasta que ingrese una alternativa válida.
        int resConvertida;
        String resmin=res.toLowerCase();
        
        switch (resmin){
            case "a":
                resConvertida=0;
                break;
            case "b":
                resConvertida=1;
                break;
            case "c":
                resConvertida=2;
                break;
            case "d":
                resConvertida=3;
                break;
           default:
                System.out.println("El Carácter "+res+" no es una Alternativa Válida\n"
                                + "Seleccione Denuevo\n");
                         resmin=leerstring();
                         resConvertida= respuestaUser(resmin);  
                break;      
        }
        return resConvertida;  
    }
    
    public static String leerstring (){
        Scanner leer=new Scanner(System.in);
        String texto=leer.nextLine();
        return texto;  
    }//leerString
}
