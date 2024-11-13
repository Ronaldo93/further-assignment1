package view;

import utils.InputUtils;

import java.util.HashMap;

public class RentalManagerView {
	// there are some view methods here
	// entry view of the application
	public void welcomeView() {
		System.out.println("Welcome to rental contract manager!");
		System.out.println("Please select an option below to continue:");
		System.out.println("1. Create a new rental contract");
		System.out.println("2. Update a rental contract");
		System.out.println("3. Delete a rental contract");
		System.out.println("4. View a rental contract");
		System.out.println("5. View all rental contracts");
		System.out.println("6. Exit");
	}

	// view for getting a rental contract
	public String getOneContractView() {
		System.out.println("Please enter the rental contract id:");
		return InputUtils.getStringInput();
	}

	// view for getting all of the contract
	public void getAllContractsView() {
		System.out.println("All rental contracts:");
	}

	// view for creating a rental contract
}
