package com.krishna.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.krishna.entity.User;


@RepositoryRestResource(path = "myUsers",collectionResourceRel = "customDescription")
public interface UserRepository extends JpaRepository<User, UUID> {

}
