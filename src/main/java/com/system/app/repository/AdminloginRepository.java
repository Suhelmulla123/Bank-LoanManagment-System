package com.system.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.app.model.AdminLogin;

public interface AdminloginRepository extends JpaRepository<AdminLogin, String> {

}