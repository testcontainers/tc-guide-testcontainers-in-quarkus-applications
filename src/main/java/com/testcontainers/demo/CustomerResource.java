package com.testcontainers.demo;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/api/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {
    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GET
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @POST
    public Response createCustomer(Customer customer) {
        var savedCustomer = customerService.create(customer);
        return Response.status(Response.Status.CREATED).entity(savedCustomer).build();
    }
}
