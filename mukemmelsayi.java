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
		
		int sayi = reader.nextInt();
		int count=0;
		
		for(int i=1; i<sayi; i++){
		    
		    if(sayi%i==0){
		        
		        count=count+i;
		    }
		       
		        }
		    
		    
		    if(count==sayi){
		        
		        System.out.println("Sayi mukemmel sayidir");
		    }
		    
		    else{
		     
		     System.out.println("Sayi mukemmel sayi degildir");
		}
		    
		    
		}
		    
		
	 }
		    

		
    
