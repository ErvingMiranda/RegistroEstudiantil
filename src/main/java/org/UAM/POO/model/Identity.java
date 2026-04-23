package org.UAM.POO.model;

import java.util.UUID;

public class Identity {
    private String id;

    public Identity() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
