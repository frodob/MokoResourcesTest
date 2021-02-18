package com.mokoresourcestest


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!\n${LocalizationManager.menuBriefing()} ..."
    }
}
