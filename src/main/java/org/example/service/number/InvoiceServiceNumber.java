package org.example.service.number;

import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;
import org.example.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber=0L;


    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setInvoiceNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
