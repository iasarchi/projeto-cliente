package login.projetologin.service;

import login.projetologin.model.Client;
import login.projetologin.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    final ClientRepository clientRepository;

    public ClientService(ClientRepository projectLoginRepository){
        this.clientRepository = projectLoginRepository;
    }
    public void saveUser(Client client) throws Exception{
        clientRepository.save(client);
    }

    public List<Client> printAllUsers() {
        return clientRepository.findAll();
    }


}
