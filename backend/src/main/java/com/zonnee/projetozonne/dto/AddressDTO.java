package com.zonnee.projetozonne.dto;

import com.zonnee.projetozonne.entities.Address;
import lombok.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idAddress;
    private String city;
    private String street;
    private Long number;
    private String district;

    public AddressDTO(Address entity) {
        idAddress = entity.getIdAddress();
        city = entity.getCity();
        street = entity.getStreet();
        number = entity.getNumber();
        district = entity.getDistrict();
    }
}

