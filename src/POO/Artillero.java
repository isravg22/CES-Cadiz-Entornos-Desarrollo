package POO;

public class Artillero {
	private Personaje personaje;
	private String TipoArtilleria;
	private Integer stockMunicion;
	public Artillero(Personaje personaje, String tipoArtilleria, Integer stockMunicion) {
		super();
		this.personaje = personaje;
		TipoArtilleria = tipoArtilleria;
		this.stockMunicion = stockMunicion;
	}
	public Artillero() {
		super();
		this.stockMunicion = 200;
		
	}
	
	
	public Personaje getPersonaje() {
		return personaje;
	}


	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}


	public String getTipoArtilleria() {
		return TipoArtilleria;
	}


	public void setTipoArtilleria(String tipoArtilleria) {
		TipoArtilleria = tipoArtilleria;
	}


	public Integer getStockMunicion() {
		return stockMunicion;
	}


	public void setStockMunicion(Integer stockMunicion) {
		this.stockMunicion = stockMunicion;
	}
	
	public void disparo(int n) {
		Integer disparar=0;
		for (int i=0;i<n;i++) {
			disparar=getStockMunicion()-1;
			setStockMunicion(disparar);
		}
		
	}

	@Override
	public String toString() {
		return "Artillero [personaje=" + personaje + ", TipoArtilleria=" + TipoArtilleria + ", stockMunicion="
				+ stockMunicion + "]";
	}
	
}
