package me.noynto.turbo.umbrella;

import java.util.Objects;

public record Description(
        String value
) {
    public Description {
        Objects.requireNonNull(value, "La valeur est requise.");
    }
}
