package org.code.structural.facade;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class TravelRoute {
    private Hotel _hotel;
    private Flight _flight;


}
