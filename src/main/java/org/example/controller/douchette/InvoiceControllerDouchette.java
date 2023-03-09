package org.example.controller.douchette;

import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {


    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
    @Override
    public void createInvoice() {
        System.out.println("Usage of a scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Michel");
        invoiceService.createInvoice(invoice);
    }
}
