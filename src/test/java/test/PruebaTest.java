package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.example.demo.CarritoCompraSpringApplication.class)
@ExtendWith(SpringExtension.class)
class PruebaTest {

	@Test
	void test1() {
		assertTrue(true);
	}
	
//	@Test
//	void test2() {
//		assertTrue(true);
//	}

}
