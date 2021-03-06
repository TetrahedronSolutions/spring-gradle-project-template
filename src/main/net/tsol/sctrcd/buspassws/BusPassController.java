package net.tsol.sctrcd.buspassws;

import net.tsol.sctrcd.buspassws.facts.BusPass;
import net.tsol.sctrcd.buspassws.facts.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusPassController {

    private static Logger log = LoggerFactory.getLogger(BusPassController.class);

    private final BusPassService busPassService;

    @Autowired
    public BusPassController(BusPassService busPassService) {
        this.busPassService = busPassService;
    }

    @RequestMapping(value = "/buspass",
            method = RequestMethod.GET, produces = "application/json")
    public BusPass getQuestions(
            @RequestParam(required = true) String name,
            @RequestParam(required = true) int age) {

        BusPass busPass = busPassService.getBusPass(new Person(name, age));

        return busPass;
    }

}
