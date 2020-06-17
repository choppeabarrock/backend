//package com.choppeabarrock.backend.entities;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.validation.constraints.NotNull;
//
//import com.choppeabarrock.backend.dto.ImageRef;
//import com.choppeabarrock.backend.model.DefaultEntity;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//import lombok.experimental.SuperBuilder;
//
//@Entity
//@Data
//@EqualsAndHashCode(callSuper = false)
//@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor
//public class Product extends DefaultEntity {
//
//	@NotNull
//	String name;
//
//	String seoname; // Based on this.name, by making it url friendly.
//
//	//
////	@OneToMany
////	List<ImageRef> images;
//
////	@OneToMany
////	List<Option> options;
//
////	@ManyToMany
////	List<Category> categories;
//
//	@Builder.Default
//	boolean display = true;
//
//}
