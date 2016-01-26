package com.aaront.learning.obj

/**
 * @author tonyhui
 * @since  16/1/26
 */

class Point(x: Int, y: Int) {
  override def toString(): String = "x= " + x + "y=" + y
}

object Point extends App{

  def apply(x: Int, y: Int) = {
    new Point(x, y)
  }

  val point = Point(3, 4)
  println(point)

}
