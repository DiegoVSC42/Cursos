
public class CadastroCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Diego";
		cliente.cpf = "70904245101";
		cliente.idade = 21;
		cliente.numeroAgencia = 19;
		
		System.out.println(cliente);
		System.out.println(cliente.nome);
		System.out.println(cliente.cpf);
		System.out.println(cliente.idade);
		System.out.println(cliente.numeroAgencia);
		
	}
}
