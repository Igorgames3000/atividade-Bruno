
import atividadebruno.testValores;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 *
 * @author igorg
 */
public class testValoresJUnity {
    
    
    
    
    @Test
    public void valorTest() {
       testValores tstv = new testValores();
       int v1 = 10; int v2 = 30;
       int Esperado = 40;
        int soma = tstv.soma(v1,v2); 
        System.out.println(soma);
        Assertions.assertEquals(30,Esperado);
    }
}
