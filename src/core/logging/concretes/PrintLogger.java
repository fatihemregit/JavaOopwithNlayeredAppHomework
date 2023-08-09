package core.logging.concretes;

import core.logging.abstracts.Logger;

public class PrintLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("loglanıyor(print) : " + data);
    }
}
