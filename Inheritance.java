
interface c {
	public void addme();

}
class A implements c{
	private String name = "Pooja";
	private int rn;
	

	public A(int rn){
		System.out.println("In A");
		this.rn = rn;
		System.out.println(rn);
	}
	public void addme(){
 		int a =20, b = 5, c =0;
 		c = a+b;
 		System.out.println(c);
 	}
	public String GetName(){
		System.out.println("In A");
		return name;
	}
}

class B extends A implements c{
 	public float marks = 9.91f;
 	public B(int rn){
 		
 		super(rn);
 		System.out.println("In B");

 	}
 	public void addme(){
 		int a =15, b = 5, c =0;
 		c = a+b;
 		System.out.println(c);
 	}
    @Override
 	public String GetName(){
 		System.out.println("In B");
 		System.out.println(marks);
 		return "marks";
 	}
}




public class Inheritance{
public static void main(String[] args) {
	//B b = new B(10);
	A a1 = new A(10);
	a1.addme();
	//A a = b;
	float marks = 100.00f;
	B b = new B(10);
	b.addme();
	A a = new A(50);
	c c1 = a;
	c1.addme();
	//String p =  b.GetName();
	 //String s = a1.GetName(10);
	//System.out.println(s);
	//System.out.println(p);
}
}