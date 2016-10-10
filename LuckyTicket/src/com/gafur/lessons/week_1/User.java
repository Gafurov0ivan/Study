package com.gafur.lessons.week_1;

public class User {
	// так не прин€то
	// String user;
	// String password;
	// int age;

	// доступ к пол€м класса всегда должен быть скрыт
	// Ётот класс называетс€ Java Bean, то есть пол€ скрыты и написаны гетеры и сетеры
	
	public static final String DEFAULT = "default";

	private long id;
	private String username;
	private String password;
	private int age;
	
	public User(){
		setId(0);
//		username = "default"; “ак не прин€то
		username = DEFAULT;
	}
	
	public User(long id, String username, String password){
		this.setId(id);
		this.username = username;
//		this - это объект, который не создан

	}
	public User(long id, String username, String password, int age){
		this(id, username, password);
		this.age = age;
//		¬ конструкторе вызвали другой, чтобы не дублировать код

	}
	

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		this.username = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
