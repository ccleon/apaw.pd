package state;

import state.Estado;
import state.Link;

public class Conexion {

	private Estado estado;
    private Link link;
	private State state;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        this.setState (new EstadoCerrado());
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

    public void abrir() {
        state.abrir(this);
    }

    public void cerrar() {
    	state.cerrar(this);
    }

    public void parar() {
    	state.parar(this);
    }

    public void iniciar() {
    	state.iniciar(this);
    }

    public void enviar(String msg) {
    	state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
    	state.recibir(this, respuesta);
    }

}
