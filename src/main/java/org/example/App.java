package org.example;

import org.example.controller.InvoiceControllerInterface;
import org.example.controller.web.InvoiceControllerWeb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("What is the controller class ? ");
        String controllerClass = sc.nextLine();
        System.out.println("What is the service class ? ");
        String serviceClass = sc.nextLine();
        System.out.println("What is the repository class ? ");
        String repositoryClass = sc.nextLine();

        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepository = null;

        try {
            invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        assert invoiceService != null;
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.setInvoiceService(invoiceService); */

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();

        // SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to create another invoice? (y/n)");
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            main(args);
        } else {
            System.out.println("Thank you for using the invoice system");
        }
    }
}
