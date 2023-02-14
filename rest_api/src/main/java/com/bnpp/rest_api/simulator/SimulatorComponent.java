package com.bnpp.rest_api.simulator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class SimulatorComponent 
{

    @Value("100")
    private int maxRandom;

    @Value("3000")
    private int BlinkMillis;
    
}
