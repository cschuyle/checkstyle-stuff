package org.example;

enum Fruit {
    APPLE,
    PEAR,
    LEMON
}
public class SwitchExpression {

    // New-style (expression) switch - must be exhaustive, so the compiler checks- checkstyle should not check for default case.
    String eat(Fruit fruit) {
        return switch(fruit) {
            case APPLE -> "apple";
            case PEAR, LEMON -> "not daily";
        };
    }

    // Old-style switch - Checkstyle checks that it has default
    String oldEat(Fruit fruit) {
        switch(fruit) {
            case APPLE: return "apple";
            case PEAR: return "pear";
        }
        return null;
    }
}
