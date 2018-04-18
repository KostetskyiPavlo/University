package ua.logos.orm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_info")
@NoArgsConstructor
@Getter @Setter
public class StudentInfo extends BaseEntity {
	
	private String address;
	
	@Column(name = "phone_number", length = 13)
	private String phoneNumber;
	
	private LocalDate birthday;

}
