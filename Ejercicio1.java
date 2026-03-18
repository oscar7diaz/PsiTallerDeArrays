public class Ejercicio1 {

    public static void main(String[] args) {

        double[] temperaturas = {22.5, 24.0, 19.8, 21.0, 25.3, 23.1, 20.0};

        mostrar(temperaturas);

        double promedio = promedio(temperaturas);
        System.out.println("Promedio: " + promedio);

        System.out.println("Mayor: " + mayor(temperaturas));

        mayoresPromedio(temperaturas, promedio);
    }

    public static void mostrar(double[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("Día " + (i+1) + ": " + t[i]);
        }
    }

    public static double promedio(double[] t) {
        double suma = 0;
        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return suma / t.length;
    }

    public static double mayor(double[] t) {
        double m = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > m) {
                m = t[i];
            }
        }
        return m;
    }

    public static void mayoresPromedio(double[] t, double p) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] > p) {
                System.out.println("Mayor al promedio: " + t[i]);
            }
        }
    }
}