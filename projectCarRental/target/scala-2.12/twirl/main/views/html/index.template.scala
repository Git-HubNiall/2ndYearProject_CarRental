
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
"""),format.raw/*3.1*/("""<h1>Welcome to Online Car Rental! </h1>
<h3>The place where you can rent Cars for as long as you want</h3>

<div class="container-fluid">
    <div class="row">
    <div class="col-sm-6">
        <div class="well sidecol">
                <input type="text" placeholder="Search..">
                <form action="/action_page.php">
                    Pick up date:
                    <input type="date" name="pickUp">
                    <input type="submit">
                </form>

                <form action="/action_page.php">
                    Drop off date:
                    <input type="date" name="dropOff">
                    <input type="submit">
                </form>	
        </div>
    </div>
    
    <div class="col-sm-6">
        <div class="well sidecol2">
                <img class="collage" src=""""),_display_(/*27.44*/routes/*27.50*/.Assets.versioned("images/carlogos.png")),format.raw/*27.90*/("""" alt="carlogos">
        </div>
    </div>
    </div>
""")))}),format.raw/*31.2*/("""		  """))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 20:23:15 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/index.scala.html
                  HASH: 661279daa8457d95a570261f515befd681b93869
                  MATRIX: 959->1|1079->26|1107->29|1132->46|1170->47|1198->49|2077->901|2092->907|2153->947|2243->1007
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|59->27|59->27|59->27|63->31
                  -- GENERATED --
              */
          