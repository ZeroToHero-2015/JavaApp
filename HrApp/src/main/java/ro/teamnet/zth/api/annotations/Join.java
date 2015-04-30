package ro.teamnet.zth.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import ro.teamnet.zth.api.em.EntityUtils;
import ro.teamnet.zth.api.em.RelationType;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
public @interface Join {

    String refColName() default EntityUtils.EMPTY_STRING;
    RelationType relationType() default RelationType.ONETOMANY;
    String tableRef() default EntityUtils.EMPTY_STRING;

}