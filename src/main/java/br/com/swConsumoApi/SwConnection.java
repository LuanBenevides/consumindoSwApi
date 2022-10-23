package br.com.swConsumoApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class SwConnection {

	static String webservice = "https://swapi.dev/api/people/";
	static int sucessCode = 200;
	
	public static People buscarPersonagem(Integer id) throws Exception {
		String urlParaChamada = webservice + id;
		
		try {
			
			URL url = new URL(urlParaChamada);
			HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
			
			if(conexao.getResponseCode() != sucessCode) {
				throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());
			}
			
			BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
			String jsonEmString = SwUtil.converteJsonEmString(resposta);
			
			Gson gson = new Gson();
			People people = gson.fromJson(jsonEmString, People.class);
		
			return people;
		}catch (Exception e) {
			throw new Exception("Erro: " + e);
		}
	}
}
