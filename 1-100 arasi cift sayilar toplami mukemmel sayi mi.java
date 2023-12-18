/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
	
	    int toplam=0;
	    int count=0;
	    
	    for(int i=1; i<101; i++){
	        
	        if(i%2==0){
	            
	            toplam=toplam+i;
	            }
	        
	    }
	        for(int j=1; j<toplam; j++){
	        
	        if(toplam%j==0){
		        
		        count=count+j;
		    }
		       
		        }
		    
		    
		    if(count==toplam){
		        
		        System.out.println("Sayi mukemmel sayidir");
		    }
		    
		    else{
		     
		     System.out.println("Sayi mukemmel sayi degildir");
		}

	        
	        
	    }
	    
	    
	  	}

