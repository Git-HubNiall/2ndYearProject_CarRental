
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

        """),format.raw/*21.9*/("""<h3>PLEASE NOTE!</h3>
        <h3>DUE TO STOCK LIMITATIONS, THE MAXIMUM A CAR CAN BE RENTED IS FOR 14 DAYS!</h3>
		<h4 style = "text-align: center;">Discounts are as follows : </h4>
        <h4 style = "text-align: center;">After the first 5 days, each day will have a discount of 20%.</h4>
        <h4 style = "text-align: center;">After 10 days, each day will have a discount of 30%.</h4>
        <table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Number of Days</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*40.18*/if(customer.getBasket() != null)/*40.50*/ {_display_(Seq[Any](format.raw/*40.52*/("""
                    """),format.raw/*41.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*42.22*/for(i <- customer.getBasket().getBasketItems()) yield /*42.69*/ {_display_(Seq[Any](format.raw/*42.71*/("""
                    """),format.raw/*43.21*/("""<tr>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getItem.getName),format.raw/*44.47*/("""</td> 
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getItem.getDescription()),format.raw/*45.56*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.removeOne(i.getId,i.getItem.getId())),format.raw/*49.95*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.addOne(i.getId,i.getItem.getId())),format.raw/*50.92*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*53.16*/("""
			"""),format.raw/*54.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*58.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*58.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.ShoppingCtrl.emptyBasket()),format.raw/*64.64*/(""""  style="margin-top: 10px; padding-bottom: 7px;" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <form action="/placeOrder" method="GET">
                        <script
                                src="https://checkout.stripe.com/checkout.js"
                                class="stripe-button"
                                data-key="pk_test_7Aly3OieE9f6zWZoVUtNPIis00F1LwlZO0"
                                data-name="Online Car Rental"
                                data-description="Payment"
                                data-amount="shopping\Basket\getBasketTotal()">
                            </script>
                    </form>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*88.24*/("""{"""),format.raw/*88.25*/("""
		"""),format.raw/*89.3*/("""return confirm('Are you sure?');
	"""),format.raw/*90.2*/("""}"""),format.raw/*90.3*/("""
"""),format.raw/*91.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 15:37:15 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/basket.scala.html
                  HASH: 504f83aea9115af9c625e27b69cbb3e76ce65f3c
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1191->35|1219->119|1246->120|1317->166|1358->199|1397->201|1427->204|1500->251|1541->283|1581->285|1614->291|1685->335|1699->340|1735->355|1768->361|1808->371|1846->382|2605->1114|2646->1146|2686->1148|2735->1169|2845->1252|2908->1299|2948->1301|2997->1322|3058->1356|3068->1357|3105->1373|3168->1409|3178->1410|3224->1435|3293->1477|3341->1504|3410->1546|3462->1577|3524->1612|3534->1613|3569->1627|3640->1671|3655->1677|3726->1727|3855->1829|3870->1835|3938->1882|4079->1992|4150->2032|4181->2036|4358->2186|4430->2236|4637->2416|4652->2422|4700->2449|5801->3522|5830->3523|5860->3526|5921->3560|5949->3561|5977->3562
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|83->52|84->53|85->54|89->58|89->58|95->64|95->64|95->64|119->88|119->88|120->89|121->90|121->90|122->91
                  -- GENERATED --
              */
          