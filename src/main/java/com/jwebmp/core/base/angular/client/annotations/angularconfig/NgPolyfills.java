package com.jwebmp.core.base.angular.client.annotations.angularconfig;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE})
@Retention(RUNTIME)
@Inherited
public @interface NgPolyfills
{
	/**
	 * The string name of the dev dependency for the given ng app
	 *
	 * @return
	 */
	NgPolyfill[] value();
}
