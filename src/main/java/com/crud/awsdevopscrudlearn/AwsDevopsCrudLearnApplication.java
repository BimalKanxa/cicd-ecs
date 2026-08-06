package com.crud.awsdevopscrudlearn;

import com.crud.awsdevopscrudlearn.service.SpringProfileLearn;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class AwsDevopsCrudLearnApplication implements CommandLineRunner {

    private final SpringProfileLearn springProfileLearn;

    @Value("${my.variable}")
    private String myVariable;
    public static void main(String[] args) {
        SpringApplication.run(AwsDevopsCrudLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("my variable is " + myVariable);
        System.out.println("the data is : " + springProfileLearn.getData());
        System.out.println("system is working");
    }

}
