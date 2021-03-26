/*
 * @(#)Drink.java 1.0 26/03/2021
 *
 * Copyright (c) 2021, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.omarcovelho.sample;

/**
 * @author marprado - Marco Prado
 * @version 1.0 26/03/2021
 */
public class Drink {

    private String name;

    public Drink(final String name) {
        this.name = name;
    }

    public void make() {
        System.out.println("Making " + name);
    }
}
