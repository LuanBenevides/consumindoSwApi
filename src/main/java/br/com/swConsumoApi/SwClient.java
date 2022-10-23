package br.com.swConsumoApi;

import java.util.Scanner;

public class SwClient {

	public static void main(String[] args) throws Exception {
		System.out.println("Consulta de personagens de Star Wars");
		System.out.println("Informe um numero de ID: ");
		@SuppressWarnings("resource")
		Integer id = new Scanner(System.in).nextInt();
		
		People people = SwConnection.buscarPersonagem(id);
		
		System.out.println("Nome: " + people.getName());
		System.out.println("Altura: " + people.getHeight());
		System.out.println("Peso: " + people.getMass());
		System.out.println("Cor do cabelo: " + people.getHair_color());
		System.out.println("Cor da roupa: " + people.getSkin_color());
		System.out.println("Cor dos olhos: " + people.getEye_color());
		System.out.println("Ano de nascimento: " + people.getBirth_year());
		System.out.println("Genero: " + people.getGender());
	}
}
