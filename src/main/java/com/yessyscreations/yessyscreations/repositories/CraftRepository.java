package com.yessyscreations.yessyscreations.repositories;

import com.yessyscreations.yessyscreations.models.Craft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CraftRepository extends JpaRepository<Craft, Long> {
}
