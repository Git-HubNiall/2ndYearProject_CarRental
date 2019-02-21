
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

object addItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](_display_(/*2.2*/(itemForm: Form[models.ItemOnSale])),format.raw/*2.37*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Item", user)/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.102*/ {_display_(Seq[Any](format.raw/*12.104*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

        """),format.raw/*17.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*21.24*/select),format.raw/*21.30*/(""" """),format.raw/*21.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*24.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*24.86*/("""
            """),_display_(/*25.14*/select(
                itemForm("category.id"),
                options(Category.options),
                '_label -> "Category", '_default -> "-- Choose a category --", 
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*30.14*/("""
            """),_display_(/*31.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*31.100*/("""
            """),_display_(/*32.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*32.88*/("""
            """),_display_(/*33.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*33.88*/("""

            """),_display_(/*35.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*35.75*/("""
            
            """),format.raw/*37.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.HomeController.onsale(0)),format.raw/*43.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*47.6*/(""" """),format.raw/*47.24*/("""
""")))}),format.raw/*48.2*/(""" """))
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
                  SOURCE: /home/wdd/year2Project/year2Project/projectCarRental/app/views/addItem.scala.html
                  HASH: ce3a22cbc3aaa18148c499df70f6c018c618ae70
                  MATRIX: 961->1|1059->66|1103->28|1158->63|1186->82|1213->84|1243->106|1281->107|1312->112|1631->405|1737->501|1778->503|1815->540|1852->639|1889->649|1902->653|1933->663|1970->673|2344->1020|2371->1026|2400->1027|2652->1252|2745->1324|2786->1338|3061->1592|3102->1606|3210->1692|3251->1706|3346->1780|3387->1794|3482->1868|3524->1883|3606->1944|3660->1970|4052->2335|4067->2341|4113->2366|4273->2496|4302->2514|4334->2516
                  LINES: 28->1|31->4|34->2|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|52->21|52->21|52->21|55->24|55->24|56->25|61->30|62->31|62->31|63->32|63->32|64->33|64->33|66->35|66->35|68->37|74->43|74->43|74->43|78->47|78->47|79->48
                  -- GENERATED --
              */
          