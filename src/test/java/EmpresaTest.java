
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.reis1x.Empresa;
import com.reis1x.Estado;


public class EmpresaTest {
    private Empresa emp = null;
    
    @BeforeEach
    void setUp() {
    
        emp = new Empresa();
    }

    //testes do estado normal
    @Test
    public void normalMenosMenos() {
        double num = emp.calculaSalario(2000, Estado.NORMAL);
        Assertions.assertEquals(1910, num);
    }
    @Test
    public void normalMenosMais() {
        double num = emp.calculaSalario(3000, Estado.NORMAL);
        Assertions.assertEquals(2805, num);
    }
    @Test
    public void normalMais() {
        double num = emp.calculaSalario(6000, Estado.NORMAL);
        Assertions.assertEquals(5355, num);
    }
    //Testes estado critico
    @Test
    public void criticoMaisMais() {
        double num = emp.calculaSalario(7000, Estado.CRITICO);
        Assertions.assertEquals(5375, num);
    }
    @Test
    public void criticoMaisMenos() {
        double num = emp.calculaSalario(6000, Estado.CRITICO);
        Assertions.assertEquals(4584, num);
    }
    @Test
    public void criticoMenos() {
        double num = emp.calculaSalario(4000, Estado.CRITICO);
        Assertions.assertEquals(3056, num);
    }

    //Testes estado otimo
    @Test
    public void otimoMais() {
        double num = emp.calculaSalario(4000, Estado.OTIMO);
        Assertions.assertEquals(4475, num);
    }
    @Test
    public void otimoMenosMais() {
        double num = emp.calculaSalario(3000, Estado.OTIMO);
        Assertions.assertEquals(3431.25, num);
    }
    @Test
    public void otimoMenosMenos() {
        double num = emp.calculaSalario(1990, Estado.OTIMO);
        Assertions.assertEquals(2375.5625, num);
    }
}
