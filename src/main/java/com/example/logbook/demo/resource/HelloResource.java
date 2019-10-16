/**
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.logbook.demo.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rohan Arya (rarya)
 */
@Path("/hello")
@Service
public class HelloResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloResource.class);

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @GET
    @Path("async")
    public void testHello(@Suspended final AsyncResponse asyncResponse) {
        LOGGER.info("Adding logging test async");
        executorService.execute(() -> asyncResponse.resume("logbook demo async"));
    }

    @GET
    public String testHello() {
        LOGGER.info("Adding logging test sync");
        return "logbook demo sync";
    }
}
