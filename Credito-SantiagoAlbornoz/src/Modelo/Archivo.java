package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	//clase Archivo desarollada por Santiago Albornoz Tibasoza
	private BufferedReader br;
	private PrintWriter pw;
	private FileReader fr;
	private FileWriter fw;
	
	public  String leerArchivo() {
		File f= new File("credito.txt"); // la variable f carga el archivo que contiene los 10 digitos correspondintes a la clave y el digito de verificacion
		
		String aux="";
		try {
			fr = new FileReader(f);//crea el flujo hacia f
			br = new BufferedReader(fr);// permite la lectura del archivo
			String linea=br.readLine();//toma el valor de la primera linea
			
			while(linea!=null) {// mientras que encuentre datos en el archivo
				aux+=linea;//la variable auxiliar de tipo String guarda todo lo que se lee del archivo
				linea=br.readLine();
			}
			fr.close();//se cierra el archivo
		}catch(IOException e) {
			System.out.println("ERROR DE LECTURA");
		}
		//System.out.println(aux);	
		return aux;
	}
	/**
	 * recive como parametro el codigo que es insertado desde interfaz
	 * y lo escrive en un archivo de tipo texto llamado clavemasdigito.txt
	 * @param code
	 */
	public void escribirArchivo(String code) {
		File f1 = new File("credito.txt");
		try {
			fw = new FileWriter(f1);//se cre una ruta hacia f1
			pw= new PrintWriter(fw);//pw permite la escritura en el archivo			
			pw.print(code);//escribe el codigo
			fw.close();
		}catch(IOException r) {
			System.out.println("ERROR DE ESCRITURA");
		}
	}

}
