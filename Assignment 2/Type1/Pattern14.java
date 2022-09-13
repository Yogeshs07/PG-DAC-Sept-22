class Pattern14{
	public static void main(String args[]){
		int count = 5;
		for(int i=1; i<=5;i++){
			for(int j=1; j<=count; j++){
				System.out.print(j+" ");
			}
			count --;
			System.out.println();
		}
	}
}