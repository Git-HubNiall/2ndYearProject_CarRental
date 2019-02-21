
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](_display_(/*2.2*/(loginForm: Form[models.users.Login])),format.raw/*2.39*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<h3>Sign in</h3>
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/{_display_(Seq[Any](format.raw/*7.36*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/{_display_(Seq[Any](format.raw/*9.47*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
    """),_display_(/*14.6*/helper/*14.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*14.76*/{_display_(Seq[Any](format.raw/*14.77*/("""
        """),format.raw/*15.37*/("""
        """),format.raw/*17.85*/("""
        """),_display_(/*18.10*/CSRF/*18.14*/.formField),format.raw/*18.24*/("""

        """),format.raw/*20.9*/("""<div class="form-group">
            """),_display_(/*21.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*22.72*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="form-group">
            """),_display_(/*25.14*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "password")),format.raw/*26.75*/("""

        """),format.raw/*28.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*32.6*/(""" """),format.raw/*32.24*/("""
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 21 16:48:09 GMT 2019
                  SOURCE: /home/wdd/year2Project/year2Project/projectCarRental/app/views/login.scala.html
                  HASH: 2c96a69c48bbeaa01b4048a72b00f82fe8f9a8fc
                  MATRIX: 959->1|1057->67|1101->28|1158->65|1185->84|1212->86|1239->105|1277->106|1308->111|1355->133|1392->162|1430->163|1465->172|1536->217|1583->249|1621->250|1666->268|1676->269|1705->277|1755->296|1791->305|1831->315|1863->321|1878->327|1951->391|1990->392|2027->429|2064->591|2101->601|2114->605|2145->615|2182->625|2247->663|2384->779|2420->788|2500->841|2643->963|2680->973|2844->1107|2873->1125
                  LINES: 28->1|31->3|34->2|34->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|45->14|45->14|45->14|46->15|47->17|48->18|48->18|48->18|50->20|51->21|52->22|53->23|55->25|56->26|58->28|62->32|62->32
                  -- GENERATED --
              */
          