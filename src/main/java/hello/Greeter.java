package hello;

public class Greeter {
	public static void sayHello(String to) {
		System.out.println(buildGreeting(to));
	}

	public static String buildGreeting(String to) {
		return "Greeter says : Hello " + to;
	}
}
