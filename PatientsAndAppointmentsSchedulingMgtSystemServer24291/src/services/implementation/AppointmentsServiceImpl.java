
package services.implementation;

import DAO.Appointments_dao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Appointments;
import services.AppointmentsService;

/**
 *
 * @author antoi
 */
public class AppointmentsServiceImpl extends UnicastRemoteObject implements AppointmentsService{

    public AppointmentsServiceImpl() throws RemoteException{
        
    }
    //initialization and declaration
    Appointments_dao dao = new Appointments_dao();
    
    @Override
    public Appointments recordAppointment(Appointments appointmentsObj) throws RemoteException {
        return dao.registerAppointment(appointmentsObj);
    }

    @Override
    public List<Appointments> getAllAppointments() throws RemoteException {
        return dao.getAllAppointments(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Appointments getAppointmentsByDoctorSpeciality(String doctorSpeciality) throws RemoteException {
        return dao.getAppointmentsByDoctorSpeciality(doctorSpeciality);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Appointments deleteAppointmentsByMedicalId(String medicalId) throws RemoteException {
        return dao.deleteAppointmentsByMedicalId(medicalId);
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
