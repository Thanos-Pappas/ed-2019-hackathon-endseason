package org.acme.dvdstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "ACTORS")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTORS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Actor extends BaseEntity {
	@NotNull
	@Column(length = 30, nullable = false)
	private String firstName;
	@NotNull
	@Column(length = 50, nullable = false)
	private String lastName;
}
