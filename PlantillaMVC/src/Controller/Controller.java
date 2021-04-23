package Controller;

import Model.Personas;
import View.Ventana;

public class Controller {

	
	private Ventana v;
	private Personas p;

	
	public Controller() {
		p = new Personas();
		v = new Ventana();
		
		p.PersonaUp();
		v.VentanaPrincipal();
	}
}
