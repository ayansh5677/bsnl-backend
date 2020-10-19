package com.conquer.conquerbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    private Long phoneNo;
    private String name;
    private String location;
    private String role;
    private String accountNumber;
    private String ifscCode;
    private String startDate;
    private String endDate;

}
