package br.com.dh.company.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.company.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}