package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IMathImpl extends UnicastRemoteObject implements IMath {

    protected IMathImpl() throws RemoteException {
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
