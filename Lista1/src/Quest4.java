import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] vetor = new char[10];
        int consoantes = 0;
        for (int i = 0; i < vetor.length ; i++){
            System.out.print("Digite o "+ (i+1) + "º caractere: ");
            vetor[i] = scanner.next().charAt(0);
        }
        for (int i = 0; i < vetor.length; i++){
            char c = Character.toLowerCase(vetor[i]);
            if (c >= 'a' && c <= 'z' &&
                    c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {

                System.out.print(vetor[i] + " ");
                consoantes++;
            }
        }
        System.out.println("\nTotal de consoantes: " + consoantes);
        scanner.close();
    }
}
