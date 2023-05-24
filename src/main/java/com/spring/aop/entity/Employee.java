package com.spring.aop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
