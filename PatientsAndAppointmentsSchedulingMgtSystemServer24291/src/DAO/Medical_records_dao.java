
package DAO;

import java.util.List;
import javax.swing.JOptionPane;
import model.Medical_records;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author antoi
 */
public class Medical_records_dao {
    public Medical_records registermedrecord(Medical_records themedrecord) {
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;

    try {
        transaction = ss.beginTransaction();
        ss.save(themedrecord);
        transaction.commit();
        return themedrecord;
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

    
    public List<Medical_records> getAllMedicalRecords(){
      try {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(Medical_records.class);
        List<Medical_records> recordsList = criteria.list();

        session.close();

        return recordsList;
    } catch (Exception ex) {
        ex.printStackTrace();
        // Handle exceptions or display an error message
    }
    return null;
    }
    
     public Medical_records getMedicalRecordsByMedicalId(String medicalId) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();

           Query query = ss.createQuery("FROM Medical_records WHERE medical_id = :medicalId");
            query.setParameter("medicalId", medicalId);

            Medical_records foundRecords = (Medical_records) query.uniqueResult();

            ss.close();

            return foundRecords;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
    

    
}
    

    

