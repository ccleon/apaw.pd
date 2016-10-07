package text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import text.TextComponent;
import text.CharFactory;
import text.Paragraph;
import text.Text;

public class TextTest {
    private TextComponent H, o, l, a, pf, txt;

    @Before
    public void ini() {
        H = CharFactory.getFactory().get('H');
        o = CharFactory.getFactory().get('o');
        l = CharFactory.getFactory().get('l');
        a = CharFactory.getFactory().get('a');
        pf = new Paragraph();
        pf.add(H);
        pf.add(o);
        pf.add(l);
        pf.add(a);
        txt = new Text();
        txt.add(pf);
        txt.add(pf);
    }

    @Test
    public void testCaracterFlyweight() {
        assertSame(H, CharFactory.getFactory().get('H'));
    }

    @Test
    public void testCaracterAddCaracter() {
        H.add(o);
    }

    @Test
    public void testDibujarCaracterNormal() {
        assertEquals("o", o.printFull(false));
    }

    @Test
    public void testDibujarCaracterMayusculas() {
        assertEquals("O", o.printFull(true));
    }

    // ----------------------------------------------

    @Test
    public void testParrafoNormal() {
        assertEquals("Hola\n", pf.printFull(false));
    }

    @Test
    public void testParrafoMayusculas() {
        assertEquals("HOLA\n", pf.printFull(true));
    }

    @Test
    public void testParrafoNoAddParrafo() {
        try {
            pf.add(pf);
            fail("");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    // ----------------------------------------------

    @Test
    public void testTextoNormal() {
        assertEquals("Hola\nHola\n---o---\n",txt.printFull(false));
    }
    
    @Test
    public void testTextoMayusculas() {
        assertEquals("HOLA\nHOLA\n---o---\n",txt.printFull(true));
    }
    
    @Test
    public void testTextoNoAddCaracter() {
        try {
            txt.add(H);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
