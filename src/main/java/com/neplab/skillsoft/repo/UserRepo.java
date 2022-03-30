package com.neplab.skillsoft.repo;

import com.neplab.skillsoft.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}
