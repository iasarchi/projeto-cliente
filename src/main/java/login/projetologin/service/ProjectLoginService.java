package login.projetologin.service;

import login.projetologin.model.User;
import login.projetologin.repository.ProjectLoginRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectLoginService {
    final ProjectLoginRepository projectLoginRepository;

    public ProjectLoginService(ProjectLoginRepository projectLoginRepository){
        this.projectLoginRepository = projectLoginRepository;
    }
    public void saveUser(User user) throws Exception{
        projectLoginRepository.save(user);
    }

    public List<User> printAllUsers() {
        return projectLoginRepository.findAll();
    }


}
