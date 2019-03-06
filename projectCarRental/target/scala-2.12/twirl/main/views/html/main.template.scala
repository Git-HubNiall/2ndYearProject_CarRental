
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
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color:teal; """),format.raw/*10.59*/("""}"""),format.raw/*10.60*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
		"""),format.raw/*15.3*/(""".sidecol input """),format.raw/*15.18*/("""{"""),format.raw/*15.19*/("""width: 100%;"""),format.raw/*15.31*/("""}"""),format.raw/*15.32*/("""
		"""),format.raw/*16.3*/(""".pickUp """),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""float: left;"""),format.raw/*16.24*/("""}"""),format.raw/*16.25*/("""
		"""),format.raw/*17.3*/(""".dropOff """),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""float: right;"""),format.raw/*17.26*/("""}"""),format.raw/*17.27*/("""
		"""),format.raw/*18.3*/(""".sidecol form """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/("""width: 50%;"""),format.raw/*18.29*/("""}"""),format.raw/*18.30*/("""
	"""),format.raw/*19.2*/("""</style>
	<title>OnlineCarRental """),_display_(/*20.26*/pagename),format.raw/*20.34*/("""</title>
    </head>
    <body>
	<link rel="header" type="image/jpg" href=""""),_display_(/*23.45*/routes/*23.51*/.Assets.versioned("images/carheader.jpg")),format.raw/*23.92*/("""">
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">OnlineCarRental</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*30.18*/if(pagename == "Home")/*30.40*/ {_display_(Seq[Any](format.raw/*30.42*/("""class="active"""")))}),format.raw/*30.57*/("""><a href=""""),_display_(/*30.68*/routes/*30.74*/.HomeController.index()),format.raw/*30.97*/("""">Home</a></li>
		    <li """),_display_(/*31.12*/if(pagename == "On Sale")/*31.37*/ {_display_(Seq[Any](format.raw/*31.39*/("""class="active"""")))}),format.raw/*31.54*/("""><a href=""""),_display_(/*31.65*/routes/*31.71*/.HomeController.onsale()),format.raw/*31.95*/("""">Cars To Rent</a></li>
			<li """),_display_(/*32.9*/if(pagename == "About")/*32.32*/ {_display_(Seq[Any](format.raw/*32.34*/("""class="active"""")))}),format.raw/*32.49*/("""><a href=""""),_display_(/*32.60*/routes/*32.66*/.HomeController.about()),format.raw/*32.89*/("""">About us</a></li>
			
			<li """),_display_(/*34.9*/if(pagename == "Log In")/*34.33*/ {_display_(Seq[Any](format.raw/*34.35*/("""class="active"""")))}),format.raw/*34.50*/(""">
				"""),_display_(/*35.6*/if(user != null)/*35.22*/ {_display_(Seq[Any](format.raw/*35.24*/("""
					"""),format.raw/*36.6*/("""<a href=""""),_display_(/*36.16*/routes/*36.22*/.LoginController.logout()),format.raw/*36.47*/("""">Log Out</a>
				""")))}/*37.7*/else/*37.12*/{_display_(Seq[Any](format.raw/*37.13*/("""
					"""),format.raw/*38.6*/("""<a href=""""),_display_(/*38.16*/routes/*38.22*/.LoginController.login()),format.raw/*38.46*/("""">Log In</a>
			
			</li>
""")))}),format.raw/*41.2*/("""			
		"""),format.raw/*42.3*/("""</ul>
	    </div>
	</nav>
	<div>
		<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*48.7*/content),format.raw/*48.14*/("""
					
				"""),format.raw/*50.5*/("""</div>
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
	<script src =""""),_display_(/*62.17*/routes/*62.23*/.Assets.versioned("javascripts/main.js")),format.raw/*62.63*/(""""></script>
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
                  DATE: Wed Mar 06 21:30:41 GMT 2019
                  SOURCE: /home/wdd/Desktop/projectError/year2Project/projectCarRental/app/views/main.scala.html
                  HASH: ed4ce0360e3c708d13b30ba657323497bad599cd
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1542->372|1570->373|1603->379|1640->388|1669->389|1698->390|1768->432|1797->433|1830->439|1870->451|1899->452|1928->453|1975->472|2004->473|2037->479|2076->490|2105->491|2134->492|2201->531|2230->532|2263->538|2302->549|2331->550|2360->551|2426->589|2455->590|2488->596|2525->605|2554->606|2583->607|2623->619|2652->620|2682->623|2725->638|2754->639|2794->651|2823->652|2853->655|2889->663|2918->664|2958->676|2987->677|3017->680|3054->689|3083->690|3124->703|3153->704|3183->707|3225->721|3254->722|3293->733|3322->734|3351->736|3412->770|3441->778|3544->854|3559->860|3621->901|3868->1121|3899->1143|3939->1145|3985->1160|4023->1171|4038->1177|4082->1200|4136->1227|4170->1252|4210->1254|4256->1269|4294->1280|4309->1286|4354->1310|4412->1342|4444->1365|4484->1367|4530->1382|4568->1393|4583->1399|4627->1422|4685->1454|4718->1478|4758->1480|4804->1495|4837->1502|4862->1518|4902->1520|4935->1526|4972->1536|4987->1542|5033->1567|5070->1587|5083->1592|5122->1593|5155->1599|5192->1609|5207->1615|5252->1639|5309->1666|5342->1672|5458->1762|5486->1769|5524->1780|5742->1971|5757->1977|5818->2017
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|50->19|51->20|51->20|54->23|54->23|54->23|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|72->41|73->42|79->48|79->48|81->50|93->62|93->62|93->62
                  -- GENERATED --
              */
          