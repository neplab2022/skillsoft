package com.neplab.skillsoft.repo;

import com.neplab.skillsoft.model.User;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID>{
}
