package org.example.movie.repository;

import org.example.movie.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    boolean existsByFullName(String username);

    Optional<Account> findByFullName(String username);
}
