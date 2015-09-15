package contribution;

import static org.junit.Assert.*;
import org.junit.*;
import net.tsol.contribution.Contribution;

/**
 * Created by German on 9/26/2015.
 */
public class ContributionTest {

    @Test
    public void testCreateContribution() {
        Contribution newContritubion= new Contribution("potato", "smilyface");
        Assert.assertEquals(newContritubion.getName(), "potato");
        Assert.assertEquals(newContritubion.getUrl(), "smilyface");
    }
}
