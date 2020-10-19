package com.org.philips.batch;

import com.org.philips.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {

        System.out.println("i am in processer");
        return user;
    }
}
