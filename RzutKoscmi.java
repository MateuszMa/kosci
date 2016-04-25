ackage program1;

import java.util.Random;

public class RzutKoscmi {

int[] wynik;	
	

	public RzutKoscmi(int[] w){
	wynik = w;
	
	}
	public int[] rzut(){
		
	for (int i=0 ; i<6; i++){
		wynik[i]= Rng(6);
		}
		return wynik;
	}
		
	
}
