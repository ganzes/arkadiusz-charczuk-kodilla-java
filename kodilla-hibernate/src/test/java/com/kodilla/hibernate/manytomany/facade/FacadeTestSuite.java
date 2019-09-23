package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private Facade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testGetCompanyBySomeName() throws NotFoundExceptionCE {
        //Given
        Company dataMaesters = new Company("Data Maesters");
        companyDao.save(dataMaesters);
        //When
        int dataMaestersId = dataMaesters.getId();
        List<Company> companiesBySomeName = facade.getCompanyBySomeName("aest");
        //Then
        Assert.assertEquals(1, companiesBySomeName.size());
        //CleanUp
        companyDao.deleteById(dataMaestersId);
    }

    @Test
    public void testGetEmployeeBySomeName() throws NotFoundExceptionCE {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        //When
        int nameID = johnSmith.getId();
        List<Employee> employeesBySomeName = facade.getEmployeeBySomeName("ith");
        //Then
        Assert.assertEquals(1, employeesBySomeName.size());
        //CleanUp
        employeeDao.deleteById(nameID);
    }
}
