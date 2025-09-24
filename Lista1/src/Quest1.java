import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            num[i] = scanner.nextInt();
        }
        System.out.println("---- números digitados ----");
        System.out.print("[ ");
        for (int i = 0; i < 5; i++){
            System.out.print(num[i] + " ");
        }
        System.out.print("]");
        scanner.close();
    }
}
