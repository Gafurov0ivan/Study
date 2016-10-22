package com.gafur.lessons.week_3;

public class Start {

	public static void main(String[] args) {
		Validator val = new Validator();
		
		User user = new User("a", "a");
		
		Vechicle vechicle = new Vechicle("aaaaaaaa");
		
		System.out.println(val.validate(user));
		System.out.println(val.validate(vechicle));

	}

}
