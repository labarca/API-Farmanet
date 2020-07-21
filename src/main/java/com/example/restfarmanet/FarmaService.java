package com.example.restfarmanet;

import org.springframework.web.client.RestTemplate;

public class FarmaService {

    public String getFarma() {
        RestTemplate plantilla = new RestTemplate();
        String resultado = plantilla.getForObject("https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7", String.class);
        return resultado;
    }
}