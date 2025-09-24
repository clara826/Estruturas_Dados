import java.util.Scanner;

public class Quest2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i < num.length; i++){
            System.out.print("digite o " + (i+1) + "º número: ");
            num[i] = scanner.nextInt();
        }
        System.out.println("-----ordem inversa dos números-----");
        for(int i = 9; i >= 0; i--){
            System.out.println((i+1) + "º número: " + num[i]);
        }
        scanner.close();
    }
}
