package ex1;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class TestaFatorialController {

	 @Test
    void testeFat() throws Exception {
       BigDecimal i = new BigDecimal(3);
        assertEquals(FatorialController.fatorial(i), new BigDecimal(6));
    }
	 
	 
	 @Test
    void testeFatNegativo() throws Exception {
		 
		 BigDecimal numeroNegativo = new BigDecimal(-5);
		 
		 Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			FatorialController.fatorial(numeroNegativo);
	     });
	     assertEquals("Número inválido", exception.getMessage());
	 }
	 
	 
	 
	 @Test
    void testeFatZero() throws Exception {
		 BigDecimal i = new BigDecimal(0);
       
		 assertEquals(FatorialController.fatorial(i), new BigDecimal(1));
    }

}
