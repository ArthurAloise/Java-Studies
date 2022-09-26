package classes;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.1416;
	
	AreaCirc(double areaInicial){
		raio = areaInicial;
	}
	
	double area(){
		return pi* Math.pow(raio, 2);
	}

}
