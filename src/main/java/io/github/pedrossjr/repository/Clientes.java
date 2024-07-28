package io.github.pedrossjr.repository;

import io.github.pedrossjr.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Integer> {

}
