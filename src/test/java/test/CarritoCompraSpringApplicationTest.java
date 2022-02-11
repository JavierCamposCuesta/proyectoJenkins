package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Pedido;
import com.example.demo.model.Usuario;
import com.example.demo.service.PedidoService;
import com.example.demo.service.UsuarioService;

@SpringBootTest
class CarritoCompraSpringApplicationTest {

	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Test
	void contextLoads() {
		
	}
	
	@Test
	void prueba() {
		Usuario usuario = new Usuario();
		usuarioService.add(usuario);
		assertEquals(5, usuarioService.findAll().size());
		;
		
	}

}
