package com.prottonne.interfaces.more;

public interface Red extends Black{
    default void getColor() {
        System.out.println(
                "Red"
        );
    }
}