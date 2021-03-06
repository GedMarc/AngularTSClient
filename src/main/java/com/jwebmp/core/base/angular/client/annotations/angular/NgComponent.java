package com.jwebmp.core.base.angular.client.annotations.angular;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE})
@Retention(RUNTIME)
@Inherited
public @interface NgComponent
{
	/**
	 * The selector going to be used
	 *
	 * @return
	 */
	String value();
	
	String providedIn() default "";
}
