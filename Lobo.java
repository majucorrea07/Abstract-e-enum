package classeAbstrata;

public class Lobo extends Animal {

		public Lobo(String nome, String sexo, String raca) {
			super(nome, sexo, raca);
     }
		public void dormir() {
			System.out.println("O lobo está dormindo");
		}
		public void caminhar() {
			System.out.println("O lobo está caminhando");
		}
		public void correr() {
			System.out.println("O lobo está correndo");
		}
		public void emitirSom() {
			System.out.println("O lobo está emitindo som");
		}
}
	



