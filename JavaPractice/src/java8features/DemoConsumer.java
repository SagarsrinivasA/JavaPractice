package java8features;

import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {

		// accept input of any type and returns nothing
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Let's do it sagar!!");

		// Consumer Chaining
		Consumer<Movie> c1 = m -> System.out.println(m.name + " " + "movie released!!");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " " + "it's a grand success!!");
		Consumer<Movie> c3 = m -> System.out.println(m.name + " " + "and its ROCKY maniaaaa!!");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

		Movie m = new Movie("KGF");
		cc.accept(m);

	}

}
