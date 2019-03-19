
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
       
            """),format.raw/*43.68*/("""
            """),_display_(/*44.14*/for(i<-items) yield /*44.27*/ {_display_(Seq[Any](format.raw/*44.29*/("""
               """),format.raw/*45.16*/("""<tr>
                    """),_display_(/*46.22*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*46.104*/ {_display_(Seq[Any](format.raw/*46.106*/("""
                        """),format.raw/*47.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*47.69*/(i.getId + "thumb.jpg")),format.raw/*47.92*/(""""/></td>
                    """)))}/*48.23*/else/*48.28*/{_display_(Seq[Any](format.raw/*48.29*/("""
                        """),format.raw/*49.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*50.22*/("""
                  """),format.raw/*51.19*/("""<td>"""),_display_(/*51.24*/i/*51.25*/.getId),format.raw/*51.31*/("""</td>
                  <td>"""),_display_(/*52.24*/i/*52.25*/.getName),format.raw/*52.33*/("""</td>
                  <td>"""),_display_(/*53.24*/i/*53.25*/.getDescription),format.raw/*53.40*/("""</td>
                  <td>"""),_display_(/*54.24*/i/*54.25*/.getStock),format.raw/*54.34*/("""</td>
                  <td>&euro; """),_display_(/*55.31*/("%.2f".format(i.getPrice))),format.raw/*55.58*/("""</td>

                  """),_display_(/*57.20*/if((user != null) && ("admin".equals(user.getRole())))/*57.74*/ {_display_(Seq[Any](format.raw/*57.76*/("""
                  """),format.raw/*58.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*60.18*/routes/*60.24*/.HomeController.updateItem(i.getId)),format.raw/*60.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*66.18*/routes/*66.24*/.HomeController.deleteItem(i.getId)),format.raw/*66.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*70.20*/("""
               """),format.raw/*71.16*/("""</tr>
            """)))}),format.raw/*72.14*/("""
        
        """),format.raw/*74.9*/("""</tbody>
    </table>
    """),_display_(/*76.6*/if((user != null) && ("admin".equals(user.getRole())))/*76.60*/ {_display_(Seq[Any](format.raw/*76.62*/("""
    """),format.raw/*77.5*/("""<p>
        <a href=""""),_display_(/*78.19*/routes/*78.25*/.HomeController.addItem()),format.raw/*78.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*82.6*/("""
"""),format.raw/*83.1*/("""</div>
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
                  DATE: Tue Mar 19 09:54:00 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: 50b588c166797065c8fcbb92b03b1156c957222e
                  MATRIX: 1045->1|1274->137|1301->139|1329->159|1367->160|1398->165|1454->263|1482->266|1522->298|1561->300|1591->303|1655->341|1669->346|1705->361|1735->364|1773->372|1805->377|1942->487|1957->493|2003->518|2086->574|2120->592|2160->594|2200->606|2239->618|2254->624|2308->657|2373->694|2384->695|2414->703|2467->728|2515->749|2525->750|2560->764|2632->806|2673->819|3155->1328|3196->1342|3225->1355|3265->1357|3309->1373|3362->1399|3454->1481|3495->1483|3548->1508|3619->1552|3663->1575|3712->1606|3725->1611|3764->1612|3817->1637|3932->1721|3979->1740|4011->1745|4021->1746|4048->1752|4104->1781|4114->1782|4143->1790|4199->1819|4209->1820|4245->1835|4301->1864|4311->1865|4341->1874|4404->1910|4452->1937|4505->1963|4568->2017|4608->2019|4655->2038|4733->2089|4748->2095|4804->2130|5031->2330|5046->2336|5102->2371|5313->2551|5357->2567|5407->2586|5452->2604|5505->2631|5568->2685|5608->2687|5640->2692|5689->2714|5704->2720|5750->2745|5875->2840|5903->2841
                  LINES: 28->1|34->3|35->4|35->4|35->4|36->5|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|53->22|54->23|74->43|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|88->57|88->57|88->57|89->58|91->60|91->60|91->60|97->66|97->66|97->66|101->70|102->71|103->72|105->74|107->76|107->76|107->76|108->77|109->78|109->78|109->78|113->82|114->83
                  -- GENERATED --
              */
          