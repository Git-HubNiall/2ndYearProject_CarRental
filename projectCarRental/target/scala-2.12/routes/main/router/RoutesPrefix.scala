// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/year2Project/projectCarRental/conf/routes
// @DATE:Fri Apr 26 14:55:42 IST 2019


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
