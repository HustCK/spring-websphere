// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
package com.example.springwebsphere;

import java.util.Properties;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// tag::path[]
@Path("properties")
// end::path[]
public class PropertiesResource {

    // tag::get[]
    @GET
    // end::get[]
    // tag::produces[]
    @Produces(MediaType.APPLICATION_JSON)
    // end::produces[]
    public Properties getProperties() {
        return System.getProperties();
    }

}
