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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product productRTV = new Product("RTV");
        Product productFantasyBooks = new Product("Fantasy Books");
        Product productBluRayMovies = new Product("BluRay Movies");

        Item itemBlenders = new Item(new BigDecimal(100), 10, new BigDecimal(200));
        Item itemConan = new Item(new BigDecimal(10), 5, new BigDecimal(20));
        Item itemAvengers = new Item(new BigDecimal(500), 6, new BigDecimal(1000));

        productRTV.getItems().add(itemBlenders);
        productFantasyBooks.getItems().add(itemConan);
        productBluRayMovies.getItems().add(itemAvengers);

        itemBlenders.setProduct(productRTV);

        itemConan.setProduct(productFantasyBooks);
        itemAvengers.setProduct(productBluRayMovies);

        //When
        Invoice invoice = new Invoice("One");
        invoice.getItems().add(itemBlenders);
        invoice.getItems().add(itemConan);
        invoice.getItems().add(itemAvengers);

        itemBlenders.setInvoice(invoice);
        itemConan.setInvoice(invoice);
        itemAvengers.setInvoice(invoice);

        invoiceDao.save(invoice);

        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.deleteById(id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
