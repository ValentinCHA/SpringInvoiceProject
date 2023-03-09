package org.example.controller;

import org.example.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

        void createInvoice();
        void setInvoiceService(InvoiceServiceInterface invoiceService);
}
