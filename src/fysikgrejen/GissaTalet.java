package fysikgrejen;

import java.util.Scanner;

public class GissaTalet {
	
	public static void main(String[] args) {
		
		int hejsan = (int)(Math.random() * 69 + 1);
		System.out.println("V�lj sv�righetsgrad 1:enkel 2:medel 3:sv�r 4:extrem");
		Scanner updog = new Scanner(System.in);
		int hej = updog.nextInt();
	
		
		if(hej==1) {
			int liv = 15;
			while(liv>0) {
				
				
				System.out.println("skriv en siffra mellan ett och 69");
				int gay = updog.nextInt();
				if(gay == hejsan) {
					
					System.out.println("R�tt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("f�r h�gt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("f�r l�gt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du �r garbage git gud" );
					break;
				}
				
			}
		}
		
		if(hej==2) {
			int liv = 10;
			while(liv>0) {
				
				
				System.out.println("skriv en siffra mellan ett och 69");
				int gay = updog.nextInt();
				if(gay == hejsan) {
					
					System.out.println("R�tt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("f�r h�gt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("f�r l�gt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du �r garbage git gud" );
					break;
				}

				
			}
		}
		
		if(hej==3) {
			int liv = 5;
			while(liv>0) {
				
				System.out.println("skriv en siffra mellan ett och 69");
				int gay = updog.nextInt();
				if(gay == hejsan) {
					
					System.out.println("R�tt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("f�r h�gt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("f�r l�gt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du �r garbage git gud" );
					break;
				}
	
			}
				
		}
		if(hej==4) {
			int liv = 1;
			while(liv>0) {
				
				
				System.out.println("skriv en siffra mellan ett och 69");
				int gay = updog.nextInt();
				if(gay == hejsan) {
					
					System.out.println("R�tt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("f�r h�gt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("f�r l�gt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du �r fan s�mst, skjut dig sj�lv :)" );
					break;
				}
		}
	}
		
}
}




