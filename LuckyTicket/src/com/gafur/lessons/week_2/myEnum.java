package com.gafur.lessons.week_2;

import java.io.Serializable;

public enum myEnum implements Serializable {
	JANUARY("January"), FEBRARY("February");
	
	private String displayName;
	
	private myEnum(String s){
		this.displayName = s;
	}
}
