package ua.logos.orm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lecture")
@NoArgsConstructor
@Getter @Setter
public class Lecture extends BaseEntity {
	
	private int building;
	
	private String classroom;
	
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@ManyToMany
	@JoinTable(name = "lecture_student_group", 
			joinColumns = @JoinColumn(name = "lecture_id"),
			inverseJoinColumns = @JoinColumn(name = "student_group_id"))
	private List<StudentGroup> studentGroups = new ArrayList<>();
	
	
}
