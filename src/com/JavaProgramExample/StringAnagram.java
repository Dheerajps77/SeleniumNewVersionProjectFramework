package com.JavaProgramExample;


public class StringAnagram {

	public static void anagram() {
		String str1 = "dheeraj";
		String str2 = "jareehd";
		String str3 = "";
		try {

			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();

			if (c1.length == c2.length) {
				for (int i = str1.length() - 1; i >= 0; i--) {
					char c = str1.charAt(i);
					str3 = str3 + c;
				}

				if (str3.equals(str2)) {
					System.out.println(str1 + " and " + str2 + " is anagram");
				} else {
					System.out.println(str1 + " and " + str2 + " is not anagram");
				}
			} else {
				System.out.println("Length dont match of both the string. Hence cannot make anagram");
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void StringReverse() {
		try {

			String string = "Hello guys";
			char[] s = string.toCharArray();
			String str = "";
			for (int i = s.length - 1; i > 0; i--) {
				str = str + s[i];
			}
			System.out.println(str);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		anagram();
		// StringReverse();
	}

}
