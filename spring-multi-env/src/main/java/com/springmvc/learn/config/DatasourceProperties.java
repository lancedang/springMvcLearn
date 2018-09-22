package com.springmvc.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatasourceProperties {

    @Value("${shujuku.master}")
    private String master;

    @Value("${shujuku.mima}")
    private String mima;

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    @Override
    public String toString() {
        return "DatasourceProperties{" +
                "master='" + master + '\'' +
                ", mima='" + mima + '\'' +
                '}';
    }
}
