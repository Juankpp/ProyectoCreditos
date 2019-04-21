package modelo;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Credito {
	
	private double periodo;
	private double interes;
	private double inversion;
	private double tazaEfectiva;
	private double valorCuota;
	private double valorAnualidad;
	
	public Credito() {
		super();
		this.periodo = 0;
		this.interes = 0;
		this.inversion = 0;
		this.tazaEfectiva = 0;
		this.valorCuota = 0;
		this.valorAnualidad = 0;
	}

	public double getPeriodo() {
		return periodo;
	}

	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getInvercion() {
		return inversion;
	}

	public void setInvercion(double invercion) {
		this.inversion = invercion;
	}

	public double getTazaEfectiva() {
		return tazaEfectiva;
	}

	public void setTazaEfectiva(double tazaEfectiva) {
		this.tazaEfectiva = tazaEfectiva;
	}

	public double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}

	public double getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}
	
	

	
	

	

}
