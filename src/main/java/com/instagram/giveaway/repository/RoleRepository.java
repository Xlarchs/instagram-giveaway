package com.instagram.giveaway.repository;

import com.instagram.giveaway.model.ERoles;
import com.instagram.giveaway.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERoles name);
}
