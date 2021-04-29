package br.eti.gadelha.controller;

import br.eti.gadelha.persistence.dto.request.DTORequestRole;
import br.eti.gadelha.persistence.dto.response.DTOResponseRole;
import br.eti.gadelha.persistence.model.Role;
import br.eti.gadelha.service.ServiceRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	marcelo.gadelha@marinha.mil.br
 * @link	www.gadelha.eti.br
 **/

@RestController
@RequestMapping
@CrossOrigin(origins = "*", maxAge = 3600)
public class ControllerRole {

    public final ServiceRole serviceRole;

    @Autowired
    private ControllerRole(ServiceRole serviceRole) {
        this.serviceRole = serviceRole;
    }

    @PostMapping("/role")
    public ResponseEntity<DTOResponseRole> create(@RequestBody @Valid DTORequestRole dtoRequestRole) {
        try {
            final Role role = serviceRole.create(dtoRequestRole.toObject());
            return new ResponseEntity<>(DTOResponseRole.toDTO(role), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/role") //@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ResponseEntity<List<Role>> retrieveAll(@RequestParam(required = false) String name) {
        try {
            final List<Role> roles = new ArrayList<>();
            if (name == null)
                serviceRole.retrieve().forEach(roles::add);
            else
                serviceRole.nameContaining(name).forEach(roles::add);
            if (roles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(roles, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    @GetMapping( value = "/role/nome/{nome}" ) //@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
//    public ResponseEntity<Role> retrieveByName(@PathVariable("nome") String role) {
//        Optional<Role> objeto = service.retrieveOptionalByNome(role);
//        if (objeto.isPresent()) {
//            return new ResponseEntity<>(objeto.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
    @GetMapping("/role/{id}") //@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ResponseEntity<DTOResponseRole> retrieve(@PathVariable("id") UUID id) {
        final Optional<Role> role = serviceRole.retrieveOptional(id);
        if (role.isPresent()) {
            return new ResponseEntity<>(DTOResponseRole.toDTO(role.get()), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/role/{id}")
    public ResponseEntity<HttpStatus> update(@PathVariable("id") UUID id, @RequestBody @Valid DTORequestRole dtoRequestRole) {
        Optional<Role> busca = serviceRole.retrieveOptional(id);
        if (busca.isPresent()) {
            busca = Optional.ofNullable(dtoRequestRole.toObject());
            busca.get().setId(id);
            serviceRole.create(busca.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/role/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") UUID id) {
        final Optional<Role> tutorial = serviceRole.retrieveOptional(id);
        if (tutorial.isPresent()) {
            serviceRole.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/role")
    public ResponseEntity<HttpStatus> deleteAll() {
        try {
            serviceRole.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}