package org.bighoefaces.springboot.scalaboot

import java.util.Date

import javax.persistence.{Entity, GeneratedValue, Id, Table}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

import scala.beans.BeanProperty

@Entity
@Table(name="sec_user")
class User{

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _
  @BeanProperty
  var username: String = _
  @BeanProperty
  var password:String = _
  @BeanProperty
  var dateCreated:Date = _

}