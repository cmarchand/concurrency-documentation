# concurrency-documentation

Some annotations to document concurrency behavior of Java classes.

Exposing your classes through an API means you **must** explain how to use
them concerning concurrency. Is class `A` thread-safe ? Is class `B` immutable ?

Annotations provided here allows you to simply document this.

All these annotations are constructed according to Brian Goetz' Java Concurrency in Practice
book, pulished in July 2009, ISBN-13: 978-0-321-34960-6

## Samples

- Documenting an immutable class :
```
import top.marchand.concurrency.doc.Immutable;

@Immutable
public class A {
  ...
}
```

- Documenting a thread-safe class :
```
import top.marchand.concurrency.doc.ThreadSafe;

@ThreadSafe
public class A {
  ...
}
```

- To be continued...
