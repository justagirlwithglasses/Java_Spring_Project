package com.bnpp.rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestApiController 
{
    @Autowired
    private RestApiProps props;

    @RequestMapping("/")
    public String index(Model m)
    {
        m.addAttribute("version", props.getVersion());
        m.addAttribute("name", props.getName());
        m.addAttribute("description", props.getDescription());
        m.addAttribute("url", props.getUrl());

        return "index";
    }

    
}
