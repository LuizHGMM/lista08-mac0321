package ex1;

import java.math.BigDecimal;

public class FatorialController {
	

	    // Método estático que calcula o fatorial de um BigDecimal
	    public static BigDecimal fatorial(BigDecimal numero) throws Exception {
	        if (numero.compareTo(BigDecimal.ZERO) < 0) {
	            throw new IllegalArgumentException("Número inválido");
	        }
	    	
	    	
	        // Caso especial para fatorial de 0 que é 1
	        if (numero.equals(BigDecimal.ZERO)) {
	            return BigDecimal.ONE;
	        }

	        BigDecimal resultado = BigDecimal.ONE;
	        BigDecimal i = BigDecimal.ONE;
	        
	        
	        // Loop para calcular o fatorial
	        while (i.compareTo(numero) <= 0) {
	            resultado = resultado.multiply(i);
	            i = i.add(BigDecimal.ONE);
	        }
	        
	        return resultado;
	    }

}
