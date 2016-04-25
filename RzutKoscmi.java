package program2;

import java.util.Random;

public class RzutKoscmi {
	int[] wynik;
	
	public RzutKoscmi(){
		wynik = new int[5];
		
	}
	
	public void rzut(){
		for (int i=0 ; i<wynik.length; i++){
		wynik[i]=Rng(6);
		
		}
	}
	
	int Rng(int i){
			
			Random r=new Random();
			return r.nextInt(i)+1;
	}
	int[] getWynik(){
	return wynik;
		
	}
	
	
}
