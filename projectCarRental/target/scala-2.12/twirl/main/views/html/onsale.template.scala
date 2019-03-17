
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.ItemOnSale],List[models.products.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.products.ItemOnSale],categories: List[models.products.Category],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("On Sale",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<h1>For Rent Here</h1>


    """),format.raw/*6.74*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""
    """),format.raw/*12.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*15.33*/routes/*15.39*/.HomeController.onsale(0)),format.raw/*15.64*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*16.12*/for(c<-categories) yield /*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			        """),format.raw/*17.12*/("""<a href = """"),_display_(/*17.24*/routes/*17.30*/.HomeController.onsale(c.getId())),format.raw/*17.63*/("""" class="list-group-item catheight">"""),_display_(/*17.100*/c/*17.101*/.getName),format.raw/*17.109*/("""
                        """),format.raw/*18.25*/("""<span class="badge">"""),_display_(/*18.46*/c/*18.47*/.getItems.size),format.raw/*18.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*20.9*/("""
            """),format.raw/*21.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*40.68*/("""
            """),_display_(/*41.14*/for(i<-items) yield /*41.27*/ {_display_(Seq[Any](format.raw/*41.29*/("""
               """),format.raw/*42.16*/("""<tr>
                  <td>"""),_display_(/*43.24*/i/*43.25*/.getId),format.raw/*43.31*/("""</td>
                  <td>"""),_display_(/*44.24*/i/*44.25*/.getName),format.raw/*44.33*/("""</td>
                  <td>"""),_display_(/*45.24*/i/*45.25*/.getDescription),format.raw/*45.40*/("""</td>
                  <td>"""),_display_(/*46.24*/i/*46.25*/.getStock),format.raw/*46.34*/("""</td>
                  <td>&euro; """),_display_(/*47.31*/("%.2f".format(i.getPrice))),format.raw/*47.58*/("""</td>

                  """),_display_(/*49.20*/if((user != null) && ("admin".equals(user.getRole())))/*49.74*/ {_display_(Seq[Any](format.raw/*49.76*/("""
                  """),format.raw/*50.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*52.18*/routes/*52.24*/.HomeController.updateItem(i.getId)),format.raw/*52.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*58.18*/routes/*58.24*/.HomeController.deleteItem(i.getId)),format.raw/*58.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*62.20*/("""
               """),format.raw/*63.16*/("""</tr>
            """)))}),format.raw/*64.14*/("""
        
        """),format.raw/*66.9*/("""</tbody>
    </table>
    """),_display_(/*68.6*/if((user != null) && ("admin".equals(user.getRole())))/*68.60*/ {_display_(Seq[Any](format.raw/*68.62*/("""
    """),format.raw/*69.5*/("""<p>
        <a href=""""),_display_(/*70.19*/routes/*70.25*/.HomeController.addItem()),format.raw/*70.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*74.6*/("""
"""),format.raw/*75.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.products.ItemOnSale],categories:List[models.products.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user)

  def f:((List[models.products.ItemOnSale],List[models.products.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user) => apply(items,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 22:21:23 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: ea9413bdcd454806a54fb026d8723e0abb288309
                  MATRIX: 1024->1|1226->111|1254->131|1292->132|1323->137|1379->235|1407->238|1447->270|1486->272|1515->275|1578->313|1591->318|1626->333|1656->336|1694->344|1726->349|1863->459|1878->465|1924->490|2007->546|2041->564|2081->566|2121->578|2160->590|2175->596|2229->629|2294->666|2305->667|2335->675|2388->700|2436->721|2446->722|2481->736|2553->778|2594->791|3049->1273|3090->1287|3119->1300|3159->1302|3203->1318|3258->1346|3268->1347|3295->1353|3351->1382|3361->1383|3390->1391|3446->1420|3456->1421|3492->1436|3548->1465|3558->1466|3588->1475|3651->1511|3699->1538|3752->1564|3815->1618|3855->1620|3902->1639|3980->1690|3995->1696|4051->1731|4278->1931|4293->1937|4349->1972|4560->2152|4604->2168|4654->2187|4699->2205|4752->2232|4815->2286|4855->2288|4887->2293|4936->2315|4951->2321|4997->2346|5122->2441|5150->2442
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|80->49|80->49|80->49|81->50|83->52|83->52|83->52|89->58|89->58|89->58|93->62|94->63|95->64|97->66|99->68|99->68|99->68|100->69|101->70|101->70|101->70|105->74|106->75
                  -- GENERATED --
              */
          