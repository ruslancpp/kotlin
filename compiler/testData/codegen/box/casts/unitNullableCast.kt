// IGNORE_BACKEND: JS_IR
fun foo() {}

fun bar(): Int? = foo() as? Int

fun box(): String {
    return if (bar() == null) "OK" else "fail"
}
