package com.ivn.msscbrewery.mappers;

import com.ivn.msscbrewery.domain.Customer;
import com.ivn.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
