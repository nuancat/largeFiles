package com.example.demo.endpoint;

import com.example.demo.entity.Result;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Ilyas on 09.01.2019.
 */
@Endpoint
public class ResultEndpoint {
    private static final String ENDPOINT = "localhost:8080/result";

    @PayloadRoot(namespace = ENDPOINT, localPart = "search")
    @ResponsePayload
    public Result process() {
        return null;
    }
}
