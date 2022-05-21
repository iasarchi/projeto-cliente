package login.projetologin.model;



import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "TB_LOGIN_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,length = 50)
    private String name;
    @Column(nullable = false,unique = true,length = 20)
    private String login;
    @Column(nullable = false,length = 20)
    private String password;



}
