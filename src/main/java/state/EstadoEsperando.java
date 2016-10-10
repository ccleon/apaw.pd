package state;


public class EstadoEsperando extends State{
	 	
		@Override
		public void recibir(Conexion conexion, int respuesta) {
			if (respuesta == 0){
				conexion.setState(new EstadoPreparado());
				conexion.setEstado(Estado.PREPARADO);
				conexion.getLink().recibir(respuesta);
			}else{
				conexion.setState(new EstadoCerrado());
				conexion.setEstado(Estado.CERRADO);
				conexion.getLink().recibir(respuesta);
			}
		}

		@Override
		public void enviar(Conexion conexion, String msg) {
			throw new UnsupportedOperationException("No permitido"); 
			
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
		public void parar(Conexion conexion) {
			throw new UnsupportedOperationException("No permitido"); 
		}

		@Override
		public void iniciar(Conexion conexion) {
			throw new UnsupportedOperationException("No permitido"); 
		}
	
}
