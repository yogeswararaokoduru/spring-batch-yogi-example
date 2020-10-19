package com.org.philips.batch;

import com.org.philips.model.User;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Reader implements ItemReader<User> {
    @Override
    public User read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
       /* FlatFileItemReader<User> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(new FileSystemResource("src/main/resources/users.csv"));
        flatFileItemReader.setName("CSV-Reader");
        flatFileItemReader.setLinesToSkip(1);
        flatFileItemReader.setLineMapper(lineMapper());*/

        User user=new User();
        user.setDept("101");
        user.setTime(new Date());
        user.setId(101);
        user.setSalary(10000);
        user.setName("yogi");
        return user;
    }
}
