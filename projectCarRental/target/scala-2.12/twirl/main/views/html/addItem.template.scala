
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

object addItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.ItemOnSale],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Item",user)/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.102*/ {_display_(Seq[Any](format.raw/*11.104*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        """),format.raw/*16.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*20.24*/select),format.raw/*20.30*/(""" """),format.raw/*20.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*23.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*23.86*/("""
            """),_display_(/*24.14*/select(
                itemForm("category.id"),
                options(Category.options),
                '_label -> "Category", '_default -> "-- Choose a category --", 
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*29.14*/("""
            """),_display_(/*30.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*30.100*/("""
            """),_display_(/*31.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*31.88*/("""
            """),_display_(/*32.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*32.88*/("""

            """),_display_(/*34.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*34.75*/("""
            
            """),format.raw/*36.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*42.27*/routes/*42.33*/.HomeController.onsale(0)),format.raw/*42.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*46.6*/(""" """),format.raw/*46.24*/("""
""")))}),format.raw/*47.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 12:45:36 GMT 2019
                  SOURCE: /media/sf_student/projectCarRental/app/views/addItem.scala.html
                  HASH: 068f0f85904a7baedd437cee07be9163bb1492d7
                  MATRIX: 985->1|1117->63|1161->61|1188->79|1215->81|1244->102|1282->103|1313->108|1632->401|1738->497|1779->499|1816->536|1853->635|1890->645|1903->649|1934->659|1971->669|2345->1016|2372->1022|2401->1023|2653->1248|2746->1320|2787->1334|3062->1588|3103->1602|3211->1688|3252->1702|3347->1776|3388->1790|3483->1864|3525->1879|3607->1940|3661->1966|4053->2331|4068->2337|4114->2362|4274->2492|4303->2510|4335->2512
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|47->16|51->20|51->20|51->20|54->23|54->23|55->24|60->29|61->30|61->30|62->31|62->31|63->32|63->32|65->34|65->34|67->36|73->42|73->42|73->42|77->46|77->46|78->47
                  -- GENERATED --
              */
          