import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora{

	private static final long serialVersionUID = 1L;

	public Calculadora() throws RemoteException {
		super();
	}
	
	public int adicao(int x, int y) throws RemoteException {
		return x + y;
	}
	
	public int subtracao(int x, int y) throws RemoteException {
		return x - y;
	}
	
	public int multiplicacao(int x, int y) throws RemoteException {
		return x * y;
	}
	
	public int divisao(int x, int y) throws RemoteException {
		return x / y;
	}
}
