import static java.lang.System.out;
public class Main1{
	static String name = "pooja";
	public static void main(String[] args) {
		//out.println(name);
		//String name = "yash";
		//out.println(name);
		Main1 m1 = new Main1();
		Main1 m2 = new Main1();
		m2 = ObjectPlayer(m1);
		out.println(m2.name);
		out.println(m1.name);
		new Main1();
	}
	Main1(){
		out.println(name);
		String name = "yash";
		out.println(name);
		out.println(this.name);
	}

	public static Main1 ObjectPlayer(Main1 m){
		m.name = "Pooja" + "rode";
		return m;
	}
}