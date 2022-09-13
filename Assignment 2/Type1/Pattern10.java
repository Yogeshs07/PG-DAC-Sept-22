/*
    E
   D E
  C D E
 B C D E
A B C D E
*/

class Pattern10{
	public static void main(String args[]){
		
		for (int i = 5; i>=0; i--){
			int alphabate = 65;
			for(int j = 0; j<i; j++){
				System.out.print(" ");
			}
			for(int j = i; j<=4; j++){
				System.out.print((char)(alphabate+(j))+" ");
				
			}
			System.out.println();
			
		}
	}
}
