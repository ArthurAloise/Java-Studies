package controle;

public class Continue {
	public static void main(String[] args) {
		//Demonstra��o 1;
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 ==1) {
				continue;
			}
			System.out.println(i);
		}
		//Demonstra��o 2;
        for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
