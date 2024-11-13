package utils;

import com.google.gson.Gson;

public class SerializeUtils {
	/**
	 * Serialize this object to a json string
	 * @return json string
	 */
	public static String serialize(Object object) {
		// use gson to serialize this object
		String jsonStr = new Gson().toJson(object);
		// System.out.println("[SerializeUtil] serialized string: " + jsonStr);  // debug only
		return jsonStr;
	}

	public static Object deserialize(String jsonStr, Class<?> clazz) {
		// use gson to deserialize this object
		Object object = new Gson().fromJson(jsonStr, clazz);
		// System.out.println("[SerializeUtil] deserialized object: " + object);  // debug only
		return object;
	}
}
