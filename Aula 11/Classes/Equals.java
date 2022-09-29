package classes;

public class Equals {

	public static void main(String[] args) throws Exception {

		Usuario user1 = new Usuario();
		user1.nome = "Arthur Aloise";
		user1.gmail = "tutu@gmail.com";

		Usuario user2 = new Usuario();
		user2.nome = "Arthur Aloise";
		user2.gmail = "tutu@gmail.com";

		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		System.out.println(user2.equals(user1));
	}
}
