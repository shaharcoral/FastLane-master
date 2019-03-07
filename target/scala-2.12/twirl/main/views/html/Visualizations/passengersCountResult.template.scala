
package views.html.Visualizations

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

object passengersCountResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[PassengersCountForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(result: PassengersCountForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/resultLayout("Passengers count result")/*3.41*/{_display_(Seq[Any](format.raw/*3.42*/("""
"""),format.raw/*4.1*/("""<style>
        div.l1 """),format.raw/*5.16*/("""{"""),format.raw/*5.17*/("""
            """),format.raw/*6.13*/("""background-color: #ed6498;
            opacity: 0.1;
            filter: alpha(opacity=10); /* For IE8 and earlier */
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""

        """),format.raw/*11.9*/("""div.l2 """),format.raw/*11.16*/("""{"""),format.raw/*11.17*/("""
            """),format.raw/*12.13*/("""background-color: #ed6498;
            opacity: 0.2;
            filter: alpha(opacity=20); /* For IE8 and earlier */
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""

        """),format.raw/*17.9*/("""div.l3 """),format.raw/*17.16*/("""{"""),format.raw/*17.17*/("""
            """),format.raw/*18.13*/("""background-color: #ed6498;
            opacity: 0.3;
            filter: alpha(opacity=30); /* For IE8 and earlier */
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""div.l4 """),format.raw/*22.16*/("""{"""),format.raw/*22.17*/("""
            """),format.raw/*23.13*/("""background-color: #ed6498;
            opacity: 0.4;
            filter: alpha(opacity=40); /* For IE8 and earlier */
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""div.l5 """),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
            """),format.raw/*28.13*/("""background-color: #ed6498;
            opacity: 0.5;
            filter: alpha(opacity=50); /* For IE8 and earlier */
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""div.l6 """),format.raw/*32.16*/("""{"""),format.raw/*32.17*/("""
            """),format.raw/*33.13*/("""background-color: #ed6498;
            opacity: 0.6;
            filter: alpha(opacity=60); /* For IE8 and earlier */
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""div.l7 """),format.raw/*37.16*/("""{"""),format.raw/*37.17*/("""
            """),format.raw/*38.13*/("""background-color: #ed6498;
            opacity: 0.7;
            filter: alpha(opacity=70); /* For IE8 and earlier */
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""
        """),format.raw/*42.9*/("""div.l8 """),format.raw/*42.16*/("""{"""),format.raw/*42.17*/("""
            """),format.raw/*43.13*/("""background-color: #ed6498;
            opacity: 0.8;
            filter: alpha(opacity=80); /* For IE8 and earlier */
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
        """),format.raw/*47.9*/("""div.l9 """),format.raw/*47.16*/("""{"""),format.raw/*47.17*/("""
            """),format.raw/*48.13*/("""background-color: #ed6498;
            opacity: 0.9;
            filter: alpha(opacity=90); /* For IE8 and earlier */
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""
        """),format.raw/*52.9*/("""div.l10 """),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
            """),format.raw/*53.13*/("""background-color: #ed6498;
            opacity: 1;
            filter: alpha(opacity=100); /* For IE8 and earlier */
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""
    """),format.raw/*57.5*/("""</style>
""")))}/*58.2*/{_display_(Seq[Any](format.raw/*58.3*/("""
"""),_display_(/*59.2*/result/*59.8*/.getParametersList()),format.raw/*59.28*/(""";
""")))}/*60.2*/{_display_(Seq[Any](format.raw/*60.3*/("""
    """),format.raw/*61.5*/("""mapboxgl.accessToken = 'pk.eyJ1IjoiYWh1dmlsIiwiYSI6ImNqcHdjdmN1bDA1bjY0OXVqb2pucWo5b2oifQ.DlCUMxPJ6c3TD2eLq3OCEQ';
    var map = new mapboxgl.Map("""),format.raw/*62.32*/("""{"""),format.raw/*62.33*/("""
    """),format.raw/*63.5*/("""container: 'map',
    style: 'mapbox://styles/mapbox/light-v9',
    center: [34.798256,31.260114],
    zoom: 14,
    maxZoom:15,
    minZoom:13,
    // maxBounds: bounds
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/(""");

    map.on('load', function () """),format.raw/*72.32*/("""{"""),format.raw/*72.33*/("""
        """),format.raw/*73.9*/("""addLoadLayer();
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/(""");
    var json = """),format.raw/*75.16*/("""{"""),format.raw/*75.17*/(""""type":"FeatureCollection","features":["""),format.raw/*75.56*/("""{"""),format.raw/*75.57*/(""""type":"Feature","properties":"""),format.raw/*75.87*/("""{"""),format.raw/*75.88*/(""""load":1"""),format.raw/*75.96*/("""}"""),format.raw/*75.97*/(""","geometry":"""),format.raw/*75.109*/("""{"""),format.raw/*75.110*/(""""type":"LineString","coordinates":[[34.798108,31.23819],[34.808931,31.226122]]"""),format.raw/*75.188*/("""}"""),format.raw/*75.189*/("""}"""),format.raw/*75.190*/("""]"""),format.raw/*75.191*/("""}"""),format.raw/*75.192*/("""
    """),format.raw/*76.5*/("""<!--var json = Json.parse("""),_display_(/*76.32*/result/*76.38*/.resultString),format.raw/*76.51*/(""");-->
    function addLoadLayer() """),format.raw/*77.29*/("""{"""),format.raw/*77.30*/("""
        """),format.raw/*78.9*/("""map.addLayer("""),format.raw/*78.22*/("""{"""),format.raw/*78.23*/("""
            """),format.raw/*79.13*/("""'id': 'loadLater',
            'type': 'line',
            'source': """),format.raw/*81.23*/("""{"""),format.raw/*81.24*/("""
            """),format.raw/*82.13*/("""'type': 'geojson',
            'data': json
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/(""",
            'layout': """),format.raw/*85.23*/("""{"""),format.raw/*85.24*/("""
            """),format.raw/*86.13*/("""'line-cap': 'round',
            'line-join': 'round'
            """),format.raw/*88.13*/("""}"""),format.raw/*88.14*/(""",
            'paint': """),format.raw/*89.22*/("""{"""),format.raw/*89.23*/("""
            """),format.raw/*90.13*/("""'line-color': '#ed6498',
            'line-width': 5,
            'line-opacity': ['get', 'load']
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/(""",
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/(""");
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""

    """),format.raw/*97.5*/("""map.on('click','stationsLayer',function(e)"""),format.raw/*97.47*/("""{"""),format.raw/*97.48*/("""
        """),format.raw/*98.9*/("""var coordinates = e.features[0].geometry.coordinates.slice();
        var description  = e.features[0].properties.id+": "+e.features[0].properties.name;
        while (Math.abs(e.lngLat.lng - coordinates[0]) > 180) """),format.raw/*100.63*/("""{"""),format.raw/*100.64*/("""
        """),format.raw/*101.9*/("""coordinates[0] += e.lngLat.lng > coordinates[0] ? 360 : -360;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""

    """),format.raw/*104.5*/("""new mapboxgl.Popup()
        .setLngLat(coordinates)
        .setHTML(description)
        .addTo(map);
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/(""");

    map.on('mousemove', function (e) """),format.raw/*110.38*/("""{"""),format.raw/*110.39*/("""
        """),format.raw/*111.9*/("""document.getElementById('info').innerHTML =
        // e.point is the x, y coordinates of the mousemove event relative
        // to the top-left corner of the map
        JSON.stringify(e.point) + '<br />' +
        // e.lngLat is the longitude, latitude geographical position of the event
        JSON.stringify(e.lngLat);
    """),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""");

""")))}/*119.2*/{_display_(Seq[Any](format.raw/*119.3*/("""
"""),format.raw/*120.1*/("""<div class="parameters">
    <div class="l1"> <10 passengers </div>
    <div class="l2"> 20 passengers </div>
    <div class="l3"> 30 passengers </div>
    <div class="l4"> 40 passengers </div>
    <div class="l5"> 50 passengers </div>
    <div class="l6"> 60 passengers </div>
    <div class="l7"> 70 passengers </div>
    <div class="l8"> 80 passengers </div>
    <div class="l9"> 90 passengers </div>
    <div class="l10"> >100 passengers </div>

</div>
""")))}),format.raw/*133.2*/("""

"""))
      }
    }
  }

  def render(result:PassengersCountForm): play.twirl.api.HtmlFormat.Appendable = apply(result)

  def f:((PassengersCountForm) => play.twirl.api.HtmlFormat.Appendable) = (result) => apply(result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 13:03:44 IST 2019
                  SOURCE: C:/Users/shaha/Desktop/p_n/FastLane-master/app/views/Visualizations/passengersCountResult.scala.html
                  HASH: bbacc6c96587248c547a793bbbaa5909f4af5510
                  MATRIX: 992->1|1115->31|1142->33|1189->72|1227->73|1254->74|1304->97|1332->98|1372->111|1524->237|1552->238|1589->248|1624->255|1653->256|1694->269|1847->395|1876->396|1913->406|1948->413|1977->414|2018->427|2171->553|2200->554|2236->563|2271->570|2300->571|2341->584|2494->710|2523->711|2559->720|2594->727|2623->728|2664->741|2817->867|2846->868|2882->877|2917->884|2946->885|2987->898|3140->1024|3169->1025|3205->1034|3240->1041|3269->1042|3310->1055|3463->1181|3492->1182|3528->1191|3563->1198|3592->1199|3633->1212|3786->1338|3815->1339|3851->1348|3886->1355|3915->1356|3956->1369|4109->1495|4138->1496|4174->1505|4210->1513|4239->1514|4280->1527|4432->1652|4461->1653|4493->1658|4521->1668|4559->1669|4587->1671|4601->1677|4642->1697|4663->1700|4701->1701|4733->1706|4907->1852|4936->1853|4968->1858|5169->2032|5197->2033|5260->2068|5289->2069|5325->2078|5372->2098|5400->2099|5446->2117|5475->2118|5542->2157|5571->2158|5629->2188|5658->2189|5694->2197|5723->2198|5764->2210|5794->2211|5901->2289|5931->2290|5961->2291|5991->2292|6021->2293|6053->2298|6107->2325|6122->2331|6156->2344|6218->2378|6247->2379|6283->2388|6324->2401|6353->2402|6394->2415|6491->2484|6520->2485|6561->2498|6645->2554|6674->2555|6726->2579|6755->2580|6796->2593|6890->2659|6919->2660|6970->2683|6999->2684|7040->2697|7178->2807|7207->2808|7244->2818|7273->2819|7307->2826|7335->2827|7368->2833|7438->2875|7467->2876|7503->2885|7747->3100|7777->3101|7814->3110|7908->3176|7937->3177|7971->3183|8107->3291|8136->3292|8206->3333|8236->3334|8273->3343|8630->3672|8659->3673|8683->3678|8722->3679|8751->3680|9240->4138
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5|37->6|40->9|40->9|42->11|42->11|42->11|43->12|46->15|46->15|48->17|48->17|48->17|49->18|52->21|52->21|53->22|53->22|53->22|54->23|57->26|57->26|58->27|58->27|58->27|59->28|62->31|62->31|63->32|63->32|63->32|64->33|67->36|67->36|68->37|68->37|68->37|69->38|72->41|72->41|73->42|73->42|73->42|74->43|77->46|77->46|78->47|78->47|78->47|79->48|82->51|82->51|83->52|83->52|83->52|84->53|87->56|87->56|88->57|89->58|89->58|90->59|90->59|90->59|91->60|91->60|92->61|93->62|93->62|94->63|101->70|101->70|103->72|103->72|104->73|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|109->78|109->78|109->78|110->79|112->81|112->81|113->82|115->84|115->84|116->85|116->85|117->86|119->88|119->88|120->89|120->89|121->90|124->93|124->93|125->94|125->94|126->95|126->95|128->97|128->97|128->97|129->98|131->100|131->100|132->101|133->102|133->102|135->104|139->108|139->108|141->110|141->110|142->111|148->117|148->117|150->119|150->119|151->120|164->133
                  -- GENERATED --
              */
          