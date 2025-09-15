package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private List<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        Grault grault = new Grault(this);
        this.graults.add(grault);
    }

    // Getters
    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public List<Grault> getGraults() {
        return graults;
    }
}
//