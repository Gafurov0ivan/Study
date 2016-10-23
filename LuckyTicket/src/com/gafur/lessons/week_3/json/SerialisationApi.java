package com.gafur.lessons.week_3.json;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisationApi {

	public static class User implements Serializable {
		// This field(serialVersionUID) not use in practice.
		// If some fields in class change, we must change serialVersionUID
		// manually
		// This method with Serializable usually use in one application for
		// cache
		private static final long serialVersionUID = 1173921013796897234L;

		public User(String userName, int age) {
			this.userName = userName;
			this.age = age;
		}

		private String userName;
		private int age;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream byteArrayOutpurStream = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutpurStream);
			oos.writeObject(new User("someName", 23));
		} catch (IOException e) {
			e.printStackTrace();
		}

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filename.xml"));
		try {
			ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();
	}
}
