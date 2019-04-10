
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.ItemOnSale],List[models.products.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.products.ItemOnSale],categories: List[models.products.Category],
user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("On Sale",user)/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<h1>For Rent Here</h1>


    """),format.raw/*8.74*/("""
	"""),_display_(/*9.3*/if(flash.containsKey("success"))/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("success")),format.raw/*11.25*/("""
		"""),format.raw/*12.3*/("""</div>
""")))}),format.raw/*13.2*/("""
    """),format.raw/*14.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*17.33*/routes/*17.39*/.HomeController.onsale(0)),format.raw/*17.64*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*18.12*/for(c<-categories) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
			        """),format.raw/*19.12*/("""<a href = """"),_display_(/*19.24*/routes/*19.30*/.HomeController.onsale(c.getId())),format.raw/*19.63*/("""" class="list-group-item catheight">"""),_display_(/*19.100*/c/*19.101*/.getName),format.raw/*19.109*/("""
                        """),format.raw/*20.25*/("""<span class="badge">"""),_display_(/*20.46*/c/*20.47*/.getItems.size),format.raw/*20.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*22.9*/("""
            """),format.raw/*23.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h3>PLEASE NOTE!</h3>
        <h3>Prices are the price per day</h3>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*44.68*/("""
            """),_display_(/*45.14*/for(i<-items) yield /*45.27*/ {_display_(Seq[Any](format.raw/*45.29*/("""
               """),format.raw/*46.16*/("""<tr>
                    """),_display_(/*47.22*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*47.104*/ {_display_(Seq[Any](format.raw/*47.106*/("""
                        """),format.raw/*48.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*48.69*/(i.getId + "thumb.jpg")),format.raw/*48.92*/(""""/></td>
                    """)))}/*49.23*/else/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                        """),format.raw/*50.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*51.22*/("""
                  """),format.raw/*52.19*/("""<td>"""),_display_(/*52.24*/i/*52.25*/.getId),format.raw/*52.31*/("""</td>
                  <td>"""),_display_(/*53.24*/i/*53.25*/.getName),format.raw/*53.33*/("""</td>
                  <td>"""),_display_(/*54.24*/i/*54.25*/.getDescription),format.raw/*54.40*/("""</td>
                  <td>"""),_display_(/*55.24*/i/*55.25*/.getStock),format.raw/*55.34*/("""</td>
                  <td>&euro; """),_display_(/*56.31*/("%.2f".format(i.getPrice))),format.raw/*56.58*/("""</td>

                  """),_display_(/*58.20*/if((user != null) && ("admin".equals(user.getRole())))/*58.74*/ {_display_(Seq[Any](format.raw/*58.76*/("""
                  """),format.raw/*59.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*61.18*/routes/*61.24*/.HomeController.updateItem(i.getId)),format.raw/*61.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*67.18*/routes/*67.24*/.HomeController.deleteItem(i.getId)),format.raw/*67.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                    """)))}),format.raw/*71.22*/("""
                    """),_display_(/*72.22*/if((user != null) && ("customer".equals(user.getRole())))/*72.79*/ {_display_(Seq[Any](format.raw/*72.81*/("""
                        """),_display_(/*73.26*/if(i.getStock() > 0)/*73.46*/{_display_(Seq[Any](format.raw/*73.47*/("""
                        """),format.raw/*74.25*/("""<td><a href=""""),_display_(/*74.39*/routes/*74.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*74.79*/("""" 
                             class="btn btn-default btn-xs"><span 
                            class="glyphicon glyphicon-shopping-cart"></span></a>
                        </td>
                    """)))}/*78.22*/else/*78.26*/{_display_(Seq[Any](format.raw/*78.27*/("""
                         """),format.raw/*79.26*/("""<td><img src="/assets/images/oos.jpg"/></td>

                    """)))}),format.raw/*81.22*/("""
                """)))}),format.raw/*82.18*/("""
               """),format.raw/*83.16*/("""</tr>
            """)))}),format.raw/*84.14*/("""
        
        """),format.raw/*86.9*/("""</tbody>
    </table>
    """),_display_(/*88.6*/if((user != null) && ("admin".equals(user.getRole())))/*88.60*/ {_display_(Seq[Any](format.raw/*88.62*/("""
    """),format.raw/*89.5*/("""<p>
        <a href=""""),_display_(/*90.19*/routes/*90.25*/.HomeController.addItem()),format.raw/*90.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*94.6*/("""
"""),format.raw/*95.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.products.ItemOnSale],categories:List[models.products.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user,env)

  def f:((List[models.products.ItemOnSale],List[models.products.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user,env) => apply(items,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 09:07:04 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: 2b340795f58e3b15654897f6677acdb5cca328d6
                  MATRIX: 1045->1|1274->137|1301->139|1329->159|1367->160|1398->165|1454->263|1482->266|1522->298|1561->300|1591->303|1655->341|1669->346|1705->361|1735->364|1773->372|1805->377|1942->487|1957->493|2003->518|2086->574|2120->592|2160->594|2200->606|2239->618|2254->624|2308->657|2373->694|2384->695|2414->703|2467->728|2515->749|2525->750|2560->764|2632->806|2673->819|3222->1395|3263->1409|3292->1422|3332->1424|3376->1440|3429->1466|3521->1548|3562->1550|3615->1575|3686->1619|3730->1642|3779->1673|3792->1678|3831->1679|3884->1704|3999->1788|4046->1807|4078->1812|4088->1813|4115->1819|4171->1848|4181->1849|4210->1857|4266->1886|4276->1887|4312->1902|4368->1931|4378->1932|4408->1941|4471->1977|4519->2004|4572->2030|4635->2084|4675->2086|4722->2105|4800->2156|4815->2162|4871->2197|5098->2397|5113->2403|5169->2438|5382->2620|5431->2642|5497->2699|5537->2701|5590->2727|5619->2747|5658->2748|5711->2773|5752->2787|5767->2793|5822->2827|6044->3030|6057->3034|6096->3035|6150->3061|6248->3128|6297->3146|6341->3162|6391->3181|6436->3199|6489->3226|6552->3280|6592->3282|6624->3287|6673->3309|6688->3315|6734->3340|6859->3435|6887->3436
                  LINES: 28->1|34->3|35->4|35->4|35->4|36->5|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|53->22|54->23|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|92->61|92->61|92->61|98->67|98->67|98->67|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|105->74|109->78|109->78|109->78|110->79|112->81|113->82|114->83|115->84|117->86|119->88|119->88|119->88|120->89|121->90|121->90|121->90|125->94|126->95
                  -- GENERATED --
              */
          