package com.zonnee.projetozonne.dto;

import com.zonnee.projetozonne.entities.UserTeste;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTesteDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String password;

    public UserTesteDTO(UserTeste entity) {
        id = entity.getId();
        username = entity.getUsername();
        password = entity.getPassword();
    }
}
