package com.example.SpringBootStrap.web.dao;


import com.example.SpringBootStrap.web.model.Role;

import java.util.List;

public interface RoleDao {
    Role getById(Long id);
    Role getRoleByName(String name);
    List<Role> getRoleList();
}
