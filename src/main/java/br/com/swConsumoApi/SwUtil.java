package br.com.swConsumoApi;

import java.io.BufferedReader;
import java.io.IOException;

public class SwUtil {

public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException {
		
		String resposta, jsonEmString = "";
		
		while((resposta = bufferedReader.readLine()) != null) {
			jsonEmString += resposta;
		}
		
		return jsonEmString;
	}
}
