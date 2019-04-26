
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color:teal;"""),format.raw/*10.58*/("""}"""),format.raw/*10.59*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
		"""),format.raw/*12.3*/(""".sidecol2 """),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""background-color: white;"""),format.raw/*12.38*/("""}"""),format.raw/*12.39*/("""
	    """),format.raw/*13.6*/(""".midcol h1 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; font-weight: bold; """),format.raw/*13.58*/("""}"""),format.raw/*13.59*/("""
	    """),format.raw/*14.6*/(""".midcol h3 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""text-align: center; color: steelblue; """),format.raw/*14.57*/("""}"""),format.raw/*14.58*/("""
	    """),format.raw/*15.6*/(""".redtext """),format.raw/*15.15*/("""{"""),format.raw/*15.16*/(""" """),format.raw/*15.17*/("""color: red; """),format.raw/*15.29*/("""}"""),format.raw/*15.30*/("""
		"""),format.raw/*16.3*/(""".sidecol input """),format.raw/*16.18*/("""{"""),format.raw/*16.19*/("""width: 100%;"""),format.raw/*16.31*/("""}"""),format.raw/*16.32*/("""
		"""),format.raw/*17.3*/(""".pickUp """),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""float: left;"""),format.raw/*17.24*/("""}"""),format.raw/*17.25*/("""
		"""),format.raw/*18.3*/(""".dropOff """),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""float: right;"""),format.raw/*18.26*/("""}"""),format.raw/*18.27*/("""
		"""),format.raw/*19.3*/(""".sidecol form """),format.raw/*19.17*/("""{"""),format.raw/*19.18*/("""width: 50%;"""),format.raw/*19.29*/("""}"""),format.raw/*19.30*/("""
		"""),format.raw/*20.3*/(""".header """),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""width: 100%;"""),format.raw/*20.24*/("""}"""),format.raw/*20.25*/("""
		"""),format.raw/*21.3*/(""".banner """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""width: 100%; height: 270px;"""),format.raw/*21.39*/("""}"""),format.raw/*21.40*/("""
		"""),format.raw/*22.3*/(""".collage """),format.raw/*22.12*/("""{"""),format.raw/*22.13*/("""width: 99%;"""),format.raw/*22.24*/("""}"""),format.raw/*22.25*/("""
	"""),format.raw/*23.2*/("""</style>
	<title>OnlineCarRental """),_display_(/*24.26*/pagename),format.raw/*24.34*/("""</title>
    </head>
    <body> 
		
	<img class="banner" src=""""),_display_(/*28.28*/routes/*28.34*/.Assets.versioned("images/carheader2.jpg")),format.raw/*28.76*/("""" alt="carheader">

	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href=""""),_display_(/*33.38*/routes/*33.44*/.HomeController.index()),format.raw/*33.67*/("""">OnlineCarRental</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*36.18*/if(pagename == "Home")/*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""class="active"""")))}),format.raw/*36.57*/("""><a href=""""),_display_(/*36.68*/routes/*36.74*/.HomeController.index()),format.raw/*36.97*/("""">Home</a></li>
		    <li """),_display_(/*37.12*/if(pagename == "On Sale")/*37.37*/ {_display_(Seq[Any](format.raw/*37.39*/("""class="active"""")))}),format.raw/*37.54*/("""><a href=""""),_display_(/*37.65*/routes/*37.71*/.HomeController.onsale()),format.raw/*37.95*/("""">Cars To Rent</a></li>	
			<li """),_display_(/*38.9*/if(pagename == "Shopping Basket")/*38.42*/ {_display_(Seq[Any](format.raw/*38.44*/("""class="active"""")))}),format.raw/*38.59*/("""><a href=""""),_display_(/*38.70*/routes/*38.76*/.ShoppingCtrl.showBasket()),format.raw/*38.102*/("""">Basket</a></li>
			<li """),_display_(/*39.9*/if(pagename == "About")/*39.32*/ {_display_(Seq[Any](format.raw/*39.34*/("""class="active"""")))}),format.raw/*39.49*/("""><a href=""""),_display_(/*39.60*/routes/*39.66*/.HomeController.about()),format.raw/*39.89*/("""">About us</a></li>	
			<li """),_display_(/*40.9*/if(pagename == "Register")/*40.35*/ {_display_(Seq[Any](format.raw/*40.37*/("""class="active"""")))}),format.raw/*40.52*/("""><a href=""""),_display_(/*40.63*/routes/*40.69*/.LoginController.registerUser()),format.raw/*40.100*/("""">Register user</a></li>
			"""),_display_(/*41.5*/if((user != null) && ("admin".equals(user.getRole())))/*41.59*/ {_display_(Seq[Any](format.raw/*41.61*/("""
				"""),format.raw/*42.5*/("""<li """),_display_(/*42.10*/if(pagename == "Administrators")/*42.42*/ {_display_(Seq[Any](format.raw/*42.44*/("""class="active"""")))}),format.raw/*42.59*/("""><a href=""""),_display_(/*42.70*/routes/*42.76*/.HomeController.usersAdmin()),format.raw/*42.104*/("""">View Admin</a></li>
				<li """),_display_(/*43.10*/if(pagename == "Customers")/*43.37*/ {_display_(Seq[Any](format.raw/*43.39*/("""class="active"""")))}),format.raw/*43.54*/("""><a href=""""),_display_(/*43.65*/routes/*43.71*/.HomeController.usersCustomer()),format.raw/*43.102*/("""">View Customers</a></li>

			""")))}),format.raw/*45.5*/("""
			"""),_display_(/*46.5*/if((user != null) && ("customer".equals(user.getRole())))/*46.62*/ {_display_(Seq[Any](format.raw/*46.64*/("""
				"""),format.raw/*47.5*/("""<li """),_display_(/*47.10*/if(pagename == "Orders")/*47.34*/ {_display_(Seq[Any](format.raw/*47.36*/("""class="active"""")))}),format.raw/*47.51*/("""><a href=""""),_display_(/*47.62*/routes/*47.68*/.ShoppingCtrl.viewOrders),format.raw/*47.92*/("""">View Orders</a></li>

			""")))}),format.raw/*49.5*/("""
			
			"""),format.raw/*51.4*/("""<li """),_display_(/*51.9*/if(pagename == "Log In")/*51.33*/ {_display_(Seq[Any](format.raw/*51.35*/("""class="active"""")))}),format.raw/*51.50*/(""">
				"""),_display_(/*52.6*/if(user != null)/*52.22*/ {_display_(Seq[Any](format.raw/*52.24*/("""
					"""),format.raw/*53.6*/("""<a href=""""),_display_(/*53.16*/routes/*53.22*/.LoginController.logout()),format.raw/*53.47*/("""">Log Out</a>
				""")))}/*54.7*/else/*54.12*/{_display_(Seq[Any](format.raw/*54.13*/("""
					"""),format.raw/*55.6*/("""<a href=""""),_display_(/*55.16*/routes/*55.22*/.LoginController.login()),format.raw/*55.46*/("""">Log In</a>
			
			</li>
""")))}),format.raw/*58.2*/("""			
		"""),format.raw/*59.3*/("""</ul>
	    </div>
	</nav>
	<div>
		<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*65.7*/content),format.raw/*65.14*/("""
					
				"""),format.raw/*67.5*/("""</div>
		</div>
	</div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by JAN
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*78.17*/routes/*78.23*/.Assets.versioned("javascripts/main.js")),format.raw/*78.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 26 15:41:16 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/main.scala.html
                  HASH: 6b7836facad600aad80f8d34bd5626e1eeb91e15
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1542->372|1570->373|1603->379|1640->388|1669->389|1698->390|1767->431|1796->432|1829->438|1869->450|1898->451|1927->452|1974->471|2003->472|2033->475|2071->485|2100->486|2152->510|2181->511|2214->517|2253->528|2282->529|2311->530|2378->569|2407->570|2440->576|2479->587|2508->588|2537->589|2603->627|2632->628|2665->634|2702->643|2731->644|2760->645|2800->657|2829->658|2859->661|2902->676|2931->677|2971->689|3000->690|3030->693|3066->701|3095->702|3135->714|3164->715|3194->718|3231->727|3260->728|3301->741|3330->742|3360->745|3402->759|3431->760|3470->771|3499->772|3529->775|3565->783|3594->784|3634->796|3663->797|3693->800|3729->808|3758->809|3813->836|3842->837|3872->840|3909->849|3938->850|3977->861|4006->862|4035->864|4096->898|4125->906|4215->969|4230->975|4293->1017|4479->1176|4494->1182|4538->1205|4643->1283|4674->1305|4714->1307|4760->1322|4798->1333|4813->1339|4857->1362|4911->1389|4945->1414|4985->1416|5031->1431|5069->1442|5084->1448|5129->1472|5188->1505|5230->1538|5270->1540|5316->1555|5354->1566|5369->1572|5417->1598|5469->1624|5501->1647|5541->1649|5587->1664|5625->1675|5640->1681|5684->1704|5739->1733|5774->1759|5814->1761|5860->1776|5898->1787|5913->1793|5966->1824|6021->1853|6084->1907|6124->1909|6156->1914|6188->1919|6229->1951|6269->1953|6315->1968|6353->1979|6368->1985|6418->2013|6476->2044|6512->2071|6552->2073|6598->2088|6636->2099|6651->2105|6704->2136|6765->2167|6796->2172|6862->2229|6902->2231|6934->2236|6966->2241|6999->2265|7039->2267|7085->2282|7123->2293|7138->2299|7183->2323|7241->2351|7276->2359|7307->2364|7340->2388|7380->2390|7426->2405|7459->2412|7484->2428|7524->2430|7557->2436|7594->2446|7609->2452|7655->2477|7692->2497|7705->2502|7744->2503|7777->2509|7814->2519|7829->2525|7874->2549|7931->2576|7964->2582|8080->2672|8108->2679|8146->2690|8362->2879|8377->2885|8438->2925
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|54->23|55->24|55->24|59->28|59->28|59->28|64->33|64->33|64->33|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|80->49|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|86->55|89->58|90->59|96->65|96->65|98->67|109->78|109->78|109->78
                  -- GENERATED --
              */
          