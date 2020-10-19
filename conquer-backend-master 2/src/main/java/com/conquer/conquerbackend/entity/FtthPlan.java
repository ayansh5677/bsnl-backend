package com.conquer.conquerbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PLAN_TABLE")
public class FtthPlan {

    @Id
    @Column(name = "PLAN_ID")
    private int planId;
    private String name;
}
