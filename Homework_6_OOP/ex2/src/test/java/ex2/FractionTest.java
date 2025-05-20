package ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FractionTest {

    @Test
    void noZeroAllowed() {
        assertThrows(IllegalArgumentException.class, () -> new Fraction(2, 0));
    }
    @Test
    void testKehrwert() {
        Fraction f = new Fraction(2, 3);
        f.Kehrwert();
        assertEquals("3/2", f.toString());
    }

    @Test
    void testMultiplikation() {
        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(4, 5);
        f.multiplikation(g);
        assertEquals("8/15", f.toString(), "Multiplikation falsch");
    }

    @Test
    void testAdditionGleicherNenner() {
        Fraction f = new Fraction(2, 5);
        Fraction g = new Fraction(3, 5);
        f.addition(g);
        assertEquals("5/5", f.toString(), "Addition mit gleichem Nenner falsch");
    }

    @Test
    void testAdditionVerschiedenerNenner() {
        Fraction f = new Fraction(1, 2);
        Fraction g = new Fraction(1, 3);
        f.addition(g);
        assertEquals("5/6", f.toString(), "Addition mit verschiedenem Nenner falsch");
    }

    @Test
    void testKuerzen() {
        Fraction f = new Fraction(4, 6);
        f.kuerzen();
        assertEquals("2/3", f.toString(), "Kürzen falsch");
    }
}