package org.bighoefaces.springboot.scalaboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
@ServletComponentScan
class SpringbootConfig

object SpringbootScalabootApplication extends SpringBootServletInitializer{

  def main(args:Array[String]):Unit = {
    SpringApplication.run(classOf[SpringbootConfig],args:_*)
  }

}
