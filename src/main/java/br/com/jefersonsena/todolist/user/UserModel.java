package br.com.jefersonsena.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // getter, setter
@Entity(name = "tb_users")
public class UserModel {

    @Id // jakarta por causa JPA
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    @Column(unique = true)
    private String userName;
    private String name;
    private String password;
    // getters e setters (da pra usar o "lombok" também)

    // quando o dado for gerado de forma automatica ele vai obter essa informação
    @CreationTimestamp
    private LocalDateTime createdAt; 

    
    
}
