package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    companion object {
        fun foo(`if`: String) {
    assertEquals("123", `if`)
    testRenamed("if", { `if` })
}

        fun test() {
            foo("123")
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}