
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("About", user)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<h1>About Us!</h1>
<h3>We have been in business forever</h3>
""")))}),format.raw/*5.2*/("""	    """))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 22 08:48:34 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/about.scala.html
                  HASH: 914ed9c8ca8e88550c9d5293c48862708d0a19cb
                  MATRIX: 959->1|1078->28|1105->47|1143->48|1170->49|1261->111
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5
                  -- GENERATED --
              */
          