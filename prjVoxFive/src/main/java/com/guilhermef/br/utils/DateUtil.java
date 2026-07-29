package com.guilhermef.br.utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	public String formatLocalTimeToDatabaseStyle(LocalDateTime LocalDateTime) {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime);
	}
}
