package by.mk.training.phonestation.service;

public class Test {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		UserServiceRegistration us = new UserServiceRegistration();
		us.testEntityManagerInitialization();
		us.testRegistration();
		System.out.println("1");
	}
}