package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

enum class Foo {
    BAR;
    val `true`: Int = 0

    fun test() {
        testNotRenamed("true", { `true` })
    }
}

fun box(): String {
    Foo.BAR.test()

    return "OK"
}