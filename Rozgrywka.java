package program2;

import java.util.Arrays;

public class Rozgrywka {

	
	public void graj(){
		
		RzutKoscmi player1= new RzutKoscmi();
		RzutKoscmi player2= new RzutKoscmi();
		player1.rzut();
		player2.rzut();
		System.out.println(Arrays.toString(player1.getWynik()));
	  System.out.println(Arrays.toString(player2.getWynik()));
	 }
	
}
