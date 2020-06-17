package com.choppeabarrock.backend.model
		;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Option extends DefaultEntity {

	@NotNull
	String name;

	@NotNull
	String sku;

//	price: integer,
//	quantity: integer,

	@ManyToOne
	Mensuration mensuration;

}
