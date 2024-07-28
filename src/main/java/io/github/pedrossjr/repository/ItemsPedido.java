package io.github.pedrossjr.repository;

import io.github.pedrossjr.entity.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
