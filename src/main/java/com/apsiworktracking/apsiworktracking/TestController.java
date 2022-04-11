package com.apsiworktracking.apsiworktracking;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins="https://ambitious-pond-0cc25cb03.1.azurestaticapps.net")
@RestController
public class TestController
{
    public List<User> users = new ArrayList<>(Arrays.asList(
            new User( "John", "123" ),
            new User( "Mary", "456" ),
            new User( "Peter", "789" )
    ));

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return users;
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user)
    {
        users.add(user);
    }

    @GetMapping("/test")
    public String test()
    {
        return "New Commit";
    }
}
