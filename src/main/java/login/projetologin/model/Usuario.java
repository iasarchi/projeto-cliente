package login.projetologin.model;



import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,unique = true,length = 20)
    private String login;
    @Column(nullable = false,length = 20)
    private String senha;


}
