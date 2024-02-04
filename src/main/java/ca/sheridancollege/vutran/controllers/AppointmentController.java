package ca.sheridancollege.vutran.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.vutran.beans.Appointment;
import ca.sheridancollege.vutran.repo.AppointmentRepo;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AppointmentController {
	private AppointmentRepo ar;
	@GetMapping("/")
	public String indexHTML(Model model) {
		model.addAttribute("appointment", new Appointment());
		model.addAttribute("appointmentList", ar.findAll());
		return "index";
	}
	@PostMapping("/sendInfo")
	public String sendInfo(Model model, @ModelAttribute Appointment appointment) {
		appointment.setId(null);
		ar.save(appointment);
		model.addAttribute("appointment", new Appointment());
		model.addAttribute("appointmentList", ar.findAll());
		return "index";
	}
}
