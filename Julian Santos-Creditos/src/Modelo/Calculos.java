package Modelo;

	public class Calculos {

		public double cal_Tasa(String n1) {
			double interes1 = Double.parseDouble(n1);
			double tasaefectiva;
			interes1=1+interes1/100;
			tasaefectiva = Math.pow(interes1,0.083333333)-1;
			return (tasaefectiva);
		}

		public double cal_Cuota(String n1, double n2) {
			double inv = Double.parseDouble(n1);
			double cuota;
			cuota = inv/n2;
			return (cuota);
		}
		
		public double cal_Anual(double n1,String n2) {
			double per = Double.parseDouble(n2);
			double anualidad;
			anualidad = (1-Math.pow((1+n1),(-per)))/n1;
			return (anualidad);
		}
		
}
