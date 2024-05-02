package vn.nhannt.laptopshop.service;

import org.springframework.stereotype.Service;

import vn.nhannt.laptopshop.domain.Role;
import vn.nhannt.laptopshop.repository.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    // DI
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role getOneByName(String name) {
        return this.roleRepository.findByName(name);
    }

}
