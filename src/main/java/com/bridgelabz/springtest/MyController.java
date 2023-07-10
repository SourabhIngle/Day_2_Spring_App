package com.bridgelabz.springtest;

import com.bridgelabz.springtest.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
//This annotation return any thing like string  convert into json or xml response.
//@Controller => http request handling
public class MyController {

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message() {
        return "Hello World";
    }

    @RequestMapping(value = "/message1", method = RequestMethod.GET)
    public String message1(@RequestParam String name) {
        return "Hello from " + name;
    }

    @RequestMapping(value = "/message2/{name}", method = RequestMethod.GET)
    public String message2(@PathVariable String name) {
        return "Hello from " + name;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String messageData(@RequestBody User user) {
        return "Hello from " + user.fName + " " + user.lName;
    }
}
