package com.jdc.demo.usage.processor;

import java.util.ArrayList;

import com.jdc.demo.usage.NotBlank;
import com.jdc.demo.usage.NotNull;

public class FieldsValidator {

	public static void validate(Object object) {

		var messages = new ArrayList<String>();
		var fields = object.getClass().getDeclaredFields();

		for (var field : fields) {
			field.setAccessible(true);

			var notBlank = field.getDeclaredAnnotation(NotBlank.class);

			if (notBlank != null) {
				try {
					var value = field.get(object);

					if (value == null) {
						messages.add(notBlank.value());
					} else if (value != null && value instanceof String str && str.isBlank()) {
						messages.add(notBlank.value());
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}

			var notNull = field.getDeclaredAnnotation(NotNull.class);

			if (notNull != null) {
				try {
					var value = field.get(object);

					if (value == null) {
						messages.add(notNull.value());
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}

			if (!messages.isEmpty()) {
				throw new FieldsValidationException(messages);
			}
		}
	}
}
