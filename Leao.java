package classeAbstrata;

public class Leao extends Animal{

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
 }
	@Override
	public void dormir() {
		System.out.println("O leao está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O leao está caminhando");
	}
	@Override
	public void correr() {
		System.out.println("O leao está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O leao está emitindo som");
	}

}
