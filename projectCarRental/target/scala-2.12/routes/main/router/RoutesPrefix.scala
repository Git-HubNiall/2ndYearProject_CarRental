// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/year2Project/projectCarRental/conf/routes
// @DATE:Sat Feb 23 11:46:43 GMT 2019


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
