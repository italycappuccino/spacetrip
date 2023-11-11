/*
 * Copyright 2023 spacetrip.tech All right reserved. This software is the
 * confidential and proprietary information of spacetrip.tech ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with spacetrip.tech.
 */
package com.spacetrip.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Peter Liu 河图
 * @version JDK1.8【JDK8u45】
 * @see HomeController
 * @since Nov.12.2023
 */
@RestController("/")
public class HomeController {
    @GetMapping("/health")
    public String health(){
        return "UP";
    }
}
