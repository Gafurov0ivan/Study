package com.gafur.homework.week_3.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Test annotation
 *
 * @author igafurov
 * @since 21.10.2016
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Test {
    public boolean methodReturn() default false;
}
