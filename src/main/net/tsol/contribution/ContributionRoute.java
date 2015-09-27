package net.tsol.contribution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionRoute {

    private final ContributionService contributionService;

    @Autowired
    public ContributionRoute(ContributionService contributionService) {
        this.contributionService = contributionService;
    }

    @RequestMapping(value = "/contribution",
            method = RequestMethod.GET, produces = "application/json")
    public Contribution contrib() {
        return this.contributionService.getContribution();
    }
}
