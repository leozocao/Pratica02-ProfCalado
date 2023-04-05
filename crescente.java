import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorA, valorB, valorC;

        System.out.print("Digite o primeiro valor: ");
        valorA = teclado.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valorB  = teclado.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        valorC = teclado.nextDouble();

        if(valorA < valorB && valorB < valorC) {
            System.out.printf("%.2f, %.2f, %.2f", valorA, valorB, valorC);
        }

        if(valorA < valorC && valorC < valorB) {
            System.out.printf("%.2f, %.2f, %.2f", valorA, valorC, valorB);
        }

        if(valorB < valorA && valorA < valorC) {
            System.out.printf("%.2f, %.2f, %.2f", valorB, valorA, valorC);
        }

        if(valorB < valorC && valorC < valorA) {
            System.out.printf("%.2f, %.2f, %.2f", valorB, valorC, valorA);
        }

        if(valorC < valorA && valorA < valorB) {
            System.out.printf("%.2f, %.2f, %.2f", valorC, valorA, valorB);
        }

        if(valorC < valorB && valorB < valorA) {
            System.out.printf("%.2f, %.2f, %.2f", valorC, valorB, valorA);
        }


        teclado.close();

    }
    
}
