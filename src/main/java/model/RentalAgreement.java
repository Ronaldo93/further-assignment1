package model;

import java.util.ArrayList;
import java.util.Date;

public class RentalAgreement {
	private int id;

	// Persons who rent the property
	private int tenantId;
	private ArrayList<Integer> subTenantIds;

	// details about the contract
	private java.lang.String period;
	private Date startDate;
	private Date endDate;
	private double rentFee;

	// details about the property
	private int propertyId;
	private RentalStatus status;


	// Constructor
	public RentalAgreement() {}

	public RentalAgreement(int id, Tenant tenant, java.lang.String period, Date startDate, Date endDate, double rentFee, int propertyId, RentalStatus status) {
		this.id = id;
		this.tenantId = tenant.getId();
		this.subTenantIds = new ArrayList<Integer>();
		this.period = period;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rentFee = rentFee;
		this.propertyId = propertyId;
		this.status = status;
	}

	/**
	 * Set the tenant and subtenant for the rental agreement
	 * @param tenant Tenant who rent the property
	 * @param subTenant Tenant who also renting the property
	 */
	public void setParticipation(int tenant, ArrayList<Integer> subTenant) {
		setTenantId(tenant);
		setSubTenantIds(subTenant);
	}

	/**
	 * Set the details of the rental agreement
	 * @param period - the period of the rental agreement
	 * @param startDate - the start date of the rental agreement
	 * @param endDate - the end date of the rental agreement
	 * @param rentFee - the rent fee of the rental agreement
	 */
	public void setDetails(java.lang.String period, Date startDate, Date endDate, double rentFee) {
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
		setPropertyId(property.getPropertyId());
		setStatus(status);
	}


	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public ArrayList<Integer> getSubTenantIds() {
		return subTenantIds;
	}

	public void setSubTenantIds(ArrayList<Integer> subTenantIds) {
		this.subTenantIds = subTenantIds;
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

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public RentalStatus getStatus() {
		return status;
	}

	public void setStatus(RentalStatus status) {
		this.status = status;
	}
}
