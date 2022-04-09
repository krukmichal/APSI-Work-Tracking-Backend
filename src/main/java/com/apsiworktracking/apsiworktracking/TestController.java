package com.apsiworktracking.apsiworktracking;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
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
}
