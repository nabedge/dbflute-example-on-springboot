/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.app.application;

import org.docksidestage.dbflute.allcommon.DBFluteBeansJavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author jflute
 */
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("org.docksidestage.app")
@Import(DBFluteBeansJavaConfig.class)
public class ExampleApplication { // #dbflute: import JavaConfig of DBFlute

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
