
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
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
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>OFM """),_display_(/*16.14*/pagename),format.raw/*16.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "On Sale")/*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""class="active"""")))}),format.raw/*26.54*/("""><a href=""""),_display_(/*26.65*/routes/*26.71*/.HomeController.onsale()),format.raw/*26.95*/("""">On Sale</a></li>
			<li """),_display_(/*27.9*/if(pagename == "About")/*27.32*/ {_display_(Seq[Any](format.raw/*27.34*/("""class="active"""")))}),format.raw/*27.49*/("""><a href=""""),_display_(/*27.60*/routes/*27.66*/.HomeController.about()),format.raw/*27.89*/("""">About us</a></li>
			<li """),_display_(/*28.9*/if(pagename == "Log In")/*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""class="active"""")))}),format.raw/*28.50*/("""><a href=""""),_display_(/*28.61*/routes/*28.67*/.LoginController.login()),format.raw/*28.91*/("""">Log In</a></li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*44.5*/content),format.raw/*44.12*/("""
		    """),format.raw/*45.7*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*63.17*/routes/*63.23*/.Assets.versioned("javascripts/main.js")),format.raw/*63.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename) => (content) => apply(pagename)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 20 16:14:55 GMT 2019
                  SOURCE: /home/wdd/lab5CRUDCDU/app/views/main.scala.html
                  HASH: 1424f35358791fe26aca286e511f3f0d655d0f9a
                  MATRIX: 952->1|1077->33|1359->288|1387->289|1415->290|1500->348|1528->349|1561->355|1598->364|1627->365|1656->366|1732->414|1761->415|1794->421|1834->433|1863->434|1892->435|1939->454|1968->455|2001->461|2040->472|2069->473|2098->474|2165->513|2194->514|2227->520|2266->531|2295->532|2324->533|2390->571|2419->572|2452->578|2489->587|2518->588|2547->589|2587->601|2616->602|2645->604|2694->626|2723->634|2995->879|3026->901|3066->903|3112->918|3150->929|3165->935|3209->958|3263->985|3297->1010|3337->1012|3383->1027|3421->1038|3436->1044|3481->1068|3534->1095|3566->1118|3606->1120|3652->1135|3690->1146|3705->1152|3749->1175|3803->1203|3836->1227|3876->1229|3922->1244|3960->1255|3975->1261|4020->1285|4566->1805|4594->1812|4628->1819|5264->2428|5279->2434|5340->2474
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|75->44|75->44|76->45|94->63|94->63|94->63
                  -- GENERATED --
              */
          