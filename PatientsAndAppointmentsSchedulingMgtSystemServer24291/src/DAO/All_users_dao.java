
package DAO;

import java.util.List;
import javax.swing.JOptionPane;
import model.All_users;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author antoi
 */
public class All_users_dao {
   public All_users registerUser(All_users theUser) {
    Session ss = null;
    try {
        ss = HibernateUtil.getSessionFactory().openSession();
        ss.save(theUser);
        ss.beginTransaction().commit();
        return theUser; // Return theUser upon successful registration
    } catch (Exception ex) {
        ex.printStackTrace();
        // Handle the exception by rolling back the transaction if it's still active
        if (ss != null && ss.getTransaction().isActive()) {
            ss.getTransaction().rollback();
        }
        // Throw a custom exception or handle the error in another way, such as logging or alerting the user
        throw new RuntimeException("Failed to register the user: " + ex.getMessage());
    } finally {
        if (ss != null && ss.isOpen()) {
            ss.close(); // Ensure session is closed regardless of success or failure
        }
    }
}

    
   public List<All_users> getAllUsers() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(All_users.class);
        List<All_users> userList = criteria.list();

        session.close();

        return userList;
    } catch (Exception ex) {
        ex.printStackTrace();
        // Handle exceptions or display an error message
    }
    return null;
}

    
     // Method for All_users Login
  public All_users loginAllUsers(String userName, String userType, String password) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM All_users WHERE user_name = :userName AND user_type = :userType AND password = :password");
        query.setParameter("userName", userName);
        query.setParameter("userType", userType);
        query.setParameter("password", password);
        All_users user = (All_users) query.uniqueResult();
        session.close();
        return user;

    } catch (HibernateException ex) {
        ex.printStackTrace(); 
    } catch (Exception ex) {
        ex.printStackTrace(); 
    }
    return null;
}
  
  public All_users updateUser(String username, String formerPassword, String newPhoneNumber, String newPhysicalAddress, String newPassword) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM All_users WHERE user_name = :username AND password = :password");
        query.setParameter("username", username);
        query.setParameter("password", formerPassword);
        All_users user = (All_users) query.uniqueResult();
        
        if (user != null) {
            // Update the fields
            user.setPassword(newPassword);
            user.setPhone_number(newPhoneNumber);
            user.setPhysical_address(newPhysicalAddress);

            // Save the changes
            session.update(user);
            session.getTransaction().commit();
            return user;
        } else {
            System.out.println("User not found or incorrect credentials!");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        // Handle exceptions
    }
    return null;
}
  
  public All_users getUserByUsername(String userName) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();

            Query query = ss.createQuery("FROM All_users WHERE user_name = :userName");
            query.setParameter("userName", userName);

            All_users foundUser = (All_users) query.uniqueResult();

            ss.close();

            return foundUser;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }



    

    
}
