package modelo;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Tabla {
	private double periodo;
	private double saldo;
	private double cuota;
	private double intereses;
	private double amortizacion;
	
	
	

	public Tabla() {
		periodo =0;
		saldo =0;
		cuota =0;
		intereses =0;
		amortizacion =0;
		

	}




	public double getPeriodo() {
		return periodo;
	}




	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}




	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	public double getCuota() {
		return cuota;
	}




	public void setCuota(double cuota) {
		this.cuota = cuota;
	}




	public double getIntereses() {
		return intereses;
	}




	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}




	public double getAmortizacion() {
		return amortizacion;
	}




	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	

	


}
