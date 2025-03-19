package edu.modelIphoneUml;

import java.util.Scanner;

import edu.modelIphoneUml.iphone.iphone;

public class Main {

	public static void main(String[] args) {

		iphone smartphone = new iphone();
		int aplicationSelect = 0;
		int functionSelect = 0;
		boolean isTurnOn = true;
		Scanner function = new Scanner(System.in);
		String informationFunction;

		while (isTurnOn) {

			boolean exitApp = false;

			System.out.println("Selecione um aplicativo: ");
			System.out.println("1) Música");
			System.out.println("2) Telefone");
			System.out.println("3) Celular");
			System.out.println("4) Desligar");

			System.out.println("Digite o aplicativo:");

			// Verifica se o valor digitado é um número
			if (function.hasNextInt()) {

				// Lê o valor digitado pelo usuário
				aplicationSelect = function.nextInt();

				if (aplicationSelect >= 5) {
					System.out.println("A aplicação não está disponível.");
				} else {
					switch (aplicationSelect) {
					case 1: {

						while (!exitApp) {
							
							System.out.println("Selecione uma função no aplicativo: ");
							System.out.println("1) Tocar/Parar música");
							System.out.println("2) Mudar de música");
							System.out.println("3) Sair");
							
							if (function.hasNextInt()) {

								functionSelect = function.nextInt();
								if (aplicationSelect >= 4) {
									System.out.println("A aplicação não está disponível.");
								} else {

									switch (functionSelect) {
									case 1: {
										smartphone.play();
										break;
									}
									case 2: {
										System.out.print("Digite a muúsica:");
										function = new Scanner(System.in);
										informationFunction = function.nextLine();
										smartphone.selectMusic(informationFunction);
										break;

									}
									case 3: {
										System.out.println("Saindo da aplicação");
										exitApp = true;
										break;

									}
									}

								}

							} else {
								System.out.println("O valor digitado é incorreto.");
							}

						}
						break;
					}
					case 2: {

						System.out.println("Selecione uma função no aplicativo: ");
						System.out.println("1) Tocar/Parar música");
						System.out.println("2) Mudar de música");

					}
					case 3: {

						System.out.println("Selecione uma função no aplicativo: ");
						System.out.println("1) Ligar");
						System.out.println("2) Mudar de música");

					}
					case 4: {
						System.out.println("Desligando telefone");
						isTurnOn = false;
					}

					}
				}
			} else {
				System.out.println("O valor digitado é incorreto.");
			}

		}
		function.close();

	}
}
