// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/year2Project/projectCarRental/conf/routes
// @DATE:Mon Feb 25 10:45:30 GMT 2019


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
