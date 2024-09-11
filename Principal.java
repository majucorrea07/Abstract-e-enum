package classeAbstrata;

public class Principal {
	public static void main(String[] args) {
		Carro ferrari = new Carro("00000","F1","Vermelho",2023); 
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		Carro porsche = new Carro ("22222","GT3 RS","Cinza",2022);
		porsche.acelerar();
		porsche.frear();
		porsche.virar();
		porsche.ligar();
		
		System.out.println("-----------------------");
		
		Onibus marcopolo = new Onibus("11111", "XB1", "Prata", 2020); 
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("-----------------------");
		
		Moto XRE = new Moto("77777", "300cc", "Preta", 2021); 
		XRE.acelerar();
		XRE.frear();
		XRE.ligar();
		XRE.virar();
		
	}

}
