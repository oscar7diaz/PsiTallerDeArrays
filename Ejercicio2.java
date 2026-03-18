public class Ejercicio2 {

    public static void main(String[] args) {
        int[] stock = {10, 3, 7, 2, 15, 1, 8, 4};

        mostrar(stock);

        System.out.println("Menores a 5: " + menores5(stock));

        System.out.println("Mayor stock: " + mayor(stock));

        necesitaReposicion(stock);
    }

    public static void mostrar(int[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Producto " + i + ": " + s[i]);
        }
    }

    public static int menores5(int[] s) {
        int cont = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] < 5) {
                cont++;
            }
        }
        return cont;
    }

    public static int mayor(int[] s) {
        int m = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i] > m) {
                m = s[i];
            }
        }
        return m;
    }

    public static void necesitaReposicion(int[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] < 3) {
                System.out.println("Producto " + i + " necesita reposición");
            }
        }
    }
}