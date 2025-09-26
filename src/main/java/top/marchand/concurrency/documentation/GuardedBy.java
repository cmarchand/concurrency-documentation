package top.marchand.concurrency.documentation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates this class, method or field is guarded by
 * the lock named by {@link #value()}
 *
 * Samples :
 *
 * {@code @GuardedBy("this")} meaning the intrinsic lock on
 * the containing object
 *
 * {@code @GuardedBy("fieldName")} meaning the lock associated with the
 * object referenced y the named field, either an intrinsic lock, or
 * an explicit lock.
 *
 * {@code @GuardedBy("ClassName.fieldName")} like {@code @GuardedBy("fieldName")}
 * but referencing a lock object held in static field of another class
 *
 * {@code @GuardedBy("methodName()")} meaning the lock is returned by
 * the named method.
 *
 * {@code @GuardedBy("ClassName.class")} meaning the class literal
 * object for the named class
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface GuardedBy {
  /**
   * @return Name of lock
   */
  String value();
}
