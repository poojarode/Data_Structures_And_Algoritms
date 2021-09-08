public class Anagram{

	public static void main(String[] args) {
		String a = "cat";
		String b = "act";
		boolean isAna = false;
		boolean visited[] = new boolean[b.length()];
		if(a.length() == b.length()){

		for (int i = 0; i < a.length();i++){
			char c = a.charAt(i);
			isAna = false;
			for (int j=0;j<b.length() ;j++ ) {
			 	if(b.charAt(j) == c && !visited[j]){
			 		visited[j] =true;
			 		isAna = true;
			 		break;
			 	}
			 } 

			 if(! isAna){
			 	break;
			 }
		}	

	}
	if (isAna) {
		System.out.println("Anagram");
	}else{
		System.out.println("Not a Anagram");
	}
}
}
