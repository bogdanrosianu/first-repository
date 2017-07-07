import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bogdan on 7/6/2017.
 */


public class Testing {


    @Test
    public void test(){
        mainTest test = new mainTest();

        //arrange
        int a =7, b=3;

        //act
        int rez = test.aduna(a,b);

        //assert
        Assert.assertTrue(rez == 12);

    }
}
