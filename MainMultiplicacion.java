import java.util.Scanner;

class MainMultiplicacion{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa un valor: ");
        int n1 = fn.nextInt();

        System.out.print("Ingresa otro valor: ");
        int n2 = fn.nextInt();

        Multiplicacion m1 = new Multiplicacion();

        m1.setN1(n1);
        m1.setN2(n2);

        m1.multiplicar();
        m1.mostrarRes();
    }
}