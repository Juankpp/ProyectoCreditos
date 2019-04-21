package controlador;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import modelo.Mundo;
import vista.Interfaz;

/**
 * @author Yefferson Linares
 */
public class Controlador 
{

	private Mundo m;
	private Interfaz inter;
	private String[] datos;
	
	public Controlador()
	{
		m = new Mundo();
		inter = new Interfaz();
		datos = new String[3];
		this.mostrarTodo();
	}
	
	public void pasarTasaEfectiva()
	{
		double interes = Double.parseDouble(inter.capturarDato("Ingresa el interés"+"\n"+"no es necesario que coloques el signo (%)"));
		if(m.getCuentas().calcularTasaefectiva(interes)==-1)
		{
			datos[0] = String.valueOf(m.getCuentas().calcularTasaefectiva(interes));
			inter.getMensajeErroneo("valor de interés no valido, no podre seguir calculando, por favor intenta de nuevo");
		}
		else
		{
			double pro = m.getCuentas().calcularTasaefectiva(interes);
			DecimalFormat formato = new DecimalFormat("#,##%");
			String sas = "Tasa efectiva: "+formato.format(pro);
			inter.getMensaje(sas);
		}
	}
	
	public void pasarAnualidad()
	{
		if(datos[0]!=null)
		{
			
		}
		else
		{
			int periodo = Integer.parseInt(inter.capturarDato("Ingresa el período de tu credito"));
			if(m.getCuentas().calcularAnualidad(periodo)==-1)
			{
				datos[1] = String.valueOf(m.getCuentas().calcularAnualidad(periodo));
				inter.getMensajeErroneo("valor de período no valido, no podre seguir calculando, por favor intenta de nuevo");
			}
			else
			{
				double pro = m.getCuentas().calcularAnualidad(periodo);
				DecimalFormat formato = new DecimalFormat("#.########");
				String sas = "Anualidad: "+formato.format(pro);
				inter.getMensaje(sas);
			}
		}
	}
	
	public void pasarCuota()
	{
		if(datos[1]!=null || datos[0]!=null)
		{
			
		}
		else
		{
			double inversion = Double.parseDouble(inter.capturarDato("Ingresa el monto de inversión"));
			if(m.getCuentas().calcularCuota(inversion)==-1)
			{
				datos[2] = String.valueOf(m.getCuentas().calcularCuota(inversion));
				inter.getMensajeErroneo("Valor de inversión no valido, no podre seguir calculando, por favor intenta de nuevo");
			}
			else
			{
				double pro = m.getCuentas().calcularCuota(inversion);
				DecimalFormat formato = new DecimalFormat("$#,###,###");
				String sas = "Valor cuota: "+formato.format(pro);
				inter.getMensaje(sas);
			}
		}

	}
	
	public void pasarTabla()
	{
		if(datos[0]!=null || datos[1] != null || datos[2] != null)
		{
			
		}
		else
		{
			inter.mostrarTabla(m.getCuentas().calcularTabla(), m.getCuentas().getTitulos());
		}
	}
	
	public void mostrarTodo()
	{
		this.pasarTasaEfectiva();
		this.pasarAnualidad();
		this.pasarCuota();
		this.pasarTabla();
	}	
}