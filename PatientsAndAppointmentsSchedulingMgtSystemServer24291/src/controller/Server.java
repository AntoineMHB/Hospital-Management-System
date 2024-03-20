package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import services.implementation.All_usersServiceImpl;
import services.implementation.AppointmentsServiceImpl;
import services.implementation.Medical_recordsServiceImpl;

public class Server {
    public static void main(String[] args) {
        try {
            // Set properties
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            System.setProperty("java.rmi.server.codebase", "http://127.0.0.1/classes/services/");

            // Create Registry
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("theUser", new All_usersServiceImpl());
            theRegistry.rebind("theAppointment", new AppointmentsServiceImpl());
            theRegistry.rebind("themedrecord", new Medical_recordsServiceImpl());

            System.out.println("Server is Running on port 6000");
            Thread.currentThread().join();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
