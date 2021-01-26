package com.company;


import com.company.Exception.MeException;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) throws IOException {
        logger.addHandler(new FileHandler("C:/Users/l/Desktop/HomeWorkLog/src/com/company/resourses/log/java0.log"));

            final double i = random();
            try {
                chekValue(i);
                logger.info("Приложение успешно запущено");
            } catch (MeException e) {
                logger.warning(e.getMessage());
            }

        }
    

    private static double random() {
        return Math.random() * 10;
    }

    private static void chekValue(double value) throws MeException {
        if (value > 5) {
            return;
        } else throw new MeException("Сгенерированое число: " + value);
    }
}
