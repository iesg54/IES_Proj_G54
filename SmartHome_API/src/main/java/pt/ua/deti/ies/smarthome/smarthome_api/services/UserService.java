package pt.ua.deti.ies.smarthome.smarthome_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rabbitmq.client.RpcClient.Response;

import pt.ua.deti.ies.smarthome.smarthome_api.exceptions.ResourceNotFoundException;
import pt.ua.deti.ies.smarthome.smarthome_api.model.Utilizador;
import pt.ua.deti.ies.smarthome.smarthome_api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<Utilizador> getUser(String email, String password) throws ResourceNotFoundException {
        if(userRepository.existsByEmail(email)){
            Utilizador account = userRepository.findByEmail(email);

            if (account.getPassword().equals(password)){
                return new ResponseEntity<>(account, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(null, HttpStatus.OK);
            }
        }else{
            throw new ResourceNotFoundException("Não foi encontrada uma conta para o e-mail: " + email);
        }
    }

    public ResponseEntity<List<Utilizador>> getUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Utilizador> registerUser(String email, String nome, String password, String profile_image, Boolean isAdmin){
        return null;
    }
}
