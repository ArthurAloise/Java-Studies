package classes;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
	double a = 2;
	double b = a; //Atribuição por valor(Tipo primitivo).
	
	a++;
	b--;
	
	System.out.println(a + " " + b);
	
	Data d1 = new Data(04,03,2000);
	Data d2 = d1; //Atribuição por referância(Objetos).
	
	d1.dia=31;
	d2.mes=01;
	
	System.out.println(d1.dateFormat());
	System.out.println(d2.dateFormat());
	
	DatePattern(d1);
	
	System.out.println(d1.dateFormat());
	System.out.println(d2.dateFormat());
    }

	static void DatePattern(Data zero) {
		zero.dia = 1;
		zero.mes = 1;
		zero.ano = 1970;
	}
}
