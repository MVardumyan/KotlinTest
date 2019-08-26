package com.objects

object MySingleton : Baz {
    override fun upgradeVersion(currentVersion: Double): Double {
        if (currentVersion == 0.1) {
            return currentVersion + 0.9
        }

        return currentVersion + 1.0
    }
}