package model;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private Date dateOfBirth;
	private String number;

	public Person() {
		// create some mock data
		this.id = 1;
		this.name = "John Doe";
		this.dateOfBirth = new Date();
		this.number = "1234567890";
	}

	public Person(int id, String name, Date dateOfBirth, String number) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.number = number;
	}

}
