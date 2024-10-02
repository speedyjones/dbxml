package com.dbxml.dbxml.repo;

import com.dbxml.dbxml.domains.entites.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumersRepo extends JpaRepository<Consumer, Integer> {
}
