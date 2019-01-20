package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class WishService {

	public String getMessage() {
		Calendar cal = null;
		int hour = 0;
		// get calender instance
		cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good noon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}
}
