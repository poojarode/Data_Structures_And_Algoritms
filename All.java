

class A{
	private int age;
	 String name;
	

	String get(){
		return name;
	}
	int set(int age){
		this.age = age;
		return age;
	}
	A(String name){
		this.name = name;
	}
}

class b extends A{
	b(String name){
		super(name);
		 
	}
	public void call(){
		get();
		set(20);
	}
}

public class All{
	public static void main(String[] args) {
		A a1=new A("pooja");
		b b1 = new A();
		b1.call();

	}
}