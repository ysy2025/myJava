package com.ysy.basic.day19;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,FIELD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
