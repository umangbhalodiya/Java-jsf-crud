package beans;
import entity.Users;
import java.util.Collection;
import javax.ejb.Local;
@Local
public interface AdminBeanLocal {
    Collection<Users> getAllUsers();
    void addUser(String username, String useraddress, String userpassword, String useremail);
    Users getUser(Integer userid);
    void updateUser(Integer userid, String username, String useraddress, String userpassword, String useremail);
    void deleteUser(Integer userid);
}
