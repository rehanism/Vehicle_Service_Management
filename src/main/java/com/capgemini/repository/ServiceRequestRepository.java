package com.capgemini.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.entities.ServiceRequestDetail;

	
	@Repository
	public interface ServiceRequestRepository extends JpaRepository<ServiceRequestDetail, Integer>{

}
