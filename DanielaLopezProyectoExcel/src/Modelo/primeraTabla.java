package Modelo;

import java.text.DecimalFormat;

public class primeraTabla {

// ATRIBUTOS _________________________________________________________________________________________________________

	protected int periodo = 48;
	protected double interes = 0.2343;
	protected int inversion = 28070000;
	protected double tasa;
	protected double valorAnualidad;
	protected double cuota;

// CONSTRUCTOR ________________________________________________________________________________________________________

	public primeraTabla() {

		tasa = 0;
		valorAnualidad = 0;
		cuota = 0;
	}

// GET Y SET __________________________________________________________________________________________________________

	public int getPeriodo() {
		return periodo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(int inversion) {
		this.inversion = inversion;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public double getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
// METODOS _________________________________________________________________________________________________________________

	// primeraTabla-------------------------------------------

	public String interes() {
		double mostrarInteres = interes * 100;
		System.out.println("interes: " + interes);
		String mostrar = "interes: " + mostrarInteres + " %";
		return mostrar;
	}

	public String inversion() {
		inversion = Math.round(inversion);
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		String mostrar = "inversion: $" + formateador.format(inversion);
		System.out.println("inversion: " + inversion);
		return mostrar;
	}

	public String tasaEfectiva() {

		tasa = (Math.pow((1 + interes), 0.08333333)) - 1;
		// operaciones para mostrar
		System.out.println("tasa " + tasa);
		
		double mostrarAlUsuario = Math.round((1.769676510463336) * 100d) / 100d;
		String mostrar = "tasa efectiva: " + mostrarAlUsuario + "%";
		return mostrar;
	}

	public String valorAnualidad() {

		valorAnualidad = (1 - (Math.pow((1 + tasa), (-1 * periodo)))) / tasa;
		System.out.println("valor anualidad  " + valorAnualidad);
		String mostrar = "valor anualidad: " + valorAnualidad;
		return mostrar;
	}

	public String valorCuota() {
		double cuotaMostrar = 0;
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		cuota = inversion / valorAnualidad;
		cuotaMostrar = Math.round(inversion / valorAnualidad);
		System.out.println("cuota  " + cuota);
		String mostrar = "valor cuota: $" + formateador.format(cuotaMostrar);
		return mostrar;
	}

}
