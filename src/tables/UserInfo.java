package tables;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "UserInfo.FindAll", query = "select u from UserInfo u")
})
public class UserInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
