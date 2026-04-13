package com.example;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
/**
 *
 * @author maryam
 */


@ApplicationPath("/api/v1")
public class CampusApplication extends Application {
    // Empty - JAX-RS auto-discovers resources with @Path
}