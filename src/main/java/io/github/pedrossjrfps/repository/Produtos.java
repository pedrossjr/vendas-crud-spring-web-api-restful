package io.github.pedrossjrfps.repository;

import io.github.pedrossjrfps.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
