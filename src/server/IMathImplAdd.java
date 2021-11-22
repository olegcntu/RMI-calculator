package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IMathImplAdd extends UnicastRemoteObject implements IMath {

    protected IMathImplAdd() throws RemoteException {
    }

    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}
