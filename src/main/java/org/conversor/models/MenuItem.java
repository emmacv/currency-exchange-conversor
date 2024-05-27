package org.conversor.models;

public record MenuItem(
    int index,
    String from,
    String to
) {
    @Override public String toString() {
        return index + ". " + from + " -> " + to;
    }
}

