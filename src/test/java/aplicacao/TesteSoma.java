package aplicacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteSoma {
    @Test
    public void testSum() {
    	SomaSimples calculator = new SomaSimples();
        assertEquals(5, calculator.sum(2, 3));
    }
}
