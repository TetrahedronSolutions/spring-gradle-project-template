package net.tsol.contributions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import net.tsol.contribution.Contribution;

@Controller
@RequestMapping("/contributions")
public class ContributionsRoute {
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Contribution> contribs() {
        List<Contribution> list = new ArrayList();

        for(int x = 0; x < 3; x++){
            Contribution item = new Contribution("potato", "potato");
            list.add(item);
        }

        return list;
    }
}