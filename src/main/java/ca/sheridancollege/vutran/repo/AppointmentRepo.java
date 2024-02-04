package ca.sheridancollege.vutran.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import ca.sheridancollege.vutran.beans.Appointment;

public interface AppointmentRepo extends MongoRepository<Appointment, String> {

}
