package com.simplon.ldvelhdccf.model;

import java.util.HashSet;
import java.util.Set;

public enum ERole {
    ROLE_USER,
    ROLE_PLAYER,
    ROLE_EDITOR;

    public static Set<ERole> ConvertFromString(Set<String> role) {
        Set<ERole> roles = new HashSet<>();
        role.forEach(str -> roles.add(ERole.valueOf(str)));
        return roles;
    }
}