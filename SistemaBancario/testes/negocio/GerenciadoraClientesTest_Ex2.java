package negocio;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex2 {

	private GerenciadoraClientes gerClientes;

	@Test
	public void testPesquisaCliente() {

		Cliente cliente01 = new Cliente(1, "Breno Noccioli", 31, "breno@email.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Carol Lima", 34, "carol@email.com", 2, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		
	}
	
	@Test
	public void testRemoveCliente() {

		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		boolean clienteRemovido = gerClientes.removeCliente(2);
		
		assertThat(clienteRemovido, is(true)); //verifica se o método retorna true
		assertThat(gerClientes.getClientesDoBanco().size(), is(1)); //verifica tamanho da lista de clientes para confirmar a exclusão
		assertNull(gerClientes.pesquisaCliente(2)); //verifica se determinado id retorna null, ou seja, não existe
		
	}

}
