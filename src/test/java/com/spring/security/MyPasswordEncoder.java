package com.spring.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyPasswordEncoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BCryptPasswordEncoder encryptor = new BCryptPasswordEncoder();
		String pass = "adminpass";
		System.out.println("adminpass="+	encryptor.encode(pass));
		System.out.println("userpass="+	encryptor.encode("userpass"));
		System.out.println("guestpass="+	encryptor.encode("guestpass"));

	}

}
