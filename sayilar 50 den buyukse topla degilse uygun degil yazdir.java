/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sayi girin");
		
		int num1 = reader.nextInt();

	    System.out.println("Sayi girin");
	    
	    int num2 = reader.nextInt();
	    
	    int sum=0;
	    
	    if(num1>50 && num2>50){        
	        sum=num1+num2;
	    System.out.println(sum);
	    }
	    
	    else
	        System.out.println("sayilar uygun degil");
	    
	    

	}
}

