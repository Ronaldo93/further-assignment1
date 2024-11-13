package controller;

import model.RentalAgreement;

public interface RentalManager {
	public void create();
	public void delete();
	public void update();
	public void getOne();
	public void getAll();
}
