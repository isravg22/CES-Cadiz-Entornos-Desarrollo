package POO;

public class Guerrero {
	private Personaje personaje;
	private String arma;
	private double desgasteArma;
	public Guerrero(Personaje personaje, String arma, double desgasteArma) {
		super();
		this.personaje = personaje;
		this.arma = arma;
		this.desgasteArma = desgasteArma;
	}
	
	
	public Guerrero() {
		super();
		this.desgasteArma=100.0;		
	}

	
	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public double getDesgasteArma() {
		return desgasteArma;
	}

	public void setDesgasteArma(double desgasteArma) {
		this.desgasteArma = desgasteArma;
	}

	public void usoArma(int n) {
		double arma=0;
		for(int i=0;i<n;i++) {
			arma=getDesgasteArma()-1;

			setDesgasteArma(arma);
		}
	}
	
	
	@Override
	public String toString() {
		return "Guerrero [personaje=" + personaje + ", arma=" + arma + ", desgasteArma=" + desgasteArma + "]";
	}
	
}
