package testeJava8;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("teste1", "teste2", "teste3");
		
		lista.forEach(u -> System.out.println(u));
		
	}

}
