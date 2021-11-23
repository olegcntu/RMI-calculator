package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//nicastRemoteObject -Базові функціональні відносини ,
// необхідня для керування віддаленими обєктами.

public class IMathImplOperation extends UnicastRemoteObject implements IMath {

    protected IMathImplOperation() throws RemoteException {
    }

    @Override
    public int operation(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return resultOperationAdd(a, b);
            case "*":
                return resultOperationMult(a, b);
            case "/":
                return resultOperationDiv(a, b);
        }
        return 0;

    }

    private int resultOperationAdd(int a, int b) {
        return a + b;
    }

    private int resultOperationDiv(int a, int b) {
        return a / b;
    }

    private int resultOperationMult(int a, int b) {
        return a * b;
    }
}
