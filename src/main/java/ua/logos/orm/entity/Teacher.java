package ua.logos.orm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter @Setter
public class Teacher extends BaseEntity {

	@Column(name = "first_name", length = 50)
	private String firstName;

	@Column(name = "last_name", length = 60)
	private String lastName;
	
	@OneToMany(mappedBy = "teacher")
	private List<Lecture> lectures = new ArrayList<>();
}
