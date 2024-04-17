package vinnsla.hi;


import Vinnsla.Reiknivel;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class margfaldaTest {
    private Reiknivel reiknivel;

    @Before
    public void creatReiknivel() {
        this.reiknivel = new Reiknivel();
    }

    @Test
    public void testMargfalda() {
        reiknivel.setTala(5);
        reiknivel.setTala(3);
        reiknivel.setVirki(1);
        Assert.assertEquals("15", reiknivel.reikna());
    }
}
