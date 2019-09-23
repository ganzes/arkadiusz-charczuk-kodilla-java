package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void testGetCompanyBySomeName() {
        //Given
        Company dataMaesters = new Company("Data Maesters");
        companyDao.save(dataMaesters);
        //When
        int dataMaestersId = dataMaesters.getId();
        //Then
        try {
            facade.getCompanyBySomeName("aest");
        } catch (NotFoundExceptionCE e) {
            //bussiness exception - should be handled in real application
        }
        //CleanUp
        companyDao.deleteById(dataMaestersId);
    }

    @Test
    public void testGetEmployeeBySomeName(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        //When
        int nameID = johnSmith.getId();
        //Then
        try {
            facade.getEmployeeBySomeName("ith");
        } catch (NotFoundExceptionCE e) {
            //bussiness exception - should be handled in real application
        }
        //CleanUp
        employeeDao.deleteById(nameID);
    }
}
