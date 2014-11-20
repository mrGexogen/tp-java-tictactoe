package base;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author s.titaevskiy on 13.09.14.
 */
@Entity
@Table(name = "Users")
public class UserDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    public UserDataSet(String login, String email, String password) {
        this.setId(-1);
        this.setLogin(login);
        this.setEmail(email);
        this.setPassword(password);
    }

    public UserDataSet() {
    }

    public long getId(Long id) {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }

    public void setId(long id) {
        this.id = id;
    }

}