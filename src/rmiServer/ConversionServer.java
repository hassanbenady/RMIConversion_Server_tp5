package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            // i. activer l'annuaire RMIRegistry (port 1099)
            LocateRegistry.createRegistry(1099);

            // ii. creer une instance de ConversionImpl
            ConversionImpl conversion = new ConversionImpl();

            // iii. publier la reference dans l'annuaire
            Naming.rebind("rmi://localhost:1099/ConversionService", conversion);

            System.out.println("Serveur de conversion pret (rmi://localhost:1099/ConversionService)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
