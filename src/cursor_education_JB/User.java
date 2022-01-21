package cursor_education_JB;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class User {
    String email;
    LocalDate loginData;
    String team;

    public User(String email, LocalDate loginDate,String team){
        this.email=email;
        this.loginData=loginDate;
        this.team=team;
         }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginData() {
        return loginData;
    }

    public void setLoginData(LocalDate loginData) {
        this.loginData = loginData;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", loginData=" + loginData +
                ", team='" + team + '\'' +
                '}';
    }
}
