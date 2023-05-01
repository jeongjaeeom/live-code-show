package io.dodn.livecodeshow.controller

import io.dodn.livecodeshow.domain.user.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {
    @PostMapping("/users")
    fun addUser(
        @RequestBody request: NewUserRequest
    ): NewUserResponse {
        return NewUserResponse(userService.add(request.name))
    }

    @GetMapping("/users/{userId}")
    fun findUser(
        @PathVariable userId: Long
    ): UserResponse {
        return UserResponse(userService.read(userId))
    }
}
