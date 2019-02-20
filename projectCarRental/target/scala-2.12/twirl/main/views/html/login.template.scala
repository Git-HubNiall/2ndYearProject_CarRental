
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    """),_display_(/*6.6*/if(loginForm.hasGlobalErrors)/*6.35*/{_display_(Seq[Any](format.raw/*6.36*/("""
        """),format.raw/*7.9*/("""<p class="alert alert-warning">
            """),_display_(/*8.14*/for(e <- loginForm.globalErrors) yield /*8.46*/{_display_(Seq[Any](format.raw/*8.47*/("""
                """),_display_(/*9.18*/e/*9.19*/.message),format.raw/*9.27*/("""<br/>
            """)))}),format.raw/*10.14*/("""
        """),format.raw/*11.9*/("""</p>
    """)))}),format.raw/*12.6*/("""
    """),_display_(/*13.6*/helper/*13.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*13.76*/{_display_(Seq[Any](format.raw/*13.77*/("""
        """),format.raw/*14.37*/("""
        """),format.raw/*16.85*/("""
        """),_display_(/*17.10*/CSRF/*17.14*/.formField),format.raw/*17.24*/("""

        """),format.raw/*19.9*/("""<div class="form-group">
            """),_display_(/*20.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*21.72*/("""
        """),format.raw/*22.9*/("""</div>
        <div class="form-group">
            """),_display_(/*24.14*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "password")),format.raw/*25.75*/("""

        """),format.raw/*27.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*31.6*/(""" """),format.raw/*31.24*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 15:53:26 GMT 2019
                  SOURCE: /home/wdd/lab5CRUDCDU/app/views/login.scala.html
                  HASH: ec00d553af69973079a1477f1d202c1fc8823132
                  MATRIX: 966->1|1076->40|1120->57|1147->59|1168->72|1206->73|1237->78|1284->100|1321->129|1359->130|1394->139|1465->184|1512->216|1550->217|1594->235|1603->236|1631->244|1681->263|1717->272|1757->282|1789->288|1804->294|1877->358|1916->359|1953->396|1990->558|2027->568|2040->572|2071->582|2108->592|2173->630|2310->746|2346->755|2426->808|2569->930|2606->940|2770->1074|2799->1092
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|43->12|44->13|44->13|44->13|44->13|45->14|46->16|47->17|47->17|47->17|49->19|50->20|51->21|52->22|54->24|55->25|57->27|61->31|61->31
                  -- GENERATED --
              */
          