package classes;

public class ValorNull {
	
	public static void main(String[] args) {
		
		String item = "";
		System.out.println(item.concat("!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.dateFormat());
		}
		
		String item1 = Math.random() > 0.5 ? "Fala comigo!":null;
		
		if(item1 != null) {
			System.out.println(item1.concat("????"));
		}
	}

}
