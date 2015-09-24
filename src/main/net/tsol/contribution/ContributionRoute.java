package net.tsol.contribution;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by German on 9/13/2015.
 */


@RestController
public class ContributionRoute {
    @RequestMapping("/contribution")
    @ResponseBody
    public Contribution contrib(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        Contribution item = new Contribution("potato", "potato");
        return new Contribution("potato", "potato");
    }
}
