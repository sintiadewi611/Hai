import java.util.Scanner;


public class Stars {
	public void printStars(){
	
	
	int x;
		Scanner input = new Scanner(System.in);

	System.out.println("Masukkan Nilai : ");
	x=input.nextInt();

	for(int i=0;i<x;i++){
		
			for(int j=0;j<x;j++){
		System.out.print("*");
		
	}
	System.out.println("");
	}
	}
	
}