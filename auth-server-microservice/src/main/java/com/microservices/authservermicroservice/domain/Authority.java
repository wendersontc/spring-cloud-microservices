package com.microservices.authservermicroservice.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Authority implements Serializable{
	
	 private static final long serialVersionUID = 1L;

	    @Id
	    @NotNull
	    @Size(min = 0, max = 50)
	    private String name;

}
