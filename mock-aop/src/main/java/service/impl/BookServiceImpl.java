package service.impl;

import service.IBookService;

public class BookServiceImpl implements IBookService {
    public void print(String str) {
        System.out.println("业务方法");
    }

    public void say(String str) {
        System.out.println("say ");
    }
}
