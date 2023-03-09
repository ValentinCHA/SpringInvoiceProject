package org.example.service;

import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

    void createInvoice(Invoice invoice);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
