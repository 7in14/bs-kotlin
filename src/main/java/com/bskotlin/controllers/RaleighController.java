package com.bskotlin.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Usage: //GET /raleigh/crime?query=<q> JSON
 */
@RestController
public class RaleighController {
    private String url = "https://services.arcgis.com/v400IkDOw1ad7Yad/arcgis/rest/services/Recreation_Features/FeatureServer/0/query?%s";

    @RequestMapping(value = "/raleigh/crime", method = RequestMethod.GET)
    @ResponseBody
    public String getWithRequestParam(
        @RequestParam("query") String query) throws URISyntaxException {

        if(query==null || query=="") {
            query="where=1%3D1&outFields=*&outSR=4326&f=json";
        }

        final URI uri = new URI(String.format(url, query));

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}