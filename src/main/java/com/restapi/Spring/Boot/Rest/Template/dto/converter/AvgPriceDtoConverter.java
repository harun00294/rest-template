package com.restapi.Spring.Boot.Rest.Template.dto.converter;

import com.restapi.Spring.Boot.Rest.Template.dto.AvgPriceDto;
import com.restapi.Spring.Boot.Rest.Template.model.dataaccess.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(), from.getPrica(), from.getSymbol());
    }
}
