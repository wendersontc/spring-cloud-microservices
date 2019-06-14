package com.microservices.authservermicroservice.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User implements Serializable {
	
	 private static final long serialVersionUID = 1L;

	    @Id
	    @Column(updatable = false, nullable = false)
	    private String username;

	    @Size(min = 0, max = 500)
	    private String password;

	    @Email
	    @Size(min = 0, max = 50)
	    private String email;

	    private boolean activated;

	    @Size(min = 0, max = 100)
	    @Column(name = "activationkey")
	    private String activationKey;

	    @Size(min = 0, max = 100)
	    @Column(name = "resetpasswordkey")
	    private String resetPasswordKey;

		@ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(
	            name = "user_authority",
	            joinColumns = @JoinColumn(name = "username"),
	            inverseJoinColumns = @JoinColumn(name = "authority"))
	    private Set<Authority> authorities;
		
	
}
