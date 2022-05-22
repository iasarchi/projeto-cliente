package login.projetologin.initsecurity;

import login.projetologin.model.Manager;
import login.projetologin.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private ManagerRepository repository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Manager manager = repository.findByUsername("admin");
        if(manager==null){
            manager = new Manager();
            manager.setName("Admin");
            manager.setUsername("admin");
            manager.setPassword("master123");
            manager.getRoles().add("ADMIN");
            repository.save(manager);
        }
        manager = repository.findByUsername("reader");
        if(manager ==null){
            manager = new Manager();
            manager.setName("Reader");
            manager.setUsername("reader");
            manager.setPassword("reader123");
            manager.getRoles().add("READER");
            repository.save(manager);
        }
    }
}