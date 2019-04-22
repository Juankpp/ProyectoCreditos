package modelo;

public class Credito {
private double periodo;
private double inversion;
private double tasaEfectiva;
private double anualidad;
private double intereses;
private double cuota;

public Credito()
{
	tasaEfectiva=0;
}

public double tasaEfectiva(double intereses)
{
	tasaEfectiva= ((Math.pow((1+intereses/100),0.08333333333)-1));
	return tasaEfectiva;
}
public double Anualidad(double tasaEfectiva, double periodo)
{
	 anualidad=(1-(Math.pow((1+tasaEfectiva), -periodo)));
	 return anualidad=anualidad/tasaEfectiva;
}
public double cuota()
{
	return cuota=inversion/anualidad;
}
public double getCuota() {
	return cuota;
}
public void setCuota(double cuota) {
	this.cuota = cuota;
}

public double getPeriodo() {
	return periodo;
}

public void setPeriodo(double periodo) {
	this.periodo = periodo;
}

public double getInversion() {
	return inversion;
}

public void setInversion(double inversion) {
	this.inversion = inversion;
}

public double getTasaEfectiva() {
	return tasaEfectiva;
}

public void setTasaEfectiva(double tasaEfectiva) {
	this.tasaEfectiva = tasaEfectiva;
}

public double getAnualidad() {
	return anualidad;
}

public void setAnualidad(double anualidad) {
	this.anualidad = anualidad;
}

public double getIntereses() {
	return intereses;
}

public void setIntereses(double intereses) {
	this.intereses = intereses;
}

}
