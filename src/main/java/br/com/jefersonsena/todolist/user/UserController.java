package br.com.jefersonsena.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

//localhost:8080/

public class UserController {
    
    //passando o objeto criado "UserModel"
    //dentro do body da request

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){

        System.out.println(userModel.getUserName());
    }
}
