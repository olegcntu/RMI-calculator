package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IMathImlMulti extends UnicastRemoteObject implements IMath{
    protected IMathImlMulti() throws RemoteException {}

    @Override
    public int operation(int a, int b)  {
        return a*b;
    }
}
