class AirthmeticOperations {
	
	public void add(int a, int b){
		
		System.out.print(a+b);
	}


	public void mul(int a, int b){
		
		System.out.print(a*b);

	public void sub(int a, int b){
		

		int c = a-b ;
		if(c<0){
			c=-c;
		}
		System.out.print(c);

	}
	

	public static void main(String[] args){
	
		AirthmeticOperations a = new AirthmeticOperations();

		a.add(10,20);	
		a.mul(10,20);
		a.sub(10,20);
	}
}