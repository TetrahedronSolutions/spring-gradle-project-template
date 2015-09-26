package contribution;

import static org.junit.Assert.*;
import org.junit.*;
import net.tsol.contribution.Contribution;

public class ContributionTest {

    @Test
    public void testCreateContribution() {
        Contribution newContritubion= new Contribution("potato", "smilyface");
        Assert.assertEquals(newContritubion.getName(), "potato");
        Assert.assertEquals(newContritubion.getUrl(), "smilyface");
    }
}
