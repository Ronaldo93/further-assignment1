package view;

import controller.RentalManagerController;
import model.Property;
import model.Tenant;
import utils.InputUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class RentalManagerView {
	// there are some view methods here
	// entry view of the application
	public static void welcomeView() {
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

	/**
	 * allows user creating a new rental agreements with existing user base
	 * @param tenantList list of tenants
	 * @param propertyList list of properties
	 * @param rentalManagerController rental manager controller
	 * @return a hashmap containing the rental agreement details
	 */
	public static HashMap<String, String> createRentalContractView(ArrayList<Tenant> tenantList, ArrayList<Property> propertyList, RentalManagerController rentalManagerController) {
		// Filtering arraylist
		ArrayList<Integer> chosenTenantIds = new ArrayList<>();
		ArrayList<Integer> chosenPropertyIds = new ArrayList<>();

		// create a copy of arraylist for dynamic filtering
		ArrayList<Tenant> filteredTenantList = new ArrayList<>(tenantList);

		// The main form
		System.out.println("Below is the list of tenants:");
		for (Tenant tenant : filteredTenantList) {
			System.out.println(tenant.getId() + ". " + tenant.getName());
		}
		System.out.println("Please enter the tenant id:");
		String tenantId = InputUtils.getStringInput();
		chosenTenantIds.add(Integer.parseInt(tenantId));
		filteredTenantList.remove(tenantList.get(Integer.parseInt(tenantId) - 1));  // remove the tenant from the property list

		// ask for subtenant
		String subtenantList = setSubTenantView(filteredTenantList, chosenTenantIds);

		// ask for start date, end date and period
		System.out.println("Please enter the start date:");
		String startDate = InputUtils.getStringInput();
		System.out.println("Please enter the end date:");
		String endDate = InputUtils.getStringInput();
		System.out.println("Please enter the period:");
		String period = InputUtils.getStringInput();

		// ask for property
		System.out.println("Below is the list of properties:");
		for (Property property : propertyList) {
			System.out.println(property.getPropertyId() + ". " + property.getAddress());
		}
		System.out.println("Please enter the property id:");
		String propertyId = InputUtils.getStringInput();

		// ask for rent fee
		System.out.println("Please enter the rent fee:");
		String rentFee = InputUtils.getStringInput();

		// create a hashmap to store the rental agreement details
		HashMap<String, String> rentalAgreementDetails = new HashMap<>();
		rentalAgreementDetails.put("tenantId", tenantId);
		rentalAgreementDetails.put("subtenantList", subtenantList);
		rentalAgreementDetails.put("startDate", startDate);
		rentalAgreementDetails.put("endDate", endDate);
		rentalAgreementDetails.put("period", period);
		rentalAgreementDetails.put("propertyId", propertyId);
		rentalAgreementDetails.put("rentFee", rentFee);

		// return the hashmap
		return rentalAgreementDetails;
	}

	/**
	 * Set subtenants for the rental agreement
	 * @param filteredTenantList list of tenants
	 * @param chosenTenantIds list of chosen tenant ids
	 * @return list of subtenant ids
	 */
	public static String setSubTenantView(ArrayList<Tenant> filteredTenantList, ArrayList<Integer> chosenTenantIds) {
		ArrayList<Integer> subTenantIds = new ArrayList<>();
		System.out.println("Below is the list of tenants:");
		for (Tenant tenant : filteredTenantList) {
			System.out.println(tenant.getId() + ". " + tenant.getName());
		}

		// loop to ask for subtenant
		while (true) {
			System.out.println("Please enter the subtenant id (or enter 'done' to finish):");
			String subTenantId = InputUtils.getStringInput();
			if (subTenantId.equals("done")) {
				break;
			}

			// add subtenant id to the list (and also filter the list)
			int subtenantId = Integer.parseInt(subTenantId);
			subTenantIds.add(subtenantId);
			chosenTenantIds.add(subtenantId);
			filteredTenantList.remove(subtenantId);
		}

		// convert the list to string
		return subTenantIds.toString();
	}

	// view for getting all of the contract
	public void getAllContractsView() {
		System.out.println("All rental contracts:");
	}

	// view for creating a rental contract

}
