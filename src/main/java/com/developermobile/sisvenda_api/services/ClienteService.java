package com.developermobile.sisvenda_api.services;

import com.developermobile.sisvenda_api.dto.ClientDTO;
import com.developermobile.sisvenda_api.dto.ClientMinDTO;
import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.repository.ClientRepository;
import com.developermobile.sisvenda_api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<ClientMinDTO> findAll() {
        return repository.findAll().stream().map(ClientMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        return repository.findById(id).map(ClientDTO::new).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Client insert(Client client) {
        return repository.save(client);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Client update(Long id, Client client) {
        Client entity = repository.getReferenceById(id);
        updateData(entity, client);
        return repository.save(entity);
    }

    private void updateData(Client entity, Client obj) {
        entity.setName(obj.getName());
        entity.setAddress(obj.getAddress());
        entity.setNeighborhood(obj.getNeighborhood());
        entity.setCity(obj.getCity());
        entity.setFu(obj.getFu());
        entity.setZipcode(obj.getZipcode());
        entity.setPhone(obj.getPhone());
        entity.setEmail(obj.getEmail());
    }
}
