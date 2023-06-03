package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // navigational properties
    @ManyToOne
    @JoinColumn
    ServiceProvider serviceProvider;

    @ManyToOne
    @JoinColumn
    User user;

    public Connection(int id, ServiceProvider serviceProvider, User user) {
        this.id = id;
        this.serviceProvider = serviceProvider;
        this.user = user;
    }

    public Connection() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}