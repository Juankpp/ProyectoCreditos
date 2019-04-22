package Modelo;


//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	// ATRIBUTOS
	// _________________________________________________________________________________________________________

	protected static int columnas = 5;
	protected int filas = 0;

	protected primeraTabla Pt;

	protected double cuotaPesos;
	protected double intereses;
	protected double amortizacion;
	protected double saldoPesos;

	private int[][] matriz;

	// CONSTRUCTOR
	// ________________________________________________________________________________________________________

	public Mundo() {

		Pt = new primeraTabla();
		filas = Pt.getPeriodo() + 1;

		matriz = new int[filas][columnas];
	}

	// GET Y SET
	// __________________________________________________________________________________________________________

	public primeraTabla getPt() {
		return Pt;
	}

	public void setPt(primeraTabla pt) {
		Pt = pt;
	}
	// METODOS
	// _________________________________________________________________________________________________________________

// segundaTabla ------------------------------------------
	public void tablaCuota() {

		int a = 0;

		for (int i = 0; i < filas; i++) {

			matriz[i][0] = a;
			a++;

		}
	}
//--------------------------------------------------------------------------------------------------------------------------

	public void cuotaPesos() {
		matriz[0][2] = 0;
		cuotaPesos = Pt.getCuota();

	}

////--------------------------------------------------------------------------------------------------------------------------
	public void intereses() {

		matriz[0][3] = 0;

	}
////--------------------------------------------------------------------------------------------------------------------------

	public void amortizacion() {

		matriz[0][4] = 0;

	}
////--------------------------------------------------------------------------------------------------------------------------

	public void saldoPesos() {

		matriz[0][1] = (int) Pt.getInversion();

	}

//--------------------------------------------------------------------------------------------------------------------------

	public String prueba() {
		String uno = "";
		String mostrar = "";
		cuotaPesos = Pt.getCuota();
		matriz[0][1] = (int) Math.round(Pt.getInversion());
		matriz[Pt.getPeriodo()][1] = 0;
		String titulo = " cuota " + "|" + "      saldo pesos             " + "|" + " cuota pesos       " + "|"
				+ " intereses " + "    |" + " amortizacion";

		for (int i = 1; i < filas; i++) {

			if (saldoPesos >= 0) {

				double a = cuotaPesos;
				matriz[i][2] = (int) a;

				for (int j = 1; j < filas; j++) {

					amortizacion = matriz[j][2] - matriz[j][3];
					double c = amortizacion;
					matriz[j][4] = (int) c;

				}

				for (int j = 1; j < filas; j++) {

					intereses = matriz[j - 1][1] * Pt.getTasa();
					double b = intereses;
					matriz[j][3] = (int) b;
				}

				for (int j = 1; j < filas - 1; j++) {

					saldoPesos = matriz[j - 1][1] - matriz[j][4];
					double d = Math.round(saldoPesos);
					matriz[j][1] = (int) d;

				}

			}
		}
		String y = Math.round(matriz[0][0]) + "          |         " + matriz[0][1] + "              |        "
				+ matriz[0][2] + "                    |           " + matriz[0][3] + "           |     " + matriz[0][4];
		for (int j = 1; j < filas; j++) {
			String x = Math.round(matriz[j][0]) + "          |         " + matriz[j][1] + "             |         "
					+ matriz[j][2] + "          |  " + matriz[j][3] + "        |" + matriz[j][4];
			uno = uno + "\n" + x;

		}
		mostrar = titulo + "\n" + y + "\n" + uno;
		return mostrar;
	}

}
