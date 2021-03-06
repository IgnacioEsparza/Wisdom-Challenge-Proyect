package wisdomchallenge;


import java.util.Scanner;

/**
 * @author Ignacio Esparza
 */
public final class Conf {

    Respuestas resp;
    Preguntas preg;
    RegistroPuntaje rpunt;

    public Conf() {
        preg = new Preguntas();
        resp = new Respuestas();
    }

    public void creaPreguntas() {
        int puntaje = 0, pos, cont = 0;
        int pregunta[] = preguntaRandom();
        String nombre = registroNombre();
        do {
            pos = pregunta[cont];
            //pos = 36;
            //aqui llamo solo las alternativas correctas para luego comprarlas la seleccion del usuario
            String correctas = resp.resCorrectas(pos);
            // con este metodo estoy llamando la pregunta en la posición "pos" que se resive desde el main
            System.out.println(preg.preguntas(pos));
            //aqui al arreglo alter(alternativa) se llena con las alternativas señuelo y la correcta
            String[] alter = resp.establecerRespuesta(pos);
            System.out.println("A) " + alter[0]);
            System.out.println("B) " + alter[1]);
            System.out.println("C) " + alter[2]);
            System.out.println("D) " + alter[3]);

            //se pide la respuesta del usuario
            String res = leerstring();
            //se le pasa la respuesta del que fue escrita con letras ya convertida, para que el arreglo
            //pueda interpretarla
            int resUser = respuestaUser(res);

            System.out.println("");

            // aqui se comprara la alternativa seleccionada por el usuario con la correcta    
            if (alter[resUser].equals(correctas) == true) {
                System.out.println("Respuesta Correcta");
                System.out.println();
                puntaje++;
            } else {
                System.out.println("Respuesta Incorrecta, La respuesta Correcta es : " + correctas);
                System.out.println();
            }

            cont++;
        } while (cont != 10);
        System.out.println("____________________________________________________________________");
        System.out.println("Puntaje es |" + puntaje * 100 + "|");
        
        puntaje = puntaje*100;
        rpunt = new RegistroPuntaje();
        rpunt.registroPunt(new Puntaje(nombre, puntaje));
    }

    private static int[] preguntaRandom() {
        //cantpreg son la cantidad de preguntas actuales
        int cantpreg = 36;
        int vector[] = new int[cantpreg];
        int i, j = 0;
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * cantpreg);
            while (j < i) {
                if (vector[i] == vector[j]) {
                    vector[i] = (int) (Math.random() * cantpreg);
                    j = 0;
                } else {
                    j++;
                }// fin else
            }// fin while
            j = 0;
        }// fin for
        return vector;
    }

    private static int respuestaUser(String res) {

        // este método se encarga de que cuando el usuario ingrese la alternativa, a esta se le
        //asigna la posición respectiva de la alternativa, si el carácter ingresado no es alternativa 
        // se ejecutará hasta que ingrese una alternativa válida.
        int resConvertida;
        String resmin = res.toLowerCase();

        switch (resmin) {
            case "a":
                resConvertida = 0;
                break;
            case "b":
                resConvertida = 1;
                break;
            case "c":
                resConvertida = 2;
                break;
            case "d":
                resConvertida = 3;
                break;
            default:
                System.out.println("El Carácter " + res + " no es una Alternativa Válida\n"
                        + "Seleccione Denuevo\n");
                resmin = leerstring();
                resConvertida = respuestaUser(resmin);
                break;
        }
        return resConvertida;
    }// fin de respuestaUser

    public String registroNombre() {
        System.out.println("Ingrese su Nombre");
        String nombre = leerstring();
        System.out.println();
        System.out.println("Bienvenido(a) : "+nombre+"\n");
        return nombre;
    }

    public static String leerstring() {
        Scanner leer = new Scanner(System.in);
        String texto = leer.nextLine();
        return texto;
    }//leerString
}
