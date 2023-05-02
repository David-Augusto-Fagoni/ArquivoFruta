package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arquivo {
	
	public void leArquivo(String path, String arquivo) throws IOException {
		File arq = new File(path, arquivo);
		if (arq.exists() && arq.isFile()) {
			FileInputStream abreFluxoArq = 
					new FileInputStream(arq);
			InputStreamReader leitorFluxo = 
					new InputStreamReader(abreFluxoArq);
			BufferedReader buffer = 
					new BufferedReader(leitorFluxo);
			String linha = buffer.readLine();
			while (linha != null) {
				String[] vetLinha = linha.split(",");
				if(vetLinha[2].contains("Fruits")) {
					System.out.println(vetLinha[0] + espaço(vetLinha[0].length()) + 
							vetLinha[1] + espaço(vetLinha[1].length()) +
							vetLinha[3]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitorFluxo.close();
			abreFluxoArq.close();
		}
	}
	public String espaço(int Cont) {
		
		StringBuffer Buffer = new StringBuffer();
		if(Cont == 50) {
			return Buffer.append(" ").toString();
		}else {
			Buffer.append(" ");
			Buffer.append(espaço(Cont+1));
			return Buffer.toString();
		}
		
	}
}
