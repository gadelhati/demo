package br.eti.gadelha.service;

import br.eti.gadelha.persistence.model.Role;
import br.eti.gadelha.persistence.model.Tutorial;
import br.eti.gadelha.persistence.repository.RepositoryRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	marcelo.gadelha@marinha.mil.br
 * @link	www.gadelha.eti.br
 **/

@Service
public class ServiceRole implements GenericDAO<Role, UUID> {

    @Autowired
    private RepositoryRole repositoryRole;

    public Role create(Role objeto) {  return repositoryRole.save(objeto);}
    public List<Role> retrieve() {
//        if (serviceUser.getCurrentUser().getRole().getNome().equalsIgnoreCase("ROLE_ADMIN")) {
            return repositoryRole.findAll();
//        }else {
//            return repositorio.findByNomeNotContains("ROLE_ADMIN");
//        }

    }
    public Role update(Role objeto) {   return repositoryRole.save(objeto);}
    public Role retrieve(UUID id) {   return repositoryRole.getOne(id);}
    public void delete(UUID id) {  repositoryRole.deleteById(id);}
    public void deleteAll() {
        repositoryRole.deleteAll();
    }

    public List<Role> nameContaining(String name) { return repositoryRole.findByNameContainingIgnoreCaseOrderByNameAsc(name); }
    public Optional<Role> retrieveOptional(UUID id) { return repositoryRole.findById(id); }
    public Optional<Role> retrieveOptionalByNome(String role) { return repositoryRole.findByName(role); }
    public boolean isNameValid(String value) {
        return repositoryRole.existsByName(value);
    }
}