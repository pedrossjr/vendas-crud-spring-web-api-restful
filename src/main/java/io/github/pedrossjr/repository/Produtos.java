package io.github.pedrossjr.repository;

import io.github.pedrossjr.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
