package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMath extends Remote {
    int operation(int a, int b, String operation) throws RemoteException;

}
