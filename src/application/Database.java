package application;

import java.util.ArrayList;
import java.util.List;

import entities.CD;
import entities.DVD;
import entities.Item;

public class Database {

	public static void main(String[] args) {

		List<Item> listDB = new ArrayList<Item>();

		/*
		 * CD CD1 = new CD ("CD1", 15.0, "Comentario CD1", "Artista do CD1", 10);
		 * listDB.add(CD1); int aux = CD1.getFaixas(); System.out.println(aux);
		 */

		listDB.add(new CD("CD1", 15.0, "Comentario CD1", "Artista do CD1", 10));
		listDB.add(new DVD("DVD1", 115.0, "Comentario DVD1", "Diretor do DVD1"));
		listDB.add(new CD("CD2", 17.0, "Comentario CD2", "Artista do CD2", 12));
		listDB.add(new DVD("DVD2", 160.0, "Comentario DVD2", "Diretor do DVD2"));

		// imprime todos itens;
		list(listDB);
		
		// imprime apenas os CDs;
		listCD(listDB);
		
		// imprime apenas os DVDs;
		listDVD(listDB);
	}

	/* imprime todos itens; */
	public static void list(List<Item> listDB) {
		listDB.forEach(System.out::println);
	}

	/* imprime apenas os CDs; 
	public static void listCD(List<Item> listDB) {
		for (int i = 0; i < listDB.size(); i++) {
			if (listDB.get(i).getClass() == CD.class) {
				System.out.println(listDB.get(i));
				//listDB.get(i).print();
			}
			listDB.get(i).print();
		}
	}
	*/
	
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
		for (int i = 0; i < listDB.size(); i++) {
			if (listDB.get(i).getClass() == DVD.class) {
				System.out.println(listDB.get(i));
			}
		}
	}
}
