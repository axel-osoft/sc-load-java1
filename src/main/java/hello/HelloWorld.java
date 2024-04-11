package hello;

public class HelloWorld {
  public static void main(String[] args) {
	Greeter greeter = new Greeter();
	@SuppressWarnings("java:S1481")
	var hello = "Hello";
	System.out.println(greeter.sayHello());
  }
}
