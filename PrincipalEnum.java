package classeAbstrata;

public class PrincipalEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.Segunda;
		
		System.out.println(dia); // Segunda

		StatusPedido pedido = StatusPedido.CANCELADO;
		
		System.out.println(pedido); // CANCELADO
	}

}
