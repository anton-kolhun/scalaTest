package com.kolhun.scala

/**
 * Created by akolhun on 07.04.2015.
 */
class FirstClass /*extends FirstInterface with SecondInterface*/ {

  type customType = (String, String) => String;

  private var field: String = "2"

  def doSmth(param: customType) {

    def result = param.apply("3", "4");
    println(result);
  }

  /*def doSmth(param: String) {

    println(param)
  }*/

}
