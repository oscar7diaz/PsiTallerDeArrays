public class Ejercicio4 {

    public static void main(String[] args) {
        int[] nums = {10, 55, 23, 80, 42, 67, 90, 12, 33, 76, 5, 60};

        mostrar(nums);

        System.out.println("Pares: " + pares(nums));
        System.out.println("Impares: " + impares(nums));

        mayorMenor(nums);

        mayores50(nums);
    }

    public static void mostrar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static int pares(int[] n) {
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int impares(int[] n) {
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }

    public static void mayorMenor(int[] n) {
        int mayor = n[0];
        int menor = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > mayor) mayor = n[i];
            if (n[i] < menor) menor = n[i];
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

    public static void mayores50(int[] n) {
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 50) {
                cont++;
            }
        }
        System.out.println("Mayores a 50: " + cont);
    }
}