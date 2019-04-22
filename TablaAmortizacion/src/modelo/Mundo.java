package modelo;

public class Mundo {
private Credito c;
private Tabla t;

public Mundo ()
{
	c= new Credito();
	t= new Tabla(49);
}

public Credito getC() {
	return c;
}

public void setC(Credito c) {
	this.c = c;
}

public Tabla getT() {
	return t;
}

public void setT(Tabla t) {
	this.t = t;
}

}
