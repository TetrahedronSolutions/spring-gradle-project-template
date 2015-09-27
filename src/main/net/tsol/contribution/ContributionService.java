package net.tsol.contribution;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ContributionService {
  @Autowired private ContributionRepository db;
  public List<Contribution> getContribution() {
    return db.getContributions();
  }
}
