package com.ahimsasystems.catair

import org.apache.daffodil.tdml.Runner
import org.junit.{AfterClass, Test}

object TestCatair {
  lazy val runner = Runner("/com/ahimsasystems/catair/", "TestCatair.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestCatair {

  import TestCatair._

  @Test def test_catair_01(): Unit = { runner.runOneTest("test_catair_01") }
}
