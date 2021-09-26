package trabajopractico5;

public class Arreglo {

    public static void sumarLista(int arrNums[]) {
        int suma = 0;
        for (int i = 0; i < arrNums.length; i++) {
            suma += arrNums[i];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (double) suma / arrNums.length);
    }

    public static void buscarMayor(int irregNums[][]) {
        int mayor = 0;
        for (int[] row : irregNums) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] > mayor) {
                    mayor = row[i];
                }
            }
        }
        System.out.println("Mayor: " + mayor);
    }

    public static void cuentaVocales(String s) {
        int cantVocales = 0;
        for (int x = 0; x < s.length(); x++) {
            switch (s.charAt(x)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':       //podría añadirle mas casos para vocales
                case 'I':       //con tildes y otras cosas, pero se me haría
                case 'o':       //muy largo.
                case 'O':
                case 'u':
                case 'U':
                    cantVocales++;
            }
        }
        System.out.println("En la frase hay " + cantVocales + " vocales");
    }

    public static void cuentaCaracter(String s, char x) {
        int aparece = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                aparece++;
            }
        }
        System.out.println("El caracter " + x + " aparece " + aparece + " veces en el texto.");
    }
}