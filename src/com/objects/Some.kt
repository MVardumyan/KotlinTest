package com.objects

class Some {
    var version = 0.1
        private set

    fun changeVersion(baz: Baz) {
        version = baz.upgradeVersion(version)
    }
}