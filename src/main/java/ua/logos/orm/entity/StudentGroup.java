package ua.logos.orm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "student_group")
@NoArgsConstructor
@Getter @Setter
public class StudentGroup extends BaseEntity {
	
	
	private String institute;
	
	@Column(name = "student_number")
	private int studentNumber;
	
//	@OneToOne
//	@JoinColumn(name = "student_id")
//	private Student groupLeader;
	
	@OneToMany(mappedBy = "studentGroup")
	private List<Student> students = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "lecture_student_group",
			joinColumns = @JoinColumn(name = "student_group_id"),
			inverseJoinColumns = @JoinColumn(name = "lecture_id"))
	private List<Lecture> lectures = new ArrayList<>();
	
}
