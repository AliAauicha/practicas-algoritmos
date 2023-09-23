public class Busqueda {
    public static void main(String[] args) {
        String cadenaPrincipal = "Esto es un ejemplo de búsqueda de subcadena.";
        String subcadena = "ejemplo";

        // Llama a la función de búsqueda de subcadena
        int posicion = buscarSubcadena(cadenaPrincipal, subcadena);

        if (posicion != -1) {
            System.out.println("La subcadena se encuentra en la posición " + posicion + " de la cadena principal.");
        } else {
            System.out.println("La subcadena no se encuentra en la cadena principal.");
        }
    }

    public static int buscarSubcadena(String cadenaPrincipal, String subcadena) {
        int n = cadenaPrincipal.length();
        int m = subcadena.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (cadenaPrincipal.charAt(i + j) != subcadena.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // La subcadena se encontró en la posición i
            }
        }
        return -1; // La subcadena no se encontró en la cadena principal
    }
}

