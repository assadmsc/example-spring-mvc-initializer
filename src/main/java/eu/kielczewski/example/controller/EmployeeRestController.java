package eu.kielczewski.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.kielczewski.example.controller.domain.Employee;
 
@RestController
@RequestMapping("restemployees")
public class EmployeeRestController {
 
    Employee employee = new Employee();
 
    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployeeInJSON(@PathVariable String name) {
 
   	 employee.setName(name);
   	 employee.setEmail("employee1@genuitec.com");
 
   	 return employee;
 
    }
 
    @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
    public Employee getEmployeeInXML(@PathVariable String name) {
 
   	 employee.setName(name);
   	 employee.setEmail("employee1@genuitec.com");
 
   	 return employee;
 
    }
 
}