package fysikgrejen;

import java.util.Scanner;

public class GissaTalet {
	
	public static void main(String[] args) {
		
		int hejsan = (int)(Math.random() * 69 + 1);
		System.out.println("Välj svårighetsgrad 1:enkel 2:medel 3:svår 4:extrem");
		Scanner updog = new Scanner(System.in);
		int hej = updog.nextInt();
	
		
		if(hej==1) {
			int liv = 15;
			while(liv>0) {
				
				
				System.out.println("skriv en siffra mellan ett och 69");
				int gay = updog.nextInt();
				if(gay == hejsan) {
					
					System.out.println("Rätt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("för högt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("för lågt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du är garbage git gud" );
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
					
					System.out.println("Rätt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("för högt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("för lågt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du är garbage git gud" );
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
					
					System.out.println("Rätt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("för högt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("för lågt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du är garbage git gud" );
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
					
					System.out.println("Rätt      liv kvar: " + liv);
					
				}
				if(gay > hejsan) {
					
					liv--;
					System.out.println("för högt      liv:" + liv);
					
				}
				if(gay < hejsan) {
					
					liv--;
					System.out.println("för lågt      liv:" + liv);
					
				}
				if(liv == 0) {
					System.out.println("du är fan sämst, skjut dig själv :)" );
					break;
				}
		}
	}
		
}
}




