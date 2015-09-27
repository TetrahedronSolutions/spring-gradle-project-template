package net.tsol.contribution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ContributionRepository {

  private List<Contribution> sampleDatabaseData;

  public ContributionRepository() {
    sampleDatabaseData = new ArrayList<Contribution>();
    sampleDatabaseData.add(new Contribution()
      .setNames(new ArrayList<String>(Arrays.asList("Red Potato,Yello Potato,Cheesy Potato".split(","))))
      .setUrl("https://github.com/gerrive/tsol-gradle-build"));
  }

  public List<Contribution> getContributions() {
    return sampleDatabaseData;
  }
}
