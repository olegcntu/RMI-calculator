package client;


import server.IMath;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context=new InitialContext();
        IMath iMath=(IMath) context.lookup("rmi://localhost:1099/imath");
        int result=iMath.add(1,2);
        System.out.println(result);

    }
}
