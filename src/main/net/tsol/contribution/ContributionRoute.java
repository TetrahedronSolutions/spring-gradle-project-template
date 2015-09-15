package net.tsol.contribution;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by German on 9/13/2015.
 */


@Controller
@RequestMapping("/contribution")
public class ContributionRoute {
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Contribution contrib(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Contribution();

    }
}
