package com.jwebmp.core.base.angular.client.annotations.boot;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE})
@Retention(RUNTIME)
@Repeatable(NgBootConstructorBodys.class)
@Inherited
public @interface NgBootConstructorBody
{
	String value();
	
	boolean onParent() default false;
	
	boolean onSelf() default true;
	
	int sortOrder() default 100;
}
