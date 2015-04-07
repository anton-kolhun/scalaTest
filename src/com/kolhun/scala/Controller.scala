package com.kolhun.scala


/**
 * Created by akolhun on 07.04.2015.
 */
object Controller {

  private val field = 1;

  def main(args: Array[String]) {
    def first = new FirstClass();
    //first.doSmth("hello")
    def customType(a:String, b:String) = a + b;
    //println(customType("3","4"));

    first.doSmth(customType);
  }

}
