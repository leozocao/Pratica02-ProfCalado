import java.util.Scanner;

public class maior{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Digite um número: ");
        a = teclado.nextDouble();
        System.out.print("Digite outro número: ");
        b = teclado.nextDouble();

        if(a > b) {
            System.out.print("O maior número é: " + a);
        }
        else {
                System.out.println("O maior número é: " + b);
            
        }

        teclado.close();

    }
}