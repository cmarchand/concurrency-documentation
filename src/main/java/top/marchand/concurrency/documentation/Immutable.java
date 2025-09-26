package top.marchand.concurrency.documentation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates this class is immutable. Its state can not change,
 * and its state's state can not change either.
 *
 * It implies the class is also thread-safe, as an immutable class
 * is always thread-safe. Fill free to add both annotations on an
 * immutable class
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@ThreadSafe
public @interface Immutable {
}
