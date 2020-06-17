package com.choppeabarrock.backend.model;

//import com.choppeabarrock.backend.entities.DefaultEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends DefaultEntity {

	@NotNull
	String name;

//	@OneToMany
//	List<Image> images;

//	@OneToMany
//	List<Option> options;

//	@ManyToMany
//	List<Category> categories;

	@Builder.Default
	boolean display = true;

}
