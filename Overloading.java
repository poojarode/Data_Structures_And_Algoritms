class Fun{
	int a , b;
	Fun(int a , int b){
		this.a = a;
		this.b = b;
	}
	int sum(){
		int c = a + b ;
		return c;
	}

	void sum(int a){
		int c = a*a;
		System.out.println("square of " + a + "is :" + c);
	}
}
class Overloading{
	public static void main(String[] args) {
		Fun f =new Fun(10, 20);
		System.out.println(f.sum());
		f.sum(10);
	}
} 