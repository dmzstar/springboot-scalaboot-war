package org.bighoefaces.springboot.scalaboot.repositories

import org.bighoefaces.springboot.scalaboot.User
import org.springframework.data.repository.PagingAndSortingRepository

trait UserRepository extends PagingAndSortingRepository[User, Long] {
    def findByUsername(username:String):User
}
