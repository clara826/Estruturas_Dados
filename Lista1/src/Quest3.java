import java.util.Scanner;
public class Quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double[] nota = new double[4];
        for ( int i = 0; i < nota.length; i++) {
            System.out.print("Digite a " + (i + 1) + "º nota: ");
            nota [i] = scanner.nextDouble();
            soma += nota[i];
        }
        double media = soma / nota.length;

        System.out.println("---Notas e média---");
        for (int i = 0; i < nota.length; i++) {
            System.out.println((i + 1) + "º nota: " + nota[i]);
        }
        System.out.println("Média = "+ media);
        scanner.close();
    }
}
