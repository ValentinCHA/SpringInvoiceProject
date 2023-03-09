package org.example.repository.database;

import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public void create (Invoice invoice) {
        // save invoice to database
        invoices.add(invoice);
        System.out.println("Invoice added with number: " + invoice.getInvoiceNumber() + " and customer name: " + invoice.getCustomerName());
    }
}
