package edu.modelIphoneUml;

import java.util.Scanner;

import edu.modelIphoneUml.iphone.iphone;

public class Main {

	public static void main(String[] args) {

		iphone celular = new iphone();
		int aplication = 0;
		boolean isTurnOn = true;

		while (isTurnOn) {

			System.out.println("Selecione um aplicativo: ");
			System.out.println("1) Música");
			System.out.println("2) Telefone");
			System.out.println("3) Celular");
			System.out.println("4) Desligar")

			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o aplicativo:");

			// Verifica se o valor digitado é um número
			if (scanner.hasNextInt()) {
				// Lê o valor digitado pelo usuário
				aplication = scanner.nextInt();
				if (aplication >= 5) {
					System.out.println("A aplicação não está disponível.");
				} else {
					switch (aplication) {
					case 1: {

						System.out.println("Selecione uma função no aplicativo: ");
						System.out.println("1) Tocar/Parar música");
						System.out.println("2) Mudar de música");

					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + scanner);
					}
				}
			} else {
				System.out.println("O valor digitado é incorreto.");
			}
			scanner.close();

		}

	}
}
