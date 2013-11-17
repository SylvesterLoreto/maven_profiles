package mv;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: abreus
 * Date: 10/11/2013
 * Time: 16:48
 * To change this template use File | Settings | File Templates.
 */
public class QuickTest {


    @Test
    public void testName() throws Exception {
        System.out.println("\n---   Running quick test   ---");
        assertThat(true, is(true));
        System.out.println("---   Finish running quick test   ---\n");
    }
}
