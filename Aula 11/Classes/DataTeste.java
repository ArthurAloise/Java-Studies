package classes;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(04, 03, 2000);
		
		Data d2 = new Data();
		
		System.out.println(d1.dateFormat());
		System.out.printf(d2.dateFormat());
	}

}
