package Usuario;

public class UserVogals {
	public static void main(String[] args) {
		String cliente = "Diego";
		String vogais = "aeiou";
		for(int i = 0; i < cliente.length() ; i++) {
			for(int j = 0; j < vogais.length();j++) {
				if(cliente.charAt(i) == vogais.charAt(j)) {
					System.out.println(cliente.charAt(i));
				}
			}
		}
	}
}
