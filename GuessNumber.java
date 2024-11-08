import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int player_points = 10;
        int computer_points = 10;
        int min = 1;
        int max = 3;
        int maxRounds = 10;
        int round = 0;
        int player;

        while(player_points > 0 && computer_points > 0 && round < maxRounds){
            // gerar um número aleatório
            int computer = random.nextInt((max - min) + 1) + min;

            System.out.printf("Pontuação atual: %d ", player_points);
            System.out.println();


            do { // Validar o input do jogador
                System.out.print("Adivinhe o número que o computador escolheu: ");
                player = sc.nextInt();
            }while (player < min || player > max);

            // fazer compração dos valores
            if (player == computer){
                player_points += 2;
                computer_points -= 2;

                System.out.printf("Ganhou 2 pontos, o computador escolheu %d", computer);
                System.out.println();
                System.out.println("=========================================");
            }else {
                player_points -= 2;
                computer_points += 2;

                System.out.printf("voce perdeu 2 pontos, o computador escolheu %d", computer );
                System.out.println();
                System.out.println("=============================================");
            }
            round++;
        }

        // Mostrar o vencedor
        if (player_points > computer_points){
            System.out.printf("Voce ganhou com %d pontos", player_points);
        }else {
            System.out.printf("voce perdeu, o computador ganhou com %d pontos", computer_points);

        }


    }
}
