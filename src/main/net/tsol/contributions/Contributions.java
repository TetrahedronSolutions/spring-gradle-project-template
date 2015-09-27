package net.tsol.contributions;

import net.tsol.contribution.Contribution;

import java.util.ArrayList;
import java.util.List;

public class Contributions {
    public Contributions() {
        list = new ArrayList<Contribution>();
    }

    public List<Contribution> getContributions() {
        return list;
    }

    public void setContributions(List<Contribution> list) {
        this.list = list;
    }

    public List<Contribution> list;
}
