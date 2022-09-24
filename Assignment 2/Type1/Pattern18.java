/*
A B C D E
A B C D
A B C
A B
A
*/

class Pattern18{
	public static void main(String args[]){
		int c = 5;
		for (int i = 1; i<=5; i++){
			for(int j = 1; j<=c; j++){
				System.out.print((char)(j+64));
				System.out.print(" ");	
			}			
			System.out.println();
			c--;
		}
	}
}
