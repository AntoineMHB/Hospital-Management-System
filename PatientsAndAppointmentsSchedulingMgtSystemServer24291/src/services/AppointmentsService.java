
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Appointments;

/**
 *
 * @author antoi
 */
public interface AppointmentsService extends Remote{
    Appointments recordAppointment(Appointments appointmentsObj) throws RemoteException;
    List<Appointments> getAllAppointments() throws RemoteException;
    Appointments getAppointmentsByDoctorSpeciality(String doctorSpeciality) throws RemoteException;
    Appointments deleteAppointmentsByMedicalId(String medicalId) throws RemoteException;
}
