package com.example.trabalhofinal.db.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface OneToOne {

	String foreignKeyName() default "";

	String columnName() default "";

	boolean unique() default false;

	boolean required() default false;

}
