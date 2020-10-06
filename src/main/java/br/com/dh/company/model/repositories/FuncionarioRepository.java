package br.com.dh.company.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.company.model.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

}