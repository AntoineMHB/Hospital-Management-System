/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Medical_records;

/**
 *
 * @author antoi
 */
public interface Medical_recordsService extends Remote{
    Medical_records recordRecord(Medical_records allrecordsObj) throws RemoteException;
    List<Medical_records> getAllMedicalRecords() throws RemoteException;
    
    
}
