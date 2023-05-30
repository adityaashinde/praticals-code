package expt5_RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Palinterface extends Remote {
public int palin(String a) throws RemoteException;
}
