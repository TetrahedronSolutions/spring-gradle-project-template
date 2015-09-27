package contribution;

import net.tsol.contribution.Contribution;

import org.junit.Assert;
import org.junit.Test;

public class ContributionTest {

    @Test
    public void testCreateContribution() {
        Contribution newContritubion = new Contribution("potato", "smilyface");
        Assert.assertEquals(newContritubion.getName(), "potato");
        Assert.assertEquals(newContritubion.getUrl(), "smilyface");
    }
}
