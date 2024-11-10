package model;

import java.util.Date;

public class RentalAgreement {
	private int id;

	// People who rent the property
	private Tenant tenant;
	private Tenant subTenant;

	// details about the contract
	private String period;
	private Date startDate;
	private Date endDate;
	private double rentFee;

	// details about the property
	private Property property;
	private RentalStatus status;
}
