class AbstractInterface{
	public static void main(String[] args) {
		B b = new B();
		b.hi();
		b.hello();
		b.wish();
		D d = new D();
		d.wish();
		d.trycatch(0);
	}
}
 interface C{
	void wish();
	default void trycatch(int b){
		try{
		int a = 10;
		int c = a/b;
			}catch(Exception e){
			e.p
			rintStackTrace();
		}
	}
}
abstract class A{
	final String a = "pooja";
	abstract void hi();
	abstract void hello();
}

class B extends A{
	 void hi(){
	 	System.out.println("Hiii " + a);
	 }
	 void hello(){
	 	System.out.println("Hello " + a);
	 }
	 public void wish(){
	 	System.out.println("Good morning " + a);
	 }
	
}
class D implements C{
	public void wish(){
	 	System.out.println("Good morning ");
	 }
}