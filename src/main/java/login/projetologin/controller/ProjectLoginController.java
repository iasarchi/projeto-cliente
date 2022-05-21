package login.projetologin.controller;

import login.projetologin.model.User;
import login.projetologin.service.ProjectLoginService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-login")

public class ProjectLoginController {
    final ProjectLoginService projectLoginService;

    public ProjectLoginController(ProjectLoginService projectLoginService){
        this.projectLoginService = projectLoginService;
    }
    @PostMapping
    void saveUser(@RequestBody User user) throws  Exception{
        projectLoginService.saveUser(user);
    }
    @GetMapping
    List<User>print(){
        return projectLoginService.printAllUsers();
    }
}
