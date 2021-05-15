package com.capgemini.entities;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class ServiceRequestDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int service_reg_no;
	private int service_detail_id;
	private int price;
	
	/*@OneToOne
	@JoinColumn(name = "service_reg_no", referencedColumnName = "id")
	private ServiceRequest service_request;*/
	

}
