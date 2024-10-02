package com.securityPractice.springboot.repositorys;

import com.securityPractice.springboot.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
    Login findByEmail(String email);

    List<Login> findByRole(String user);

//    @Query("select user_id from login where role=\"USER\"")
//    List<Integer> findByUserId(String role);
}
