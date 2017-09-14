import java.util.concurrent.*;
import static java.util.concurrent.Flow.*;
import java.util.Scanner;

public class EmissorSubscriber {

	public static void main(String[] args) {
		
		SubmissionPublisher<NF> publisher = 
		  new SubmissionPublisher<>();

		NFSubscriber subscriber = new NFSubscriber(); 

		publisher.subscribe(subscriber); 

		// venda concluída
		String thread = Thread.currentThread().getName();

		System.out.println("thread principal: " + thread);
		System.out.println("Gerando a nota");

		NF nf = new NF("Turini", "Livro Java 9", 39.99);

		publisher.submit(nf);

		// outras ações necessárias

		System.out.println("Parabéns pela sua compra");
		publisher.close();

		System.out.println("Aperte o enter para sair");
		new Scanner(System.in).nextLine();
	}
}