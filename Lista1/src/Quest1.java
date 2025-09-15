import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            num[i] = scanner.nextInt();
        }
        System.out.println("---- Ordem inversa das respostas ----");
        for (int i = 4; i >= 0; i--){
            System.out.println((i + 1) + "º numero: " + num[i]);
        }
        scanner.close();
    }
}
