package classeAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo ("Lola", "Femea","Lobo Guará");
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		Leao leao = new Leao ("Simba", "Masculino", "Leão Sul Africano");
		leao.caminhar();
		leao.correr();
		leao.dormir();
		leao.emitirSom();
		
		Tigre tigre = new Tigre ("Sonoda", "Masculino", "Toyger");
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro ("Marcinho", "Fêmea", "Pequinês");
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		cachorro.emitirSom();
		
		Gato gato = new Gato ("Maria", "Femea", "birmamês");
		gato.caminhar();
		gato.correr();
		gato.dormir();
		gato.emitirSom();
		}
		}

	


