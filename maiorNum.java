import java.util.Scanner;

public class maiorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int y = sc.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int z = sc.nextInt();

        int maior = x;

        if (y > maior) {
            maior = y;
        }

        if (z > maior) {
            maior = z;
        }

        System.out.println("Maior valor: " + maior);

        sc.close();
    }
}
