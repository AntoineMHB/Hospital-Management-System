
package DAO;

import java.util.List;
import javax.swing.JOptionPane;
import model.Appointments;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author antoi
 */
public class Appointments_dao {
   public Appointments registerAppointment(Appointments theAppointment) {
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;
    
    try {
        transaction = ss.beginTransaction();
        ss.save(theAppointment);
        transaction.commit();
        return theAppointment;
    } catch (Exception ex) {
        if (transaction != null) {
            transaction.rollback();
        }
        ex.printStackTrace();
    } finally {
        ss.close();
    }
    return null;
}

    
    public List<Appointments> getAllAppointments(){
      try {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(Appointments.class);
        List<Appointments> appointmentList = criteria.list();

        session.close();

        return appointmentList;
    } catch (Exception ex) {
        ex.printStackTrace();
        // Handle exceptions or display an error message
    }
    return null;
    }
    
   public Appointments getAppointmentsByDoctorSpeciality(String doctorSpeciality) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();

           Query query = ss.createQuery("FROM Appointments WHERE doctor_speciality = :doctorSpeciality");
            query.setParameter("doctorSpeciality", doctorSpeciality);

            Appointments foundAppointments = (Appointments) query.uniqueResult();

            ss.close();

            return foundAppointments;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
   
   public Appointments deleteAppointmentsByMedicalId(String medicalId) {
         try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = ss.beginTransaction();

        // Delete appointments directly based on medical_id
        Query query = ss.createQuery("DELETE FROM Appointments WHERE medical_id = :medicalId");
        query.setParameter("medicalId", medicalId);
        int deletedCount = query.executeUpdate();

        transaction.commit();
        ss.close();

        System.out.println(deletedCount + " appointments deleted.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
   }
   

    
}
