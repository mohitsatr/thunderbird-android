package net.thunderbird.feature.mail.message.list.internal

import net.thunderbird.feature.mail.message.list.LocalMessageUidPrefixProvider

class DefaultLocalMessageUidPrefixProvider : LocalMessageUidPrefixProvider {
    override fun get(): String = LOCAL_UID_PREFIX

    companion object {
        const val LOCAL_UID_PREFIX = "K9LOCAL:"
    }
}
