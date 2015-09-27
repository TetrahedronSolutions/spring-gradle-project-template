package net.tsol.contributions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionsRoute {

    private final ContributionsService contributionsService;

    @Autowired
    public ContributionsRoute(ContributionsService contributionsService) {
        this.contributionsService = contributionsService;
    }

    @RequestMapping(value = "/contributions",
            method = RequestMethod.GET, produces = "application/json")
    public Contributions contribs() {
        return this.contributionsService.getContributionList();
    }
}