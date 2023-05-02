package view;

import java.io.IOException;

import controller.Arquivo;

public class Principal {

	public static void main(String[] args) {
		String path = "C:\\TEMP";
		String arq = "generic_food.csv";
		
		Arquivo arquivo = new Arquivo();
		try {
			arquivo.leArquivo(path, arq);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
