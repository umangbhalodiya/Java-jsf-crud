/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package beans;

import entity.Users;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface AdminBeanLocal {

    Collection<Users> getAllUsers();

    void addUser(String username, String useraddress, String userpassword, String useremail);

    Users getUser(Integer userid);

    void updateUser(Integer userid, String username, String useraddress, String userpassword, String useremail);

    void deleteUser(Integer userid);
}
