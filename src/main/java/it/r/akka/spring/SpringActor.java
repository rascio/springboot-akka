package it.r.akka.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by rascioni on 20/01/15.
 */
@Component
@Scope("prototype")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SpringActor {
}
