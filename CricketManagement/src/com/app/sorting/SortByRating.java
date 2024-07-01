package com.app.sorting;

import java.util.Comparator;

import com.app.core.Cricketer;

public class SortByRating implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer r1,Cricketer r2) {
		if(r1.getRating()>r2.getRating()) {
			return 1;
		}
		else if(r1.getRating()==r2.getRating())
		{
			return 0;
		}
		else
		return -1;
	}

}
