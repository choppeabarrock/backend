package com.choppeabarrock.backend.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

//@Entity
//@EqualsAndHashCode(callSuper = false)
//@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor

//@SuperBuilder
//@Data
//@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
//@NoArgsConstructor

@Data
public class Hello_DTO implements Serializable {

	@NotNull
	final String message;

	public Hello_DTO(String message) {
		this.message = message;
	}

}
