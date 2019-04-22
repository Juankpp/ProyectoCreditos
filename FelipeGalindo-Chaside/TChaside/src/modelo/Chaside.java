package modelo;

public class Chaside {
	int c =0;
	int h =0;
	int a =0;
	int s =0;
	int i =0;
	int d =0;
	int e =0;
	public Chaside() {
		
		
	}
	
	public String CalcularInteres(int z[]) {

	
		
	
			
			if (z[97]==0  ) {
				c++;
				
			}
			if (z[11]==0 ) {
				c++;
			}
			
			if (z[63]==0 ) {
				c++;
			}
			if (z[52]==0) {
				c++;
			}
			if (z[84]==0) {
				c++;
			}
			if ( z[0]==0 ) {
				c++;
			}
			if ( z[77]==0) {
				c++;
			}
			if ( z[19]==0) {
				c++;
				
			}
			if (z[70]==0 ) {
				c++;
			}
			if (z[90]==0 ) {
				c++;
			}
			if (z[8]==0 ) {
				h++;
			}
			if (z[33]==0) {
				h++;
			}
			if (z[79]==0) {
				h++;
			}
			if (z[24]==0) {
				h++;
			}
			if (z[94]==0) {
				h++;
			}
			if (z[66]==0) {
				h++;
			}
			if (z[40]==0) {
				h++;
			}
			if (z[73]==0) {
				h++;
			}
			if (z[55]==0) {
				h++;
			}
			if (z[88]==0) {
				h++;
			}
			
			if (z[20]==0) {
				a++;
			}
			if (z[44]==0) {
				a++;
			}
			if (z[95]==0) {
				a++;
			}
			if (z[56]==0) {
				a++;
			}
			if (z[27]==0) {
				a++;
			}
			if (z[10]==0) {
				a++;
			}
			if (z[4]==0) {
				a++;
			}
			if (z[2]==0) {
				a++;
			}
			if (z[80]==0) {
				a++;
			}
			if (z[36]==0) {
				a++;
			}
			
			if (z[32]==0) {
				s++;
				
			}
			
			if (z[91]==0) {
				s++;
			}
			if (z[69]==0) {
				s++;
			}
			if (z[7]==0) {
				s++;
			}
			
			if (z[86]==0) {
				s++;
				
			}
			
			if (z[61]==0) {
				s++;
				
			}
			
			if (z[22]==0) {
				s++;
				
			}
			
			if (z[43]==0) {
				s++;
				
			}
			
			if (z[15]==0) {
				s++;
				
			}
			
			if (z[51]==0) {
				s++;
			}
			
			if (z[74]==0) {
				i++;
			}
			if (z[5]==0) {
				i++;
			}
			if (z[18]==0) {
				i++;
			}
			if (z[37]==0) {
				i++;
			}
			if (z[59]==0) {
				i++;
			}
			if (z[26]==0) {
			i++;	
			}
			if (z[82]==0) {
				i++;
			}
			if (z[53]==0) {
				i++;
			}
			if (z[46]==0) {
				i++;
			}
			if (z[96]==0) {
				i++;
			}
			if (z[83]==0) {
				d++;
			}
			if (z[30]==0) {
				d++;
			}
			if (z[47]==0) {
				d++;
			}
			if (z[72]==0) {
				d++;
			}
			if (z[4]==0) {
				d++;
			}
			if (z[64]==0) {
				d++;
			}
			if (z[13]==0) {
				d++;
			}
			if (z[36]==0) {
				d++;
			}
			if (z[57]==0) {
				d++;
			}
			if (z[23]==0) {
				d++;
			}
			if (z[76]==0) {
				e++;
			}
			if (z[41]==0) {
				e++;
			}
			if (z[87]==0) {
				e++;
			}
			if (z[16]==0) {
				e++;
			}
			if (z[92]==0) {
				e++;
			}
			if (z[31]==0) {
				e++;
			}
			if (z[67]==0) {
				e++;
			}
			if (z[48]==0) {
				e++;
			}
			if (z[34]==0) {
				e++;
			}
			if (z[60]==0) {
				e++;
			}		
		


			  System.out.println(c+"c1");
			  System.out.println(h+"h1");
			  System.out.println(a+"a1");
			  System.out.println(s+"s1");
			  System.out.println(i+"i1");
			  System.out.println(d+"d1");
			  System.out.println(e+"e1");
		
	  if (c>h &&  c>a && c >s && c>i && c>d && c>e) {
		  System.out.println(c);
		 
		 return "c - Administrativas y Contables \r\n"+" Intereses: Organizativo, Supervision,  Orden ,Análisis y síntesis,Colaboración,Cálculo,Liderazgo,Participación Activa ";
		  
		
	   }
	  
	  if (h>c &&  h>a && h >s && h>i && h>d && h>e) {
		  System.out.println(h);
			return "H – Humanísticas y Sociales \r\n"+"Intreses: Precisión Verbal,Organización,Relación de Hechos, Relación de Hechos, Lingüística, Orden, Justicia, El hombre analítico";
			  
			
		   }
	  if (a>c &&  a>h && a >s && a>i && a>d && a>e) {
	
		  
		  return " A - Artísticas \r\n"+" Intreses: Sensible,Imaginativo,Creativo,Detallista,Innovador,Intuitivo,Paciente,Espontáneo";
			  
			
		   }
	  
	  if (s>c &&  s>h && s>a && s>i && s>d && s>e) {
		  
		  return "S  – Medicina y Cs. De la Salud \r\n"+"Intreses: Asistir,Investigativo,Senso-Perceptivo,Analítico,Ayudar,Curar,Rehabilitar";
			  
			
		   }
	  
	  if (i>c &&  i>h && i>a && i>s && i>d && i>e) {
		  
		  return "I  – Ingeniería y Computación\r\n"+"Intreses:Cálculo,Científico,Manual,Exacto,Planificar,Organizar,Controlar";
			  
			
		   }
	  if (d>c &&  d>h && d>a && d>s && d>i && d>e) {
		  
		  return "D - Defensa y Seguridad\r\n"+"Intreses:Justicia,Equidad.Colaboración,Espíritu de Equipo,Liderazgo,Coordinación,Destreza Física";
			  
			
		   }
	  if (e>c &&  e>h && e>a && e>s && e>i && e>d) {
		  
		  return "E - Ciencias Exactas y Agrarias\r\n" + "Intereses : Investigación,Orden,Organización,Análisis y Síntesis,Numérico,Clasificar,Precisión,Exacto ";
			  
			
		   }

	  else {
		  
		  System.out.println(0);
		  return "Tienes dos o mas Aptitudes puedes volver hacer el cuestionario\r";
	  }	
		
  
		
	}
	
	public String CalcularAptitudes(int z []) {
		
		c=0;
		h=0;
		a = 0;
		s=0;
		i=0;
		d=0;
		e=0;
		
		if (z[14]==0  ) {
			c++;
			
		}
		if (z[50]==0  ) {
			c++;
			
		}
		if (z[1]==0  ) {
			c++;
			
		}
		if (z[45]==0  ) {
			c++;
			
		}
		
		if (z[62]==0  ) {
			h++;
			
		}
		
		if (z[29]==0  ) {
			h++;
			
		}
		
		if (z[71]==0  ) {
			h++;
			
		}
		if (z[85]==0  ) {
			h++;
			
		}
		if (z[21]==0  ) {
			a++;
			
		}
		
		if (z[38]==0  ) {
			a++;
			
		}
		
		if (z[75]==0  ) {
			a++;
			
		}
		
		if (z[81]==0  ) {
			a++;
			
		}
		if (z[68]==0  ) {
			s++;
			
		}
		if (z[39]==0  ) {
			s++;
			
		}
		
		if (z[28]==0  ) {
			s++;
			
		}
		if (z[3]==0  ) {
			s++;
			
		}
		if (z[25]==0  ) {
			i++;
			
		}
		if (z[58]==0  ) {
			i++;
			
		}if (z[89]==0  ) {
			i++;
			
		}if (z[9]==0  ) {
			i++;
			
		}
		
		if (z[12]==0  ) {
			d++;
			
		}
		if (z[65]==0  ) {
			d++;
			
		}
		if (z[17]==0  ) {
			d++;
			
		}
		if (z[42]==0  ) {
			d++;
			
		}
		if (z[93]==0  ) {
			e++;
			
		}
		
		if (z[6]==0  ) {
			e++;
			
		}
		if (z[78]==0  ) {
			e++;
			
		}
		if (z[54]==0  ) {
			e++;
			
		}
		
		
		System.out.println(c+"c2");
		  System.out.println(h+"h2");
		  System.out.println(a+"a2");
		  System.out.println(s+"s2");
		  System.out.println(i+"i2");
		  System.out.println(d+"d2");
		  System.out.println(e+"e2");
		  if (c>h &&  c>a && c >s && c>i && c>d && c>e) {
			  System.out.println(c);
			 
			 return "c - administrativas y contables "+"\n"+" Aptitudes: Persuasivo, Objetivo,Practico,Tolerante,Responsable,Ambicioso,Dinamico,Resulotivo ";
			  
			
		   }
		  
		  if (h>c &&  h>a && h >s && h>i && h>d && h>e) {
			  
				return "H- Humanistica y sociales"+"\n"+"Aptitudes: Responsable, Justo, Conciliador,Persuasivo,Sagaz, Imagitivo,Comprensivo,Estabilidad Emocional";
				  
				
			   }
		  if (a>c &&  a>h && a >s && a>i && a>d && a>e) {
			
			  
			  return "A- Artisticas"+"\n"+"Aptitudes:  Sensible, Imagitivo, Cretivo,Detallista,Intutivo,Paciente,Espontaneo";
				  
				
			   }
		  
		  if (s>c &&  s>h && s>a && s>i && s>d && s>e) {
			  
			  return "S- Medicina y cs. De la Salud "+"\n"+"Aptitudes: Altruista,Solitario,Paciente,Comprensivo,Respetuoso,Persusivo,Servicial,Observador";
				  
				
			   }
		  
		  if (i>c &&  i>h && i>a && i>s && i>d && i>e) {
			  
			  return "I - Ingenieria y Computacion "+"\n"+"Aptitudes: Preciso,Practico ,Critico,Analitico,Rigido,Racional,Independiente";
				  
				
			   }
		  if (d>c &&  d>h && d>a && d>s && d>i && d>e) {
			  
			  return "D -Defensa y Seguridad "+"\n"+"Aptitudes: Arriesgado, Solidario,Valiente,Agresivo,Persusivo,Aventurero,Equilibrio Psiquico";
				  
				
			   }
		  if (e>c &&  e>h && e>a && e>s && e>i && e>d) {
			 
			  return "E -Ciencias Exactas y Agrarias"+"\n"+"Aptitudes : Metodico , Analitico, Observador,Intrivortido,Paciente,Seguro,Independiente, Intuitivo";
				  
				
			   }

		  else {
			  
		
			  return "Tienes dos o mas Aptitudes puedes volver hacer el cuestionario\r";
		  }	
		
		
		
		
		
	}
	
	
	
	
	
}



