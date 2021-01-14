package com.sprex.log;

import org.apache.log4j.Logger;

public class Log4J {
    
    public static final Logger log = Logger.getLogger(Log4J.class.getName());

    private Log4J() {
        super();
    }
}