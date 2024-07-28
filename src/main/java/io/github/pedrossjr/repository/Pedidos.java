package io.github.pedrossjr.repository;

import io.github.pedrossjr.entity.Cliente;
import io.github.pedrossjr.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente( Cliente cliente);
}
