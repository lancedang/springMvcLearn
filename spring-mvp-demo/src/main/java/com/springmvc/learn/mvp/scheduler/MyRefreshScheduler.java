package com.springmvc.learn.mvp.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRefreshScheduler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public void refresh() {
        LOGGER.info("hi");
    }
}
