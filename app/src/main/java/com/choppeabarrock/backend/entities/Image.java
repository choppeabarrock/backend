//package com.choppeabarrock.backend.entities;
//
//import com.choppeabarrock.backend.model.DefaultEntity;
//import lombok.*;
//import lombok.experimental.SuperBuilder;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Lob;
//import javax.persistence.ManyToMany;
//import javax.validation.constraints.NotNull;
//import java.util.List;
//
//@Entity
//@Data
//@EqualsAndHashCode(callSuper = false)
//@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor
//public class Image extends DefaultEntity {
//
//	@NotNull
//	String name;
//
//	//	data: blob
//
//	// Peut-être @Transient pour accès JDBC.getInputStream.
//	@Lob
//	// @Column(columnDefinition = "MEDIUMBLOB")
//	// @Access(AccessType.PROPERTY)
//	private byte[] partload;
//
//	@NotNull
//	private String parttype; // as rsrc-type
//
//	@NotNull
//	private String partname; // as rsrc-name
//
//	private String partlocation; // HTTP 301
//
//}
