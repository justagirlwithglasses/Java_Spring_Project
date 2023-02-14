package com.bnpp.rest_api.simulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class SimulatorController 
{
    @Autowired
    private Simulator sim;

    @GetMapping("/simulator")
    public String getSimValues()
    {
        Gson json = new GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .create();
        sim.refresh();

        return json.toJson(sim);
    }

    
}
