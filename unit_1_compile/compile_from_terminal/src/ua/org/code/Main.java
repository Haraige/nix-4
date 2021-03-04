package ua.org.code;

import org.apache.commons.lang3.*;
import org.apache.commons.io.*;
import org.apache.commons.logging.*;

public class Main {

    private static final Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        var fruit = new Fruits();
        var car = new Cars();
        var computer = new Computers();

        FileUtils.getTempDirectory();
        fruit.sayHello();
        car.sayHello();
        computer.sayHello();

        System.out.println(StringUtils.upperCase("Hello World!"));

        log.info("Hello from logging!");
    }
}