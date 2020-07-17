package com.interviewbit.onlinejudge.Repository;

import com.interviewbit.onlinejudge.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
