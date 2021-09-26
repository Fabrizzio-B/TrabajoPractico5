package trabajopractico5;

public class PruebaArreglo {

    public static void main(String[] args) {

        int[] oneD = new int[]{20, 11, 5, 2, 14};
        int[][] irregTwoD = new int[][]{{20, 5, 11}, {2, 4}, {7, 22, 40, 30}};
        String string = "Hola que tal";

        Arreglo.sumarLista(oneD);

        Arreglo.buscarMayor(irregTwoD);

        Arreglo.cuentaVocales(string);

        Arreglo.cuentaCaracter(string, 'a');
    }
}