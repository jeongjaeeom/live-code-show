package io.dodn.livecodeshow.storage.db.main

import javax.persistence.Entity

@Entity
internal class UserEntity(
    val name: String
) : BaseEntity()
