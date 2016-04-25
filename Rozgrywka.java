package program2;

import java.util.Arrays;

public class Rozgrywka {

	
	public void graj(){
		
		RzutKoscmi player1= new RzutKoscmi();
		RzutKoscmi player2= new RzutKoscmi();
		player1.rzut();
		player2.rzut();
		//wywala cala tablice ale tylko jako string
		System.out.println(Arrays.toString(player1.getWynik()));
	  System.out.println(Arrays.toString(player2.getWynik()));
	 
	 	//wywala po kolei kazda wartosc, zrobic metode?
	 for (int i=0;i<5;i++){
	    System.out.println(player1.getWynik()[i]+"    "+player2.getWynik()[i]);
	 } 
		
		
		
	}
	 
	
}
