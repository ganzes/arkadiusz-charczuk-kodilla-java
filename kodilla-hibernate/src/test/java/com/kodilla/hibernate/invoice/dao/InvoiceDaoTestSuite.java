package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product rTV = new Product("RTV");
        Product fantasyBooks = new Product("Fantasy Books");
        Product bluRayMovies = new Product("BluRay Movies");

        Item blenders = new Item(rTV, new BigDecimal (100), 10, new BigDecimal (200));
        Item conan = new Item(fantasyBooks, new BigDecimal (10), 5, new BigDecimal (20));
        Item avengers = new Item(bluRayMovies, new BigDecimal (500), 6, new BigDecimal (1000));

        //When
        Invoice invoice = new Invoice("First");
        invoice.getItems().add(avengers);
        invoice.getItems().add(conan);
        invoice.getItems().add(blenders);

        invoiceDao.save(invoice);

        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
