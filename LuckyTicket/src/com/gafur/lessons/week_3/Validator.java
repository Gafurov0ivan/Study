package com.gafur.lessons.week_3;

import java.lang.reflect.Field;

public class Validator {
	private static String stringValue = null;
	
	public boolean validate(Object value) {
		if (!validateOnMinLength(value)) {
			return false;
		}
		return true;
	}

	private boolean validateOnMinLength(Object value) {
		Field[] fields = value.getClass().getDeclaredFields();

		for (Field field : fields) {
			MinLength min = field.getAnnotation(MinLength.class);
			if (min != null) {
				int length = min.value();
				try {
					field.setAccessible(true);
					Object v = field.get(value);
					if (v instanceof String) {
						stringValue = (String) v;
					}

					if(stringValue.length() < length){
						return false;
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} finally {

				}

			}
		}
		return true;
	}
}
