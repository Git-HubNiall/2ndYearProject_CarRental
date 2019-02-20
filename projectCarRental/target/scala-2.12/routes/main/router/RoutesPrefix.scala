// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/lab5CRUDCDU/conf/routes
// @DATE:Wed Feb 20 16:24:02 GMT 2019


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
