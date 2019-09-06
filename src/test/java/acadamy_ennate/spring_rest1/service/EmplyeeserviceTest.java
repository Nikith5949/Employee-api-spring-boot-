package acadamy_ennate.spring_rest1.service;

import acadamy_ennate.spring_rest1.entity.Employee;
import acadamy_ennate.spring_rest1.repository.Employeerepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
public class EmplyeeserviceTest {


    @TestConfiguration
    static class EmployeeServiceTestConfiguration{

        @Bean
        public Employeeser getService(){
            return new Emplyeeservice();
        }
    }


    @Autowired
    private Employeeser service;

    @MockBean
    private Employeerepository repository;

    private List<Employee> employees;

    @Before
    public void setup(){
Employee emp=new Employee();
emp.setFname("nik");
emp.setEmailid("a@gmai.com");
emp.setLname("anup");
        employees=Collections.singletonList(emp);
        Mockito.when(repository.findAll()).thenReturn(employees);
    }
    @After
    public void cleanup(){

    }
    @Test
    public void findallEmpty() {
        List<Employee> result=service.findall();
        Assert.assertEquals("employee list shpuld match", Collections.emptyList(),result);
    }
    @Test
    public void findall() {
        List<Employee> result=service.findall();
        Assert.assertEquals("employee list shpuld match", employees,result);
    }

    @Test
    public void findone() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}