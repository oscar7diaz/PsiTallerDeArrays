public class Ejercicio5 {

    public static void main(String[] args) {
        double[] notas = {3.5, 2.8, 4.0, 1.9, 3.2, 4.5, 2.5, 3.8};

        mostrar(notas);

        double prom = promedio(notas);
        System.out.println("Promedio: " + prom);

        System.out.println("Aprobados: " + aprobados(notas));
        System.out.println("Reprobados: " + reprobados(notas));

        mayorMenor(notas);
    }

    public static void mostrar(double[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static double promedio(double[] n) {
        double suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma += n[i];
        }
        return suma / n.length;
    }

    public static int aprobados(double[] n) {
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 3.0) {
                cont++;
            }
        }
        return cont;
    }

    public static int reprobados(double[] n) {
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 3.0) {
                cont++;
            }
        }
        return cont;
    }

    public static void mayorMenor(double[] n) {
        double mayor = n[0];
        double menor = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > mayor) mayor = n[i];
            if (n[i] < menor) menor = n[i];
        }

        System.out.println("Mayor nota: " + mayor);
        System.out.println("Menor nota: " + menor);
    }
}