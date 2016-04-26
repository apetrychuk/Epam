package Task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Андрей on 26.04.2016.
 */
public class ModelTest {
    private static Model mod;

    @BeforeClass
    public static void bef(){
        mod = new Model();
    }

    @Test
    public void testRandom() throws Exception {
        int res = mod.random(1,3);
        Assert.assertTrue(res == 2);
    }

    @Test
    public void testRandom1() throws Exception {
        int res = mod.random(2,10000);
        Assert.assertTrue(res > 2 && res < 10000);
    }

    @Test
    public void testRandom2() throws Exception {
        int res = mod.random(-10000,10000);
        Assert.assertTrue(res > -10000 && res < 10000);
    }

    @Test
    public void testRandom3() throws Exception {
        int res = mod.random(-2,0);
        Assert.assertTrue(res == -1);
    }


    @Test
    public void testRandom1Param(){
        int res = mod.random(2);
        Assert.assertTrue(res == 1);
    }

    @Test
    public void testRandom1Param1(){
        int res = mod.random(1000);
        Assert.assertTrue(res > 0 && res < 1000);
    }

}