package vinnsla.hi;

import Vinnsla.Reiknivel;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class fradratturTest {
    private Reiknivel reiknivel;

    @Before
    public void creatReiknivel() {
        this.reiknivel = new Reiknivel();
    }

    @Test
    public void testFradrattur() {
        reiknivel.setTala(3);
        reiknivel.setTala(2);
        reiknivel.setVirki(2);
        Assert.assertEquals("1", reiknivel.reikna());
    }
    
}
