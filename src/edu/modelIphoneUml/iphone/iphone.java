package edu.modelIphoneUml.iphone;

import edu.modelIphoneUml.functionalityIphone.internet;
import edu.modelIphoneUml.functionalityIphone.musicPlayer;
import edu.modelIphoneUml.functionalityIphone.phone;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.net.URL;

public class iphone implements musicPlayer, phone, internet {

	String music;
	boolean isPlay = false;

	// Expressão regular para números de telefone
	private static final String REGEX_TELEFONE = "\\(\\d{2}\\)\\s?\\d{4,5}-\\d{4}";

	@Override
	public void play() {
		if (this.music == null || this.music.isEmpty()) {
			System.out.println("Nenhuma música foi selecionada!");
		} else if (this.isPlay) {
			this.stop();
		} else {
			System.out.println("A música foi iniciada!");
			this.isPlay = true;
		}
	}

	@Override
	public void stop() {
		if (this.music.isEmpty()) {
			System.out.println("Nenhuma música foi selecionada!");
		}

		if (!this.isPlay) {
			this.play();
		} else {
			System.out.println("A  música foi parada!");
			this.isPlay = false;
		}

	}

	@Override
	public void selectMusic(String nameMusic) {
		this.music = nameMusic;
		System.out.println("Música " + nameMusic + " selecionada!");
	}

	@Override
	public void call(String number) {

		if (checkPhoneNumber(number)) {
			System.out.println("Ligando para o número " + number + "!");
		} else {
			System.out.println("Telefone fora do formato válido. Por favor, use o seguinte formato: (11) 12345-6789");
		}
	}

	@Override
	public void takeCall() {
		System.out.println("Ligação atentida");

	}

	@Override
	public void voicemail() {
		System.out.println("Voicemial ativiado!");

	}

	@Override
	public void page(String url) {
		if (isValidURL(url)) {
			System.out.println("Acessando site " + url + "!");
		} else {
			System.out.println("Url inválido.");
		}

	}

	@Override
	public void newTab() {
		System.out.println("Nova aba criada");

	}

	@Override
	public void refreshPage() {
		System.out.println("Página atualizada");

	}

	public static boolean checkPhoneNumber(String telefone) {
		Pattern pattern = Pattern.compile(REGEX_TELEFONE);
		Matcher matcher = pattern.matcher(telefone);
		return matcher.matches();
	}

	public static boolean isValidURL(String url) {
		try {
			new URL(url).toURI(); // Verifica a sintaxe
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
