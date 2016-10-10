package state;

public class EstadoPreparado extends State{

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setState (new EstadoCerrado());
		conexion.setEstado (Estado.CERRADO);
	}

	@Override
	public void abrir(Conexion conexion) {
		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setState (new EstadoParado());
		conexion.setEstado(Estado.PARADO);
	}

	@Override
	public void iniciar(Conexion conexion) {
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("No permitido"); 
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.setState (new EstadoEsperando());
		conexion.setEstado(Estado.ESPERANDO);
		conexion.getLink().enviar(msg);
		
	}

}
