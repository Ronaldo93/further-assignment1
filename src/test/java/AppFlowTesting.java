import model.Persons;
import model.Tenant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppFlowTesting {
	@Test
	public void testDataImport() {
		// initialize the person object
		Persons persons = new Persons();

		// add a tenant to the persons object
		Tenant tenant = new Tenant();
		persons.addPerson(tenant);

		// assert that the persons object has a tenant
		assertEquals(1, persons.getPersonsList().size());
	}
}
