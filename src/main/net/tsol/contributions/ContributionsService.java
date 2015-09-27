package net.tsol.contributions;

import net.tsol.contribution.Contribution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContributionsService {

    private static Logger log = LoggerFactory.getLogger(ContributionsService.class);

    public Contributions getContributionList() {
        Contributions contribs = new Contributions();
        for (int x = 0; x < 15; x++) {
            contribs.list.add(new Contribution("potato", "potato"));
        }

        return contribs;
    }

}
