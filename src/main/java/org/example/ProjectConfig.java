package org.example;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:project_config.property")
public interface ProjectConfig extends Config {

    @Config.Key("baseUrl")
    String baseUrl();
}
