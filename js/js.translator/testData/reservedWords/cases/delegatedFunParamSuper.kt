package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

interface Trait {
    fun foo(`super`: String)
}

class TraitImpl : Trait {
    override fun foo(`super`: String) {
    assertEquals("123", `super`)
    testRenamed("super", { `super` })
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