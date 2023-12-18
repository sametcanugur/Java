package fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// 1 1 2 3 5 8 13 21 34 55
		
				int num1=0;
				int num2=1;
				
				System.out.print(num1);
				for(int i=0;  i<10; i++){
				    
				    num2=num2+num1;
				    num1=num2-num1;
				    System.out.print(num2);

	
	
	}

}
}