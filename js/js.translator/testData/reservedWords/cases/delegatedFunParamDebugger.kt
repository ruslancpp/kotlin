package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

interface Trait {
    fun foo(debugger: String)
}

class TraitImpl : Trait {
    override fun foo(debugger: String) {
    assertEquals("123", debugger)
    testRenamed("debugger", { debugger })
}
}

class TestDelegate : Trait by TraitImpl() {
    fun test() {
        foo("123")
    }
}

fun box(): String {
    TestDelegate().test()

    return "OK"
}