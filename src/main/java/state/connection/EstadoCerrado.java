package state.connection;

public class EstadoCerrado extends State{

	@Override
	public void cerrar(Conexion conexion) {
		
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setState(new EstadoPreparado());
		conexion.setEstado(Estado.PREPARADO);
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("No permitido"); 	
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("No permitido"); 
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("No permitido"); 
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("No permitido"); 
	}

}
