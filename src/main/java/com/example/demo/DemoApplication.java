package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

public String welcomeMsg(){
return "welcome to github";
}

public int addition(int a, int b){

int c;
c=a+b;
return c;
}
public int substraction(int a ,int b){
int c=a-b;
return c;
}

}
