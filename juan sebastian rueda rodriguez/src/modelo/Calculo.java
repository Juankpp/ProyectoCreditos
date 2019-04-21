package modelo;

abstract class Calculo {
	protected String mPeriodo;
	protected String mInteres;
	protected String mInversion;
	protected String mTasaE;
	protected String mAnualidad;
	protected String mCuota;
	protected String mCuota2;
	protected String mAmortizacion;
	protected String mSaldo;


	public Calculo() {
		mPeriodo = null;
		mInteres = null;
		mInversion = null;
		mTasaE = null;
		mAnualidad = null;
		mCuota = null;
		mCuota2 = null;
		mAmortizacion = null;
		mSaldo = null;

	}

	public abstract String calcularTasaEfectiva() throws InteresException;

	public abstract String calcularValorAnualidad() throws PeriodoException;

	public abstract String calcularValorCuota() throws InversionException;

	public abstract String cuotaPesos();

	public String getmPeriodo() {
		return mPeriodo;
	}

	public void setmPeriodo(String mPeriodo) {
		this.mPeriodo = mPeriodo;
	}

	public String getmInteres() {
		return mInteres;
	}

	public void setmInteres(String mInteres) {
		this.mInteres = mInteres;
	}

	public String getmInversion() {
		return mInversion;
	}

	public void setmInversion(String mInversion) {
		this.mInversion = mInversion;
	}

	public String getmTasaE() {
		return mTasaE;
	}

	public String getMtasaE() {
		return mTasaE;
	}

	public void setMtasaE(String mtasaE) {
		this.mTasaE = mtasaE;
	}

	public String getManualidad() {
		return mAnualidad;
	}

	public void setManualidad(String manualidad) {
		this.mAnualidad = manualidad;
	}

	public String getMcuota() {
		return mCuota;
	}

	public void setMcuota(String mcuota) {
		this.mCuota = mcuota;
	}

	public String getmCuota2() {
		return mCuota2;
	}

	public void setmCuota2(String mCuota2) {
		this.mCuota2 = mCuota2;
	}

	public String getmAnualidad() {
		return mAnualidad;
	}

	public void setmAnualidad(String mAnualidad) {
		this.mAnualidad = mAnualidad;
	}

	public String getmCuota() {
		return mCuota;
	}

	public void setmCuota(String mCuota) {
		this.mCuota = mCuota;
	}

	public String getmAmortizacion() {
		return mAmortizacion;
	}

	public void setmAmortizacion(String mAmortizacion) {
		this.mAmortizacion = mAmortizacion;
	}

	public String getmSaldo() {
		return mSaldo;
	}

	public void setmSaldo(String mSaldo) {
		this.mSaldo = mSaldo;
	}

	public void setmTasaE(String mTasaE) {
		this.mTasaE = mTasaE;
	}

}
