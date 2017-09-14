import java.util.stream.*

public class Fibonacci {

	private long fibonacci(long n) {
	   if(n<2) return n;
	   return fibonacci(n-1) + fibonacci(n-2);
	}

	public void loop(int end) {
		for (int i = 0; i < end; i++) {
			System.out.println(fibonacci(i));
		}
	}

	public void loop(int end) {

	  LongStream
		.range(0, end)
		.map(this::fibonacci)
		.forEach(System.out::println);
	}
}