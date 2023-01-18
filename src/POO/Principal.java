package POO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Creo Primer Personaje
		
		Personaje p1= new Personaje();
		String nombre = sc.nextLine();
		p1.setNombre(nombre);
		p1.setPuntos(10);
		
		System.out.println("Dime cuantas vidas quieres para el Guerrero");
		int vidaGuerrero=sc.nextInt();
		p1.setVidas(vidaGuerrero);
		
		//Creo a un Guerrero		
		Guerrero g= new Guerrero();
		g.setPersonaje(p1);
		g.setArma("fusil");
		g.getDesgasteArma();
		System.out.println(g);
		//El objeto tipo Guerrero hará uso de su arma 5 veces.
		g.usoArma(5);
		//Tendrá 2 pérdidas de vida.
		p1.perdidaVida(2);
		System.out.println(g);
		
		
		//Creo Segundo Personaje		
		Personaje p2= new Personaje();
		p2.setNombre("Pedro");
		p2.setPuntos(10);	
		System.out.println("Dime cuantas vidas quieres para el Artillero");
		int vidaArtillero=sc.nextInt();
		p2.setVidas(vidaArtillero);
		//Creo a un Artillero
		
		Artillero a = new Artillero();
		a.setPersonaje(p2);
		a.setTipoArtilleria("Pesado");
		a.getStockMunicion();
		System.out.println(a);
		//El objeto Artillero disparará su arma 7 veces.
		
		a.disparo(7);
		//Tendrá 3 pérdidas de vida.
		p2.perdidaVida(3);
		System.out.println(a);
		sc.close();
		 
	}

}
