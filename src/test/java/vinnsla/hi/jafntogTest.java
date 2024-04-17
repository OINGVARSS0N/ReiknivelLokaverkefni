package vinnsla.hi;


import Vinnsla.Reiknivel;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class jafntogTest {
    private Reiknivel reiknivel;

    @Before
    public void creatReiknivel() {
        this.reiknivel = new Reiknivel();
    }

    @Test
    public void testJafntog() {
        reiknivel.setTala(5);
        Assert.assertEquals("5", reiknivel.jafntOg());
    }

    @Test
    public void testJafntog2() {
        reiknivel.setTala(0);
        reiknivel.setTala(8);
        Assert.assertEquals("8", reiknivel.jafntOg());
    }
}
