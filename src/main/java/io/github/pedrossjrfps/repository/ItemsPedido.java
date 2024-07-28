package io.github.pedrossjrfps.repository;

import io.github.pedrossjrfps.entity.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
