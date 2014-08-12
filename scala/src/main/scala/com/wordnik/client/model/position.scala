package com.wordnik.client.model

import java.util.Date
case class Position (
  account: Double,
  symbol: String,
  currency: String,
  prevPnl: Double,
  prevClosePrice: Double,
  openingTimestamp: Date,
  openingBuyQty: Double,
  openingBuyCost: Double,
  openingSellQty: Double,
  openingSellCost: Double,
  openingQty: Double,
  openingCost: Double,
  openingComm: Double,
  openOrderBuyQty: Double,
  openOrderBuyCost: Double,
  openOrderSellQty: Double,
  openOrderSellCost: Double,
  execBuyQty: Double,
  execBuyCost: Double,
  execSellQty: Double,
  execSellCost: Double,
  execQty: Double,
  execCost: Double,
  execComm: Double,
  currentTimestamp: Date,
  currentBuyQty: Double,
  currentBuyCost: Double,
  currentSellQty: Double,
  currentSellCost: Double,
  currentQty: Double,
  currentCost: Double,
  currentComm: Double,
  grossOpenCost: Double,
  grossExecCost: Double,
  lastPrice: Double,
  lastValue: Double,
  initMargin: Double,
  maintMargin: Double,
  sessionMargin: Double,
  targetExcessMargin: Double,
  varMargin: Double,
  pnl: Double,
  pnlPcnt: Double,
  avgBuyPrice: Double,
  avgSellPrice: Double,
  avgEntryPrice: Double,
  breakEvenPrice: Double,
  marginCallPrice: Double,
  liquidationPrice: Double,
  bankruptPrice: Double,
  timestamp: Date)
