package ua.logos.orm.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter @Setter
public class Student extends BaseEntity {

	@Column(name = "first_name", length = 50)
	private String firstName;
	
	@Column(name = "last_name", length = 60)
	private String lastName;
	
	@Column(columnDefinition = "DECIMAL(4,2)")
	private BigDecimal gpa;
	
	@OneToOne
	@JoinColumn(name = "student_info_id")
	private StudentInfo studentInfo;
	
	@ManyToOne
	@JoinColumn(name = "student_group_id")
	private StudentGroup studentGroup;

	
}
