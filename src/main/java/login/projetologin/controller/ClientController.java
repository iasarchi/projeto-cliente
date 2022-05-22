package login.projetologin.controller;

import login.projetologin.model.Client;
import login.projetologin.service.ClientService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")

public class ClientController {
    final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    void saveUser(@RequestBody Client client) throws  Exception{
        clientService.saveUser(client);
    }
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','READER')")
    List<Client>print(){
        return clientService.printAllUsers();
    }

}
