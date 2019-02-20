
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Home")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*2.1*/("""<h1>Welcome to the Online Flea Market! </h1>
<h3>The place where you can buy anything and sell anyting<br/> (as long as it is legal and morally ok)</h3>
""")))}),format.raw/*4.2*/("""		  """))
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
                  SOURCE: /home/wdd/lab5CRUDCDU/app/views/index.scala.html
                  HASH: 5bddff89ee36f5187938e48dd7eaa3a5bc0abdcb
                  MATRIX: 1030->1|1050->13|1088->14|1116->16|1301->172
                  LINES: 33->1|33->1|33->1|34->2|36->4
                  -- GENERATED --
              */
          