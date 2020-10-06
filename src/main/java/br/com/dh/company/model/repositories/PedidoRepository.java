package br.com.dh.company.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.company.model.entities.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, String> {

}