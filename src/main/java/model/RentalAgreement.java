package model;

import java.util.Date;

public class RentalAgreement {
	private int id;

	// Persons who rent the property
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


	// Constructor
	public RentalAgreement() {}

	public RentalAgreement(int id, Tenant tenant, Tenant subTenant, String period, Date startDate, Date endDate, double rentFee, Property property, RentalStatus status) {
		setId(id);
		setTenant(tenant);
		setSubTenant(subTenant);
		setPeriod(period);
		setStartDate(startDate);
		setEndDate(endDate);
		setRentFee(rentFee);
		setProperty(property);
		setStatus(status);
	}

	/**
	 * Set the tenant and subtenant for the rental agreement
	 * @param tenant Tenant who rent the property
	 * @param subTenant Tenant who also renting the property
	 */
	public void setParticipation(Tenant tenant, Tenant subTenant) {
		setTenant(tenant);
		setSubTenant(subTenant);
	}

	/**
	 * Set the details of the rental agreement
	 * @param period - the period of the rental agreement
	 * @param startDate - the start date of the rental agreement
	 * @param endDate - the end date of the rental agreement
	 * @param rentFee - the rent fee of the rental agreement
	 */
	public void setDetails(String period, Date startDate, Date endDate, double rentFee) {
		setPeriod(period);
		setStartDate(startDate);
		setEndDate(endDate);
		setRentFee(rentFee);
	}

	/**
	 * Set the property and status of the rental agreement
	 * @param property - the property of the rental agreement
	 * @param status - the status of the rental agreement
	 */
	public void setPropertyDetails(Property property, RentalStatus status) {
		setProperty(property);
		setStatus(status);
	}


	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public Tenant getSubTenant() {
		return subTenant;
	}

	public void setSubTenant(Tenant subTenant) {
		this.subTenant = subTenant;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getRentFee() {
		return rentFee;
	}

	public void setRentFee(double rentFee) {
		this.rentFee = rentFee;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public RentalStatus getStatus() {
		return status;
	}

	public void setStatus(RentalStatus status) {
		this.status = status;
	}
}
