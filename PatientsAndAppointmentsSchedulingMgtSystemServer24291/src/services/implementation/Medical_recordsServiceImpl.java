
package services.implementation;

import DAO.Medical_records_dao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Medical_records;
import services.Medical_recordsService;

/**
 *
 * @author antoi
 */
public class Medical_recordsServiceImpl extends UnicastRemoteObject implements Medical_recordsService{
    
    public Medical_recordsServiceImpl() throws RemoteException{
    }
    Medical_records_dao dao = new Medical_records_dao();
   
    @Override
    public Medical_records recordRecord(Medical_records allrecordsObj) throws RemoteException {
        return dao.registermedrecord(allrecordsObj);
    }

    @Override
    public List<Medical_records> getAllMedicalRecords() throws RemoteException {
        return dao.getAllMedicalRecords();
        
           //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medical_records getMedicalRecordsByMedicalId(String medicalId) throws RemoteException {
        return dao.getMedicalRecordsByMedicalId(medicalId);
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
