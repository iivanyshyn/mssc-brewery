package com.ivn.msscbrewery.mappers;

import com.ivn.msscbrewery.domain.Beer;
import com.ivn.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
