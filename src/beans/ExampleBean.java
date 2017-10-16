package beans;

import tables.UserInfo;
import utils.UserDAO;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Named
@SessionScoped
public class ExampleBean implements Serializable {
    @EJB
    UserDAO userDAO;

    private UserInfo userInfo = new UserInfo();

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<UserInfo> getUserList() {
        return userDAO.findAll();
    }

    public void add() {
        userDAO.add(userInfo);
        userInfo = new UserInfo();
    }

    public void delete(int id) {
        userDAO.delete(id);
    }

}
