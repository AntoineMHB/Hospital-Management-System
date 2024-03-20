/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.All_users;
import model.Medical_records;

/**
 *
 * @author antoi
 */
public interface All_usersService extends Remote{
    All_users recordUser(All_users allusersObj) throws RemoteException;
    All_users loginAllUsers(String userName, String userType, String password) throws RemoteException;
    List<All_users> getAllUsers() throws RemoteException;
    All_users updateUser(String username, String formerPassword, String newPhoneNumber, String nwePhysicalAddress, String newPassword) throws RemoteException;
    All_users getUserByUsername(String userName) throws RemoteException;  
    Medical_records getMedicalRecordsByMedicalId(String medicalId) throws RemoteException;  

}
