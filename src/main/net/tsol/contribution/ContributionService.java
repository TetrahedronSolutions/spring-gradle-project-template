package net.tsol.contribution;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionService {
    public Contribution getContribution() {
        return new Contribution("german", "something");
    }
}
