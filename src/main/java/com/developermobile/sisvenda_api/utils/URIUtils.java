package com.developermobile.sisvenda_api.utils;

import com.developermobile.sisvenda_api.entities.Client;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class URIUtils {
    public static URI getUri(Long id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
    }
}
