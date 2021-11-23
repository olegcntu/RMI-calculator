package client;


import server.IMath;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class Client {

    public int inquiry (int num1, int num2, String param) throws NamingException, RemoteException {
        Context context = new InitialContext();

        IMath iMath = (IMath) context.lookup("rmi://localhost:1100/imath");

        int result = iMath.operation(num1, num2, param);
        return result;

    }
}
