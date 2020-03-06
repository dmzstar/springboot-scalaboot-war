package org.bighoefaces.springboot.scalaboot.controllers

import org.bighoefaces.springboot.scalaboot.User
import org.bighoefaces.springboot.scalaboot.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, ResponseBody}


@Controller
@RequestMapping(value = Array("/users"))
class UserController {

  @Autowired
  var userRepository:UserRepository = _

  @GetMapping(value = Array("/index",""))
  def index = "users/index"

  @GetMapping(value = Array("/list"))
  def list(modelMap:ModelMap) = {
    val users = userRepository.findAll()
    modelMap.addAttribute("users",users)
    "users/list"
  }

  @GetMapping(value = Array("/create"))
  def create(modelMap:ModelMap):String = {
    modelMap.addAttribute("user",new User)
    "users/create"
  }

  @GetMapping(value = Array("/edit/{id}"))
  def edit(@PathVariable id:Long,modelMap:ModelMap):String = {
    val user = userRepository.findById(id)
    modelMap.addAttribute("user",user)
    "users/edit"
  }

}


@Controller
@RequestMapping(value = Array("/api/users"))
class UserApiController {

  @Autowired
  var userRepository:UserRepository = _

  @GetMapping(value = Array(""))
  @ResponseBody
  def list:Any = userRepository.findAll()

}