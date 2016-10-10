package state;

public class EstadoParado extends State{
	
	@Override
    public void parar(Conexion conexion) {
        
    }

    @Override
    public void iniciar(Conexion conexion) {
    	conexion.setEstado(Estado.PREPARADO);
    	conexion.setState(new EstadoPreparado());
    }
    
	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("No permitido"); 
	}

	@Override
	public void abrir(Conexion conexion) {
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
