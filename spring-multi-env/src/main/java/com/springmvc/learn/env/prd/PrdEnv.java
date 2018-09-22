package com.springmvc.learn.env.prd;

import com.springmvc.learn.env.GenericEnv;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrdEnv implements GenericEnv {
    private String name = "prdSir";

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
        System.out.println("PrdEnv{" +
                "name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                '}');
    }
}
