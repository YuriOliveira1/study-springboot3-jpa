package com.lonftonfando.studyspring.repositories;

import com.lonftonfando.studyspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
