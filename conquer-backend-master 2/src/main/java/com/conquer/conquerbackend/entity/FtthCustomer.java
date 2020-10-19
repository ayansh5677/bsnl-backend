package com.conquer.conquerbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_TABLE")
public class FtthCustomer {

    private String name;

    @Id
    @Column(name = "LAND_LINE")
    private Long landLine;
    private String phoneNo;
    private String email;

    @ManyToOne
    @JoinColumn(name = "PLAN_ID", referencedColumnName = "PLAN_ID")
    private FtthPlan plan;

    private Date startDate;
    private Date endDate;
    private String gender;
}
