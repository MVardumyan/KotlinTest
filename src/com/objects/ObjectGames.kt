package com.objects

fun main() {
    val obj = Some()

    obj.changeVersion(object : Baz {
        override fun upgradeVersion(currentVersion: Double): Double {
            return currentVersion + 0.1
        }
    })

    println(obj.version)

    val obj2 = Some()
    obj2.changeVersion(MySingleton)
    println(obj2.version)
    obj2.changeVersion(MySingleton)
    println(obj2.version)
}