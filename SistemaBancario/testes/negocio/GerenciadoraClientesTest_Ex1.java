package negocio;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test //anotação para identificar método de teste
	public void testPesquisaCliente() {

		//criando clientes
		Cliente cliente1 = new Cliente(1, "Breno Noccioli", 30, "breno@email.com", 1, true); //id, nome, idade, email, id_cc, ativo
		Cliente cliente2 = new Cliente(2, "Carol Lima", 31, "carol@email.com", 2, true);
		
		//inseirindo clientes na lista
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente1);
		clientesDoBanco.add(cliente2);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1)); //verifica se o id do cliente é 1
		assertThat(cliente.getEmail(), is("breno@email.com"));
		
	}

}
