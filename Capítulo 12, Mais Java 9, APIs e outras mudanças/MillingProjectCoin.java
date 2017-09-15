import java.lang.reflect.Field;
import java.util.*;
import java.io.*;
import java.util.concurrent.*; 

class MillingProjectCoin {

	public static void main(String[] args) throws Exception {
		
		// pre-JDK7
		Map<Integer, String> map = new HashMap<Integer, String>();

		// pos-JDK7
		Map<Integer, String> map2 = new HashMap<>();

		// operador diamante em classes anônimas
		Callable<String> callable = new Callable<>() {
		  @Override
		  public String call() {
		    return "finalmente podemos fazer isso";
		  }
		};

		// String _ = "sim, isso funcionava"; agora não compila!

		// assim ainda funciona, claro
		final int NUMERO_MAGICO = 23;

		// private final byte[] value;
		Field value = String.class.getDeclaredField("value");
		System.out.println(value);
	}

	public static void read(BufferedReader reader) {
		try (reader) {
			//...
		} catch (Exception e) {
			// ops, alguma coisa deu errado
		}
	}

	public Callable<String> ultraImportantMethod() {
		// operador diamante em classes anônimas
		return new Callable<>() {
			@Override
			public String call() {
				return "finalmente podemos fazer isso";
			}
		};
	}
}