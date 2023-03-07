package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CD;
import entities.DVD;
import entities.Item;

public class Database {

	public static void main(String[] args) {

		List<Item> listDB = new ArrayList<Item>();

		CD cd1 = new CD("Back in Black", 42.4, "Coment�rios sobre Back in Black", "AC/DC", 10);
		CD cd2 = new CD("Thriller", 42.2, "Coment�rios sobre Thriller", "Michael Jackson", 9);
		CD cd3 = new CD("Dark Side of the Moon", 43.0, "Coment�rios sobre Dark Side of the Moon", "Pink Floyd", 10);
		CD cd4 = new CD("Nevermind", 49.0, "Coment�rios sobre Nevermind", "Nirvana", 12);
		CD cd5 = new CD("Abbey Road", 47.0, "Coment�rios sobre Abbey Road", "The Beatles", 17);
		DVD dvd1 = new DVD("The Godfather", 175.0, "Coment�rios sobre The Godfather", "Francis Ford Coppola");
		DVD dvd2 = new DVD("The Shawshank Redemption", 142.0, "Coment�rios sobre The Shawshank Redemption", "Frank Darabont");
		DVD dvd3 = new DVD("The Dark Knight", 152.0, "Coment�rios sobre The Dark Knight", "Christopher Nolan");
		DVD dvd4 = new DVD("Pulp Fiction", 154.0, "Coment�rios sobre Pulp Fiction", "Quentin Tarantino");
		DVD dvd5 = new DVD("The Lord of the Rings: The Fellowship of the Ring", 178.0, "Coment�rios sobre The Lord of the Rings", "Peter Jackson");

		listDB.add(cd1);
		listDB.add(cd2);
		listDB.add(cd3);
		listDB.add(cd4);
		listDB.add(cd5);
		listDB.add(dvd1);
		listDB.add(dvd2);
		listDB.add(dvd3);
		listDB.add(dvd4);
		listDB.add(dvd5);
		
		menu(listDB);
	}

	/* imprime todos itens; */
	public static void list(List<Item> listDB) {
		listDB.forEach(item -> {
			System.out.println(item.toString());
		});
	}

	/* imprime apenas os CDs; */
	public static void listCD(List<Item> listDB) {
		for (Item item : listDB) {
			if (item instanceof CD) {
				System.out.println(item);
			}
		}
	}

	/* imprime apenas os DVDs; */
	public static void listDVD(List<Item> listDB) {
		listDB.stream().filter(item -> item instanceof DVD).forEach(System.out::println);
	}

	/* Funcao para o usuario escolher o que quer fazer */
	public static void menu(List<Item> listDB) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {			
			System.out.println("1 - Imprimir todos os itens");
			System.out.println("2 - Imprimir apenas os CDs");
			System.out.println("3 - Imprimir apenas os DVDs");
			System.out.println("0 - Encerrar aplicacao");
			System.out.print("Escolha uma op��o: ");

			opcao = sc.nextInt(); /* Ler a op��o escolhida pelo usu�rio */

			System.out.println();
			
			switch (opcao) {
			case 1:
				list(listDB);
				break;
			case 2:
				listCD(listDB);
				break;
			case 3:
				listDVD(listDB);
				break;
			case 0:
				System.out.println("Adeus...");
				break;
			default:
				System.out.println("Op��o inv�lida. Tente novamente.");
			}
		} while (opcao != 0);
		
		sc.close();	
	}
}
