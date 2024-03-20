/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import DAO.All_users_dao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.All_users;
import services.All_usersService;

/**
 *
 * @author antoi
 */
public class All_usersServiceImpl extends UnicastRemoteObject implements All_usersService{
    public All_usersServiceImpl() throws RemoteException{
    }
    //initialization and declaration
    All_users_dao dao = new All_users_dao();
    @Override
    public All_users recordUser(All_users allusersObj) throws RemoteException {
        return dao.registerUser(allusersObj);
    }
    
  


    
    @Override
    public All_users loginAllUsers(String userName, String userType, String password) throws RemoteException {
        return dao.loginAllUsers(userName, userType, password);
    }

    @Override
    public All_users updateUser(String username, String formerPassword, String newPhoneNumber, String newPhysicalAddress, String newPassword) throws RemoteException {
        return dao.updateUser(username, formerPassword, newPhoneNumber, newPhysicalAddress, newPassword);
    }

    @Override
    public All_users getUserByUsername(String userName) throws RemoteException {
        return dao.getUserByUsername(userName);
    }

    @Override
    public List<All_users> getAllUsers() throws RemoteException {
        return dao.getAllUsers();}
   
    
}
