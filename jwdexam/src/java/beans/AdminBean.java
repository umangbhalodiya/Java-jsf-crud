/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package beans;

import entity.Users;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class AdminBean implements AdminBeanLocal {

    @PersistenceContext(name = "jwdexamPU")
    EntityManager em;

    @Override
    public Collection<Users> getAllUsers() {
        return em.createNamedQuery("Users.findAll").getResultList();
    }

    @Override
    public void addUser(String username, String useraddress, String userpassword, String useremail) {
        Users d = new Users();
        d.setUsername(username);
        d.setUseremail(useremail);
        d.setUseraddress(useraddress);
        d.setUserpassword(userpassword);
        em.persist(d);
    }

    @Override
    public void updateUser(Integer userid, String username, String useraddress, String userpassword, String useremail) {
        Users d = em.find(Users.class, userid);
        d.setUsername(username);
        d.setUseremail(useremail);
        d.setUseraddress(useraddress);
        d.setUserpassword(userpassword);

        em.merge(d);
    }

    @Override
    public void deleteUser(Integer userid) {
        Users d = em.find(Users.class, userid);
        em.remove(d);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Users getUser(Integer userid) {
        return em.find(Users.class, userid);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
