package model;

import com.google.gson.Gson;

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


	/**
	 * Serialize this object to a json string
	 * @return json string
	 */
	public String serialize() {
		// use gson to serialize this object
		String jsonStr = new Gson().toJson(this);
		System.out.println("[Person.serialize] serialized string: " + jsonStr);
		return jsonStr;
	}
	// getter and setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
