class Pattern8{
	public static void main(String args[]){
		int a;
		for(int i=5; i>=1; i--){
			a = i;
			for(int k=1; k<i; k++){
				System.out.print(" ");
			}
			for(int j=5; j>=i; j--){
				System.out.print(a+" ");
				a++;
			}
			
		System.out.println();
		
		}
	}
}