package classeAbstrata;

public abstract class Animal {
	
		private String nome;
		private String sexo;
		private String raca;
		
		public Animal(String nome, String sexo, String raca) {
			this.nome = nome; 
			this.sexo = sexo;
			this.raca = raca;
		}

	//Gerar Getters e Setters
		public abstract void dormir();

		public abstract void caminhar();

		public abstract void correr();

		public abstract void emitirSom();
	


	}


