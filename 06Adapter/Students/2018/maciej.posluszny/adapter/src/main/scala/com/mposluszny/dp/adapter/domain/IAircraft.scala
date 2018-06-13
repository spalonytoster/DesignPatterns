package com.mposluszny.dp.adapter.domain
/**
 * Target
 */
trait IAircraft {
  def airborne: Boolean
  def height: Int
  def takeOff(): Unit
}