package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Fernando Lima
 * at 10/11/2020
 **/

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
    void updateBeer(UUID customerId, CustomerDto customerDto);
    void deleteBeer(UUID customerId);
    CustomerDto saveNewCustomer(CustomerDto customerDto);
}
