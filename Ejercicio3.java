public class Ejercicio3 {

    public static void main(String[] args) {
        int[] edades = {15, 18, 20, 17, 22, 16, 19, 21, 14, 23};

        mostrar(edades);

        System.out.println("Mayores de edad: " + mayoresEdad(edades));

        double prom = promedio(edades);
        System.out.println("Promedio: " + prom);

        debajoPromedio(edades, prom);
    }

    public static void mostrar(int[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public static int mayoresEdad(int[] e) {
        int cont = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] >= 18) {
                cont++;
            }
        }
        return cont;
    }

    public static double promedio(int[] e) {
        double suma = 0;
        for (int i = 0; i < e.length; i++) {
            suma += e[i];
        }
        return suma / e.length;
    }

    public static void debajoPromedio(int[] e, double p) {
        int cont = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] < p) {
                cont++;
            }
        }
        System.out.println("Debajo del promedio: " + cont);
    }
}
