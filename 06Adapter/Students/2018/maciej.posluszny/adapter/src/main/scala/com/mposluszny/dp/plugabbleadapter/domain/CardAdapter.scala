package com.mposluszny.dp.plugabbleadapter.domain

/**
 * This plugabble adapter accepts any memory card as the adaptee
 * and is able to read its contents
 */
class CardAdapter(private var _memoryCard: MemoryCard) {
  def readStoredData() = _memoryCard.readData()
  def memoryCard_(x: MemoryCard) = { _memoryCard = x }
}