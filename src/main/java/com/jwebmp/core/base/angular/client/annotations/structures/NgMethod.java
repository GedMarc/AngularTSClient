package com.jwebmp.core.base.angular.client.annotations.structures;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE})
@Retention(RUNTIME)
@Repeatable(NgMethods.class)
@Inherited
public @interface NgMethod
{
	String value();
	
	boolean onParent() default false;
	boolean onSelf() default true;
}
