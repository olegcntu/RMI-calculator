package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IMathDivision extends UnicastRemoteObject implements IMath{
    protected IMathDivision() throws RemoteException {}

    @Override
    public int operation(int a, int b) throws RemoteException {
        return a/b;
    }
}
