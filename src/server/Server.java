package server;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws  RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1100);
        Naming.rebind("rmi://localhost:1100/imath",new IMathImplOperation());


    }
}
