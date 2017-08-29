package com.manish.javadev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.manish.javadev.dao.UserDao;
import com.manish.javadev.service.UserService;

/**
 * @author Manish
 *
 */
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	static UserDao accountDao;

	@Autowired
	private UserService accountService;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Done");

	}
}
