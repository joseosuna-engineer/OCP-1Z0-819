package com.amazon.lambdas;

public interface FuncInterface<T, R> {
    R abstractMethod(T x);
}
