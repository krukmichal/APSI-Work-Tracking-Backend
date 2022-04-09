package com.apsiworktracking.apsiworktracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ApsiWorkTrackingApplicationTests
{
    @Test
    void test()
    {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User( "John", "123" ),
                new User( "Mary", "456" ),
                new User( "Peter", "789" )
        ));

        users.add(new User("Dave", "158"));

        Assertions.assertEquals(4, users.size());
        Assertions.assertEquals("John", users.get(0).getName());
    }

    @Test
    void test2()
    {
        Assertions.assertEquals(4, 2 + 2);
    }

}
