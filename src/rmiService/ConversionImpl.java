package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject {

    private static final long serialVersionUID = 1L;
    // 1 EUR = 3.40 TND (taux fixe, a adapter si besoin)
    private static final double TAUX_EUR_TND = 3.40;

    public ConversionImpl() throws RemoteException {
        super();
    }


    public double convertirMontant(double mt) throws RemoteException {
        System.out.println("Requete recue : conversion de " + mt + " EUR");
        return mt * TAUX_EUR_TND;
    }
}
