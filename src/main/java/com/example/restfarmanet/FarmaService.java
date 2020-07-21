package com.example.restfarmanet;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;

public class FarmaService {

    public Datos getFarma() {
        RestTemplate plantilla = new RestTemplate();
        // Datos resultado = plantilla.getForObject("https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7", Datos);
        ResponseEntity<List<Datos>> datosResponse = plantilla.exchange("https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7",
                     new ParameterizedTypeReference<List<Datos>>() {
            });
        List<Datos> datos = datosResponse.getBody();
        return datos;
    }
}