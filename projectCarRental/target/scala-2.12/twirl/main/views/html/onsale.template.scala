
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.ItemOnSale],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.ItemOnSale],categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("On Sale")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<h1>On sale here</h1>


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
        <h4>Note that all products are second hand, unless otherwise stated.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>ID</th>
            <th>Name Picture</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*41.68*/("""
            """),_display_(/*42.14*/for(i<-items) yield /*42.27*/ {_display_(Seq[Any](format.raw/*42.29*/("""
               """),format.raw/*43.16*/("""<tr>
                  <td>"""),_display_(/*44.24*/i/*44.25*/.getId),format.raw/*44.31*/("""</td>
                  <td>"""),_display_(/*45.24*/i/*45.25*/.getName),format.raw/*45.33*/("""</td>
                  <td>"""),_display_(/*46.24*/i/*46.25*/.getCategory.getName),format.raw/*46.45*/("""</td>
                  <td>"""),_display_(/*47.24*/i/*47.25*/.getDescription),format.raw/*47.40*/("""</td>
                  <td>"""),_display_(/*48.24*/i/*48.25*/.getStock),format.raw/*48.34*/("""</td>
                  <td>&euro; """),_display_(/*49.31*/("%.2f".format(i.getPrice))),format.raw/*49.58*/("""</td>
                  <!-- Update button -->
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
               </tr>
            """)))}),format.raw/*63.14*/("""
        
        """),format.raw/*65.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*69.19*/routes/*69.25*/.HomeController.addItem()),format.raw/*69.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
</p>
</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.ItemOnSale],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(items,categories)

  def f:((List[models.ItemOnSale],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (items,categories) => apply(items,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 14:38:22 GMT 2019
                  SOURCE: /home/wdd/lab5CRUDCDU/app/views/onsale.scala.html
                  HASH: bfb451cd9b22d6d6bc8373b299ec3f84f52bc377
                  MATRIX: 988->1|1148->69|1171->84|1209->85|1240->90|1295->187|1323->190|1363->222|1402->224|1431->227|1494->265|1507->270|1542->285|1572->288|1610->296|1642->301|1779->411|1794->417|1840->442|1923->498|1957->516|1997->518|2037->530|2076->542|2091->548|2145->581|2210->618|2221->619|2251->627|2304->652|2352->673|2362->674|2397->688|2469->730|2510->743|3076->1336|3117->1350|3146->1363|3186->1365|3230->1381|3285->1409|3295->1410|3322->1416|3378->1445|3388->1446|3417->1454|3473->1483|3483->1484|3524->1504|3580->1533|3590->1534|3626->1549|3682->1578|3692->1579|3722->1588|3785->1624|3833->1651|3935->1726|3950->1732|4006->1767|4225->1959|4240->1965|4296->2000|4514->2187|4559->2205|4635->2254|4650->2260|4696->2285
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|83->52|83->52|83->52|89->58|89->58|89->58|94->63|96->65|100->69|100->69|100->69
                  -- GENERATED --
              */
          