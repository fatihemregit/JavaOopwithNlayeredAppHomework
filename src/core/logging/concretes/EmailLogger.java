package core.logging.concretes;

import core.logging.abstracts.Logger;

public class EmailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Email ile loglanıyor : " + data);
    }
}
