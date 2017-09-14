import java.util.concurrent.*;
import java.util.Scanner;
import static java.util.concurrent.Flow.*;

public class EmissorExecutor {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		SubmissionPublisher<NF> publisher = 
		  new SubmissionPublisher<>(executorService, 1);

		publisher.consume(WSPrefeitura::emit);

		publisher.consume(data -> {
		  System.out.println("A outra thread é "
		    + Thread.currentThread().getName());
		});

		NF nf = new NF("Turini", "Livro Java 9", 39.99);
		publisher.submit(nf);
	}
}