package io.dodn.livecodeshow.controller

import io.dodn.livecodeshow.domain.user.User

data class UserResponse(
    val name: String
) {
    constructor(user: User) : this(user.name)
}

