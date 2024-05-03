package Prova2;

import java.util.Random;

public class Pedagio {
   
	public static void main(String[] args) {

        double tarifaCarro = 10.85, tarifaMoto = 4.32, tarifaCaminhao = 54.98;
        int totalVeiculos = 300, carros = 0, motos = 0, caminhoes = 0;

        Random random = new Random();
        for (int i = 0; i < totalVeiculos; i++) {
            int tipoVeiculo = random.nextInt(3);
            
            if (tipoVeiculo == 0) {
                carros++;
            } else if (tipoVeiculo == 1) {
                motos++;
            } else {
                caminhoes++;
            }
        }

        double porcentagemCarros = (carros * 100.0) / totalVeiculos;
        double porcentagemMotos = (motos * 100.0) / totalVeiculos;
        double porcentagemCaminhoes = (caminhoes * 100.0) / totalVeiculos;

        double valorCarros = carros * tarifaCarro;
        double valorMotos = motos * tarifaMoto;
        double valorCaminhoes = caminhoes * tarifaCaminhao;

        double valorTotal = valorCarros + valorMotos + valorCaminhoes;

        System.out.println("Quantidade de veículos:");
        System.out.println("Carros: " + carros);
        System.out.println("Motos: " + motos);
        System.out.println("Caminhões: " + caminhoes);

        System.out.println("\nPorcentagem de veículos:");
        System.out.println("Carros: " + porcentagemCarros + "%");
        System.out.println("Motos: " + porcentagemMotos + "%");
        System.out.println("Caminhões: " + porcentagemCaminhoes + "%");

        System.out.println("\nValor arrecadado por tipo de veículo:");
        System.out.println("Carros: R$" + valorCarros);
        System.out.println("Motos: R$" + valorMotos);
        System.out.println("Caminhões: R$" + valorCaminhoes);

        System.out.println("\nValor total arrecadado no pedágio: R$" + valorTotal);
    }
}