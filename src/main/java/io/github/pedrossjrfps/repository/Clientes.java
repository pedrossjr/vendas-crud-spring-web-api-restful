package io.github.pedrossjrfps.repository;

import io.github.pedrossjrfps.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Integer> {

}
