package edu.modelIphoneUml.iphone;

import edu.modelIphoneUml.functionalityIphone.musicPlayer;

public class iphone implements musicPlayer{

	String music;
	boolean isPlay = false; 

	
	@Override
	public void play() {
		if(this.music.isEmpty()) {
			System.out.println("Nenhuma música foi selecionada!");
		}
		
		if(this.isPlay) 
		{
			this.stop();
		} else {
		System.out.println("A música foi iniciada!");
		this.isPlay = true;
		}
	}

	@Override
	public void stop() {
		if(this.music.isEmpty()) {
			System.out.println("Nenhuma música foi selecionada!");
		}
		
		if(!this.isPlay) {
			this.play();
		} else { 
		System.out.println("A  música foi parada!");
		this.isPlay = false;
		}
		
	}

	@Override
	public void selectMusic(String nameMusic) {
		this.music = nameMusic;
		System.out.println("Música "+nameMusic+ " selecionada!");		
	}
	
	

}
