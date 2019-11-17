package com.antodev;

import com.antodev.table.AuthClient;

import java.util.HashMap;
import java.util.Map;

public class SQLCache {

    public Map<String, AuthClient> auth = new HashMap<>();

    public SQLCache() {

    }

    public Map<String, AuthClient> getAuth() {
        return auth;
    }
}
