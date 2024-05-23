package ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ex1.FatorialController;
import ex1.FatorialView;

public class TesteFatorial extends AssertJSwingJUnitTestCase {
    private FrameFixture window;
    
    @BeforeAll
    @Override
    protected void onSetUp() {
        // Inicializa a janela da FatorialView
        FatorialView fatorialView = GuiActionRunner.execute(() -> new FatorialView());
        window = new FrameFixture(robot(), fatorialView);
        window.show(); // Exibe a janela
    }
    @Test
    public void testJanelaExibidaCorretamente() {
        // Verifica se a janela está visível após ser exibida
        window.requireVisible();
    }

    @Override
    protected void onTearDown() {
        // Fecha a janela após cada teste
        window.cleanUp();
    }
    
	 @Test
	    void testeFat() throws Exception {
	       BigDecimal i = new BigDecimal(3);
	        assertEquals(FatorialController.fatorial(i), new BigDecimal(6));
	    }
		 
}
