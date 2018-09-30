import java.util.Scanner;

public class Spavanac {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	int H = input.nextInt();
	
	int M = input.nextInt();
	
	M = M - 45;
	if(M < 0) {
		
		M = (60 + M);
		
		H = H - 1;
	
		if(H < 0); {
			
			H = 23;
			
			input.close();
			
		}
		
	}
	
	System.out.println(H + " " + M);
	
}
}
