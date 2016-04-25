package program1;

import java.util.Random;
import java.util.Arrays;

public class Kosci //extends RzutKoscmi  
{

		
	public int[] Throw(){
		int[] throw1=new int[5];
		
		for (int i=0 ; i<throw1.length; i++){
		throw1[i]=Rng(6);
		}
		return throw1;
	    
	}	
	public static int Rng(int i){
		
		Random r=new Random();
		return r.nextInt(i)+1;
	}
	public static int[] Wynik(int[] throw2,String[] figura){
	
		int[] namenScore=new int[2];
		int[] mstrit= {1,2,3,4,5};
		int[] dstrit= {2,3,4,5,6};
		namenScore[1]=0;
		if (Arrays.equals(throw2, mstrit)){namenScore[0]=7;namenScore[1]=15;}		
		else if (Arrays.equals(throw2, dstrit )){namenScore[0]=8;namenScore[1]=20;}
		else{
			for (int i=0;i<4;i++){
				
				if	(throw2[i]==throw2[(i+1)]&&i==0){ 
					namenScore[0]=namenScore[0]+1;//para z pierwszej pozycji
					namenScore[1]=namenScore[1]+throw2[i]+throw2[i+1];
					if	(throw2[2]==throw2[3]&&throw2[2]==throw2[4]&&throw2[i]!=throw2[2]){ //aabbb
						namenScore[0]=6;
						for(int j=0;j<5;j++){namenScore[1]=namenScore[1]+throw2[i];}
						break;}
					else if (throw2[2]==throw2[3]&&throw2[0]!=throw2[3]&&throw2[0]!=throw2[2]){// aabbc
						namenScore[0]=5;
						namenScore[1]=throw2[0]+throw2[1]+throw2[2]+throw2[3];
						break;}	
					else if (throw2[3]==throw2[4]&&throw2[0]!=throw2[3]&&throw2[0]!=throw2[2]){// aabcc
						namenScore[0]=5;
						namenScore[1]=throw2[0]+throw2[1]+throw2[3]+throw2[4];
						break;}	
				} 
				
				
				else if (throw2[i]==throw2[(i+1)]){
					namenScore[0]=namenScore[0]+1;
					if (namenScore[0]==1){namenScore[1]=namenScore[1]+throw2[i]*2;}
					else{namenScore[1]=namenScore[1]+throw2[i];}
					
						if (i==2&&namenScore[0]==2&&throw2[3]==throw2[4]&&throw2[0]!=throw2[1]&&throw2[0]!=throw2[2]) { //aaabb
						namenScore[0]=6;
						for(int j=0;j<5;j++){namenScore[1]=namenScore[1]+throw2[i];}
						break;
						}
						
					else if (throw2[i]==throw2[(i+1)]&&i==1&&throw2[(i+2)]==throw2[(i+3)]&&throw2[i]!=throw2[(i+2)]){ //dwie pary abbcc
						namenScore[0]=5;
						namenScore[1]=throw2[1]+throw2[2]+throw2[3]+throw2[4];
						break;}		
				}
			
			}
	    }
				
		return namenScore;
		
	}		
	
	
	
	public static void main(String[] args){
		
		Kosci player1=new Kosci();
		Kosci player2=new Kosci();
		int[] player1Throw=player1.Throw();
		int[] player2Throw=player2.Throw();
		
		String[] figury= new String[9];
		figury[0]="nic";
		figury[1]="para";
		figury[2]="trójka";
		figury[3]="kareta";
		figury[4]="poker";
		figury[5]="dwie pary";
		figury[6]="full";
		figury[7]="mały strit";
		figury[8]="duży strit";
		/*//pętla do testów
		for (int i=0;i<5;i++){
			player1Throw[i]=3;
		}
		player1Throw[0]=1;
		player1Throw[1]=2;
		*/		
		Arrays.sort(player1Throw);
		Arrays.sort(player2Throw);
		System.out.println("gracz 1   gracz2");		
		for (int i=0; i<5; i++){
			System.out.println("   "+player1Throw[i] + "         " + player2Throw[i]);
		}
		int[] score1=Wynik(player1Throw, figury);
		int[] score2=Wynik(player2Throw, figury);
		System.out.println("  "+figury[score1[0]]+"    "+figury[score2[0]]);
		System.out.println("  "+score1[1]+"          "+score2[1]);
		if (score1[1]>score2[1]){System.out.println("Wygrał gracz 1");}
		else {System.out.println("Wygrał gracz 2");}
	}
		
	
}

