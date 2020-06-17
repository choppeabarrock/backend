package com.choppeabarrock.backend.model;

//import com.choppeabarrock.backend.entities.DefaultEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Image extends DefaultEntity {

	@NotNull
	String name;

	//	data: blob

	// Peut-être @Transient pour accès JDBC.getInputStream.
	@Lob
	// @Column(columnDefinition = "MEDIUMBLOB")
	// @Access(AccessType.PROPERTY)
	private byte[] partload;

	@NotNull
	private String parttype; // as rsrc-type

	@NotNull
	private String partname; // as rsrc-name

	private String partlocation; // HTTP 301

}
