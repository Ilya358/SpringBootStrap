package com.example.SpringBootStrap.web.service;

import com.example.SpringBootStrap.web.model.Role;

import java.util.List;

public interface RoleService {

    Role getById(Long id);

    Role getRoleByName(String name);

    List<Role> roleList();
}
