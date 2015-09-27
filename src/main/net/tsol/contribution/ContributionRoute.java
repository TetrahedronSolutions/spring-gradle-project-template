package net.tsol.contribution;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ContributionRoute {

    @Autowired private ContributionService contributionService;

    @RequestMapping(value = "/contributions",
            method = RequestMethod.GET,
            produces = "application/json")
    public List<Contribution> getContributions() {
        return this.contributionService.getContribution();
    }
}
