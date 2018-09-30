import java.util.Scanner;

public class ett
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	int x = input.nextInt();
	int y = input.nextInt();
	
	input.close();
	
	if(y<x) { 
		System.out.println("min " + y);
			}
	
	else if(x<y) {
		
		System.out.println("min " + x);
	}
	
}

}
