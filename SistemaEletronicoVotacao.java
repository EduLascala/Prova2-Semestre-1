package Prova2;

import java.util.Scanner;

public class SistemaEletronicoVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEleitores = 0;
        int votosA = 0, votosB = 0, votosC = 0;

        System.out.println("Sistema Eletrônico de Votação");
        System.out.println("-------------------------------");

        while (true) {
            System.out.print("Digite o número do título de eleitor (ou 0 para encerrar): ");
            int tituloEleitor = scanner.nextInt();

            if (tituloEleitor == 0) {
                break;
            }

            totalEleitores++;

            System.out.println("Opções de voto:");
            System.out.println("A - Candidato A");
            System.out.println("B - Candidato B");
            System.out.println("C - Candidato C");

            System.out.print("Digite a opção de voto: ");
            String voto = scanner.next();

            switch (voto.toUpperCase()) {
                case "A":
                    votosA++;
                    break;
                case "B":
                    votosB++;
                    break;
                case "C":
                    votosC++;
                    break;
                default:
                    System.out.println("Opção de voto inválida!");
                    break;
            }
        }

        double percentualVotosA = (double) votosA / totalEleitores * 100;
        double percentualVotosB = (double) votosB / totalEleitores * 100;
        double percentualVotosC = (double) votosC / totalEleitores * 100;

        System.out.println("\nResultados da Votação");
        System.out.println("----------------------");
        System.out.println("Quantidade total de eleitores: " + totalEleitores);
        System.out.println("Quantidade de votos para o Candidato A: " + votosA);
        System.out.println("Quantidade de votos para o Candidato B: " + votosB);
        System.out.println("Quantidade de votos para o Candidato C: " + votosC);
        System.out.println("Porcentagem de votos para o Candidato A: " + percentualVotosA + "%");
        System.out.println("Porcentagem de votos para o Candidato B: " + percentualVotosB + "%");
        System.out.println("Porcentagem de votos para o Candidato C: " + percentualVotosC + "%");

        if (votosA > votosB && votosA > votosC) {
            System.out.println("O candidato vitorioso é o Candidato A.");
        } else if (votosB > votosA && votosB > votosC) {
            System.out.println("O candidato vitorioso é o Candidato B.");
        } else if (votosC > votosA && votosC > votosB) {
            System.out.println("O candidato vitorioso é o Candidato C.");
        } else {
            System.out.println("A eleição terminou em empate.");
        }
    }
}