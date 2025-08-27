import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String jogarNovamente;

        do {
            int numeroSecreto = random.nextInt(100) + 1;
            int tentativas = 0;
            int chute = 0;

            System.out.println("\n★ Bem-vinda ao Jogo da Adivinhação! ★");
            System.out.println("Tente adivinhar o número entre 1 e 100.");

            while (chute != numeroSecreto) {
                System.out.print("Digite seu chute: ");
                chute = sc.nextInt();
                tentativas++;

                if (chute < numeroSecreto) {
                    System.out.println("🔼 O número é maior!");
                } else if (chute > numeroSecreto) {
                    System.out.println("🔽 O número é menor!");
                } else {
                    System.out.println("🎉 Você acertou!");
                    System.out.println("Tentativas feitas: " + tentativas);
                }
            }

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            sc.nextLine(); // limpa o buffer
            jogarNovamente = sc.nextLine().trim().toUpperCase();

        } while (jogarNovamente.equals("S"));

        System.out.println("👋 Obrigada por jogar! Até a próxima.");
        sc.close();
    }
}