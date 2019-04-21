 package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.*;



public class Archivo {
	private File f;

	public Archivo() {
	
		
	}

	public String leerArchivo() {

		
		String cadena = "";
		File f = new File("src//modelo//tabla.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				
		
                cadena = cadena + linea + "\n";
				System.out.println(linea);
				linea = br.readLine();
			}
			fr.close();
		}

		catch (IOException e) {
			System.out.println("error");
		}
		return cadena;
	}

	public void escribirArchivo(String pTabla)
	{
		File f = new File("src//modelo//tabla.txt");
		
		try
		{
			 FileWriter fw = new FileWriter(f);
			 PrintWriter pw = new PrintWriter(fw);
			 
			
					 
				 pw.print(pTabla);
			 
			 fw.close();
		}
      catch(IOException e)
      {
    	  System.out.println("error");
      }
	}

	
}
