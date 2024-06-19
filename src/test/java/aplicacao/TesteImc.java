package aplicacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteImc {
    @Test
    public void testSum() {
    	testeDeTeste calculator = new testeDeTeste();
        assertEquals(8, calculator.imc(215, 5));
        
    }
}
