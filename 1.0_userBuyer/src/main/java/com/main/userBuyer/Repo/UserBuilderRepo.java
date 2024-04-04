package com.main.userBuyer.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.main.userBuyer.model.CompositeKeys;
import com.main.userBuyer.model.UserBuilder;

public interface UserBuilderRepo extends JpaRepository<UserBuilder, CompositeKeys> {

	@Query("SELECT ub FROM UserBuilder ub WHERE ub.userBuilder1ID = :userBuilder1ID AND ub.userBuilder2ID = :userBuilder2ID")
    UserBuilder findByUser(UUID userBuilder1ID, UUID userBuilder2ID);
}
