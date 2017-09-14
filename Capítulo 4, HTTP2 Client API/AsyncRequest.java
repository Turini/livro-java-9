import jdk.incubator.http.*;
import java.net.*;

public class AsyncRequest {

	public static void main(String[] args) throws Exception {
		
		HttpClient.newHttpClient()
	.sendAsync(HttpRequest.newBuilder()
		.uri(new URI("https://turini.github.io/livro-java-9/books.csv"))
		.GET().build(), 
		HttpResponse.BodyHandler.asString())
	.whenComplete((r,t) -> System.out.println(r.body()));
	}
}