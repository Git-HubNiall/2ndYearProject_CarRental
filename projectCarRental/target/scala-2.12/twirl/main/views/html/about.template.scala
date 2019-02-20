
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("About")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
"""),format.raw/*3.1*/("""<h1>About Us!</h1>
<h3>We have been in business forever</h3>
""")))}),format.raw/*5.2*/("""	    """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 14:38:22 GMT 2019
                  SOURCE: /home/wdd/lab5CRUDCDU/app/views/about.scala.html
                  HASH: ce6df243cb7b9c716411284f8f103320afa66c7c
                  MATRIX: 1030->2|1051->15|1089->16|1116->17|1207->79
                  LINES: 33->2|33->2|33->2|34->3|36->5
                  -- GENERATED --
              */
          