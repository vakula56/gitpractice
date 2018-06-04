package org.RDMS.springbootstarter.releaseDataseSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RDBController {
	@Autowired
	private RDSService rdsService;

	@RequestMapping("/RDB")
	public List<RDSModel> getAllData() {
		System.out.println("In RDBController");
		return rdsService.geAllData();
	}
	
	@RequestMapping("/Hello")
	public String getString() {
		System.out.println("In RDBController");
		return "Hello";
	}
	

}
