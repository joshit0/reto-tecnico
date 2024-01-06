package demoblaze.utils;

import java.util.Base64;

public class util {

	public String random_username() {
		String characters = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return "user_" + generate_random(characters, 6);
	}

	public String random_password_base64() {
		String characters = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return Base64.getEncoder().encodeToString(generate_random(characters, 6).getBytes());
	}

	public String encode_base64(String text) {
		return Base64.getEncoder().encodeToString(text.getBytes());
	}

	private String generate_random(String available_characters, int result_length) {
		String result = "";
		int charactersLength = available_characters.length();
		for (int i = 0; i < result_length; i++) {
			result += available_characters.charAt((int) Math.floor(Math.random() * charactersLength));
		}
		return result;
	}

}
