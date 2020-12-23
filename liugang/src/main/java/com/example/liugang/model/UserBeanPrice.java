package com.example.liugang.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_bean_price")
@Setter
@Getter
public class UserBeanPrice implements Serializable {

	private static final long serialVersionUID = -5037955873014915800L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "account_uuid")
	private String accountUuid;
	private Integer year;
	private Integer month;
}
