package com.springmvc.learn.env.dev;

import com.springmvc.learn.env.GenericEnv;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DevEnv implements GenericEnv {

    private String name = "devSir";

    @Value("${book.flag}")
    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    public void show() {
        System.out.println("DevEnv{" +
                "name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                '}');
    }
}
