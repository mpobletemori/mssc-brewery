package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.domain.Beer;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);











}
