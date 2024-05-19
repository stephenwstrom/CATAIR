package com.stephenwstrom.catair

import org.junit.AfterClass
import org.junit.Test

import org.apache.daffodil.tdml.Runner

object TestCatair {
  lazy val runner = Runner("/com/stephenwstrom/catair/", "TestCatair.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestCatair {

  import TestCatair._

  @Test def test_catair_01(): Unit = { runner.runOneTest("test_catair_01") }
}
