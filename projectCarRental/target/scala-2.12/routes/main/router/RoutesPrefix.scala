// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/projectError/year2Project/projectCarRental/conf/routes
// @DATE:Wed Mar 06 21:09:24 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
