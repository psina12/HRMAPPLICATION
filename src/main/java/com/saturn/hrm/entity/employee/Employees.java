package com.saturn.hrm.entity.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
	
	@Id
	@SequenceGenerator(name = "employee-seq", sequenceName = "employee-seq", allocationSize = 1)
	@GeneratedValue(generator = "employee-seq", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	
	private Integer age;
	
}
