package com.nguyen.daikichipathvariables;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

// annotate, avoid DRY code
@RestController
@RequestMapping("/daikichi")

// Controller class
public class DaikichiController {


    // set routes
    // pass server variables

    @RequestMapping("/travel/{city}")
    public String city(@PathVariable("city") String city) {
        return "Congratulations! You will soon travel to " + city;
    }
    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable("number") int number) {
        if( number % 2 == 0) {
            return "You will take a grand journey in the near future, but be wary of temting offers";
        }
        return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }
    @RequestMapping("")
    public String daikichi() {
        return "Welcome!";
    }
    @RequestMapping("/today")
    public String today() {
        return "Today you will find luck in all your endeavours";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

}




