package com.antodev.table;

public class AuthClient {

    String token = "";
    String pseudonyme = "";
    String motdepasse = "";

    public AuthClient(String token, String pseudonyme, String motdepasse) {
        this.token = token;
        this.pseudonyme = pseudonyme;
        this.motdepasse = motdepasse;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
}
