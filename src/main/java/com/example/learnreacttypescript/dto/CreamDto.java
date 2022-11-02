package com.example.learnreacttypescript.dto;

import com.example.learnreacttypescript.domain.Cream;
import com.example.learnreacttypescript.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreamDto {
    private Long id;
    private String menu;
    private Timestamp date;
    private Long state;
    private Long temperature;
//    private CustomerDto customerDto;

    public static CreamDto fromEntity (Cream cream) {
        return new CreamDto(
                cream.getId(),
                cream.getMenu(),
                cream.getDate(),
                cream.getState(),
                cream.getTemperature()
//                CustomerDto.fromEntity(cream.getCustomer())
        );
    }
}
