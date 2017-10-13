package co.simplon.recall;

public class Essai {

	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message = "";
		//message = name == "" ? "Hello World" : "Hello " + name;
		//ou
		if (name == "") {
			message = "Hello World";
		} else {
			message = "Hello " + name;
		}
		return message;
	}

}