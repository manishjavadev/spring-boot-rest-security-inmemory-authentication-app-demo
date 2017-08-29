package com.manish.javadev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * @author Manish
 *
 */
@RestController

@Api(value = "online bank", description = "paper less online bank")
@RequestMapping("/api/account")
public class AccountController {

}
