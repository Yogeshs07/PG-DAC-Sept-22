/*
	            1 
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/


class Pattern4{
	public static void main(String args[]){
		
		int count = 1;
	
		for (int i=9; i>0; i--){
			
			for (int j = 1; j <= i * 2; j++)
            {
                System.out.print(" ");
            }
			for (int j = 1; j <= count; j++)
            {
                System.out.print(j+" ");
            }
			
			for (int j = count-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
			System.out.println();
			count++;
		}
	}
}