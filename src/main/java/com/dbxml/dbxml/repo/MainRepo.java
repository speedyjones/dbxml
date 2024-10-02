package com.dbxml.dbxml.repo;

import com.dbxml.dbxml.domains.entites.LAD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepo extends JpaRepository<LAD, Integer> {
}
