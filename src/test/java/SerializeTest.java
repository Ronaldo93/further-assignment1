import model.*;
import org.junit.jupiter.api.Test;
import utils.SerializeUtils;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerializeTest {
	@Test
	public void testSerializeInSession() {
		Person person = new Person();
		java.lang.String jsonStr = SerializeUtils.serialize(person);
		assert jsonStr != null;
	}

	/**
	 * Test serialize of Host object (serve as a template for other objects)
	 *
	 * <p><strong>Example: </strong>A host with id = 2 should have the same id after deserialization</p>
	 *
	 * @see Host
	 */
	@Test
	public void testSerializeHost() {
		// create a host object
		Person person = new Person();
		Host host = new Host(1, "John Doe", null, "1234567890", new ArrayList<Integer>(), new ArrayList<Integer>());

		// let's add a property to the host
		Property string = new Property();

		// test how the serialization is handled
		java.lang.String jsonStr = SerializeUtils.serialize(host);
		assert jsonStr != null;
	}

	/**
	 * Deserialize a json string to a Host object
	 * and test if the deserialization is successful
	 * for importing the data back to the object
	 *
	 */
	@Test
	public void testDeserializeHost() {
		// create a host object
		Host host = new Host();
		host.setId(2);

		// add some owners to the host
		host.addOwner(new Person(1, "John Doe", null, "1234567890"));
		host.addOwner(new Person(2, "Jane Doe", null, "0987654321"));
		java.lang.String jsonStr = SerializeUtils.serialize(host);

		// deserialize the json string
		host.deserialize(jsonStr);

		// assert one of the host properties is correctly deserialized
		assertEquals(2, host.getOwnerList().size());
		assertEquals(2, host.getId());
	}
}
