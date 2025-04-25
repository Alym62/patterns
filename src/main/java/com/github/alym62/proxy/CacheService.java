package com.github.alym62.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheService implements DataService {
    private final PostgreService postgreService;
    private final Map<String, String> cache;

    public CacheService() {
        this.postgreService = new PostgreService();
        this.cache = new HashMap<>();
    }

    @Override
    public String getData(String query) {
        if (cache.containsKey(query)) {
            System.out.println("Retornando dados em cache com a query: " + query);
            return cache.get(query);
        }

        String data = postgreService.getData(query);
        cache.put(query, data);
        return data;
    }
}
