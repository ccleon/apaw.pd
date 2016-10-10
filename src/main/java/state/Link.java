package state;

public interface Link {

	public static final int ACK = 0;

	void enviar(String msg);

	void recibir(int respuesta);

}
