package Block2;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Андрей on 26.04.2016.
 */
public class MasTest {

    @Test
    public void testAdd() {
        Mas mod = new Mas();
        int mj = mod.add(1,3);
        Assert.assertTrue(mj == 5);
    }
}