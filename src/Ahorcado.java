import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner que nos permite escribir en pantalla
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosmaximo = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosmaximo) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " de ("
                    + palabraSecreta.length() + ") letras");

            System.out.println("Ingresa una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta!!, Te quedan (" + (intentosmaximo-intentos) + ") intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades!!, Haz adivinado la palabra secreta: " + palabraSecreta);
            }

            if (!palabraAdivinada) {
                System.out.println("GAME OVER, No haz adivinado la palabra secreta");
            }

        }
        
        scanner.close();

    }
}
