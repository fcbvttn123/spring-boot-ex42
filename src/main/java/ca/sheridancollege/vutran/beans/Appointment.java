package ca.sheridancollege.vutran.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Appointment {
	@Id
	private String id;
	private String purpose;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate appointmentDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalTime appointmentTime;
}
