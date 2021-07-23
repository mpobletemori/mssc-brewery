package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import guru.springframework.msscbrewery.domain.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
Customer customerToCustomerDto(CustomerDto customerDto);
CustomerDto customerDtoToCustomer(Customer customer);
}
