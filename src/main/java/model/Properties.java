package model;

import java.util.ArrayList;

public class Properties {
	private ArrayList<CommercialProperty> commercialProperties;
	private ArrayList<ResidentialProperty> residentialProperties;
	private ArrayList<Property> properties;

	public Properties() {
		this.commercialProperties = new ArrayList<CommercialProperty>();
		this.residentialProperties = new ArrayList<ResidentialProperty>();
	}

	/**
	 * Add property to property list
	 * @param residentialProperty - the property to be added
	 */
	public void addResidentialProperty(ResidentialProperty residentialProperty) {
		this.residentialProperties.add(residentialProperty);
	}


	/**
	 * Add property to commercial list
	 * @param commercialProperties - the property to be added
	 */
	public void addCommercialProperty(CommercialProperty commercialProperties) {
		this.commercialProperties.add(commercialProperties);
	}

	/**
	 * Filter available properties
	 * @return list of available rental properties
	 */
	public String getAvailableProperties() {
		// get all properties by both commercial and residential
		ArrayList<ResidentialProperty> availableResidentialProperties = getResidentialProperties();
		ArrayList<CommercialProperty> commercialProperties = getCommercialProperties();

		String availableProperties = "";

		availableProperties += "Residential Properties\n\n";

		// filter available properties
		for (ResidentialProperty residentialProperty : residentialProperties) {
			if (residentialProperty.getStatus() == PropertyStatus.AVAILABLE) {
				availableProperties += residentialProperty.toString() + "\n";
			}
		}

		availableProperties += "\n\nCommercial Properties\n\n";

		for (CommercialProperty commercialProperty : commercialProperties) {
			if (commercialProperty.getStatus() == PropertyStatus.AVAILABLE) {
				availableProperties += commercialProperty.toString() + "\n";
			}
		}
		return availableProperties;
	}


	// getters and setters
	public ArrayList<CommercialProperty> getCommercialProperties() {
		return commercialProperties;
	}

	public void setCommercialProperties(ArrayList<CommercialProperty> commercialProperties) {
		this.commercialProperties = commercialProperties;
	}

	public ArrayList<ResidentialProperty> getResidentialProperties() {
		return residentialProperties;
	}

	public void setResidentialProperties(ArrayList<ResidentialProperty> residentialProperties) {
		this.residentialProperties = residentialProperties;
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}
}
