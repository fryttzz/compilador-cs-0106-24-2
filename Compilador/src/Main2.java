package br.com.compilador20242;

import br.com.compilador20242.controller.AnaliseLexica;

public class Main {

	public static void main(String[] args) {
		
		String str = "int x+=12; 13 144\n"
				   + " 		 	 	1	 54 abc 12.7 \n"
				   + "as . ( ) \"\n"
				   + "13.4 + 8 *= 7\n"
				   + "float continue ;\n"
				   + "//isso e um comentario x = 10";
		//int isso;
		System.out.println(new AnaliseLexica().analisar(str));
	}
}
