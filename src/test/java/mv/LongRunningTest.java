package mv;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: abreus
 * Date: 10/11/2013
 * Time: 16:51
 * To change this template use File | Settings | File Templates.
 */
public class LongRunningTest {


    @Test
    public void testLongRunning() throws Exception {

        System.out.println("\n---   Running long test   ---");

        TimeUnit.SECONDS.sleep(5);
        assertThat(true, is(true));

        System.out.println("---   Finish running long test   ---\n");
    }
}
