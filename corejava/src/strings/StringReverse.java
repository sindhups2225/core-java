package strings;

public class StringReverse {

	public static void main(String[] args) {
String s="pooja";
StringBuilder reverse = new StringBuilder();

for(int i = s.length()-1; i > 0; i--){
	reverse =reverse.append(s.charAt(i));
	
}
System.out.println(reverse);


	}

}