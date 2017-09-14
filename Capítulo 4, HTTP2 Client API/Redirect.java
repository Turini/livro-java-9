import jdk.incubator.http.*;
import java.net.*;

public class Redirect {

	public static void main(String[] args) throws Exception {
		
		HttpClient.newBuilder()
		  .followRedirects(HttpClient.Redirect.SECURE)
		  .version(HttpClient.Version.HTTP_2)
		  .build()	
		  .send(HttpRequest.newBuilder()				
			.uri(new URI("https://google.com/"))				
			.GET()
			.build(), 	
		  HttpResponse.BodyHandler.asString()).body();
	}
}