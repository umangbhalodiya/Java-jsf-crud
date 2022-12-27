package jsfcdibean;
import beans.AdminBeanLocal;
import entity.Users;
import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
@Named(value = "userbean")
@ApplicationScoped
public class userbean {

   @EJB
    private AdminBeanLocal adminbean;

    private String username;
    private String useremail;
    private String useraddress;
    private String userpassword;
    private Integer userid;
    Users d = new Users();
    Collection<Users> dl;

    public Collection<Users> showData() {
        return adminbean.getAllUsers();

    }

    public String addUsers() {
        adminbean.addUser(username, useraddress, userpassword, useremail);
        username = "";
        useremail = "";
        useraddress = "";
        userpassword = "";
        return "display";
    }

//    public String deleteDepartment(Integer id) {
//        adminbean.deleteDepartment(id);
//        return "display";
//    }
//
//    public String updateForm(Integer id) {
//        d = adminbean.getDepartment(id);
//        Dname = d.getDname();
//        return "update";
//    }
//
//    public String updateFormData() {
//        d.setDname(Dname);
//        adminbean.updateDepartment(d.getId(), d.getDname());
//        Dname = "";
//        return "display";
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    
    public userbean() {
    }
    
}
