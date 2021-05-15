package com.capgemini.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.capgemini.entities.*;
import com.capgemini.repository.*;

@RestController
@RequestMapping("/api/serviceRequest/")
public class ServiceRequestController {
	
	@Autowired
	private ServiceRequestRepository serviceRequestDetailRepository;
	
	@GetMapping("/")
	public List<ServiceRequestDetail> getServiceRequestDetail(){
		return serviceRequestDetailRepository.findAll();
	}
	

}