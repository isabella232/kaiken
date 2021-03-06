package com.dropbox.kaiken.scoping

/**
 * An activity that does not require a user to be logged in.
 */
interface AuthOptionalActivity : AuthAwareScopeOwnerActivity, DependencyProviderResolver {
    @JvmDefault
    override val authRequired: Boolean
        get() = false
}
