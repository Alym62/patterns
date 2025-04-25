package com.github.alym62.proxy;

public class PostgreService implements DataService {
    @Override
    public String getData(String query) {
        System.out.println("Buscando dados com a seguinte query: " + query);
        sleep();
        return "Dados com a query: " + query;
    }

    private static void sleep() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
