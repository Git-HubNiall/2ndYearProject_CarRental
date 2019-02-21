
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/(items: List[models.ItemOnSale],categories: List[models.Category])),format.raw/*2.68*/("""
"""),_display_(/*3.2*/main("On Sale", user)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>On sale here</h1>


    """),format.raw/*7.74*/("""
	"""),_display_(/*8.3*/if(flash.containsKey("success"))/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
		"""),format.raw/*9.3*/("""<div class="alert alert-success">
			"""),_display_(/*10.5*/flash/*10.10*/.get("success")),format.raw/*10.25*/("""
		"""),format.raw/*11.3*/("""</div>
""")))}),format.raw/*12.2*/("""
    """),format.raw/*13.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*16.33*/routes/*16.39*/.HomeController.onsale(0)),format.raw/*16.64*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*17.12*/for(c<-categories) yield /*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
			        """),format.raw/*18.12*/("""<a href = """"),_display_(/*18.24*/routes/*18.30*/.HomeController.onsale(c.getId())),format.raw/*18.63*/("""" class="list-group-item catheight">"""),_display_(/*18.100*/c/*18.101*/.getName),format.raw/*18.109*/("""
                        """),format.raw/*19.25*/("""<span class="badge">"""),_display_(/*19.46*/c/*19.47*/.getItems.size),format.raw/*19.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*21.9*/("""
            """),format.raw/*22.13*/("""</ul>
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
       
            """),format.raw/*42.68*/("""
            """),_display_(/*43.14*/for(i<-items) yield /*43.27*/ {_display_(Seq[Any](format.raw/*43.29*/("""
               """),format.raw/*44.16*/("""<tr>
                  <td>"""),_display_(/*45.24*/i/*45.25*/.getId),format.raw/*45.31*/("""</td>
                  <td>"""),_display_(/*46.24*/i/*46.25*/.getName),format.raw/*46.33*/("""</td>
                  <td>"""),_display_(/*47.24*/i/*47.25*/.getCategory.getName),format.raw/*47.45*/("""</td>
                  <td>"""),_display_(/*48.24*/i/*48.25*/.getDescription),format.raw/*48.40*/("""</td>
                  <td>"""),_display_(/*49.24*/i/*49.25*/.getStock),format.raw/*49.34*/("""</td>
                  <td>&euro; """),_display_(/*50.31*/("%.2f".format(i.getPrice))),format.raw/*50.58*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*53.18*/routes/*53.24*/.HomeController.updateItem(i.getId)),format.raw/*53.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*59.18*/routes/*59.24*/.HomeController.deleteItem(i.getId)),format.raw/*59.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                </td>
               </tr>
            """)))}),format.raw/*64.14*/("""
        
        """),format.raw/*66.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*70.19*/routes/*70.25*/.HomeController.addItem()),format.raw/*70.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
</p>
</div>
 """)))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 21 16:48:10 GMT 2019
                  SOURCE: /home/wdd/year2Project/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: f34dc9f060aa76e931f93bc8b152aa63d696161a
                  MATRIX: 960->1|1079->28|1165->94|1192->96|1221->117|1259->118|1290->123|1345->220|1373->223|1413->255|1452->257|1481->260|1545->298|1559->303|1595->318|1625->321|1663->329|1695->334|1832->444|1847->450|1893->475|1976->531|2010->549|2050->551|2090->563|2129->575|2144->581|2198->614|2263->651|2274->652|2304->660|2357->685|2405->706|2415->707|2450->721|2522->763|2563->776|3129->1369|3170->1383|3199->1396|3239->1398|3283->1414|3338->1442|3348->1443|3375->1449|3431->1478|3441->1479|3470->1487|3526->1516|3536->1517|3577->1537|3633->1566|3643->1567|3679->1582|3735->1611|3745->1612|3775->1621|3838->1657|3886->1684|3988->1759|4003->1765|4059->1800|4278->1992|4293->1998|4349->2033|4567->2220|4612->2238|4688->2287|4703->2293|4749->2318
                  LINES: 28->1|33->2|33->2|34->3|34->3|34->3|35->4|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|52->21|53->22|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|84->53|84->53|84->53|90->59|90->59|90->59|95->64|97->66|101->70|101->70|101->70
                  -- GENERATED --
              */
          