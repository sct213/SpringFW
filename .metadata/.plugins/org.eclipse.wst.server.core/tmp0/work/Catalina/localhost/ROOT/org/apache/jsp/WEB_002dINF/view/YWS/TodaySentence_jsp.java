/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-17 23:42:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.YWS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TodaySentence_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/sidebar.jsp", Long.valueOf(1597191183000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!--\n");
      out.write("=========================================================\n");
      out.write("* Paper Dashboard 2 - v2.0.1\n");
      out.write("=========================================================\n");
      out.write("\n");
      out.write("* Product Page: https://www.creative-tim.com/product/paper-dashboard-2\n");
      out.write("* Copyright 2020 Creative Tim (https://www.creative-tim.com)\n");
      out.write("\n");
      out.write("Coded by www.creative-tim.com\n");
      out.write("\n");
      out.write(" =========================================================\n");
      out.write("\n");
      out.write("* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"76x76\"\n");
      out.write("\thref=\"/resources/assets/img/apple-icon.png\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\n");
      out.write("\thref=\"/resources/assets/img/favicon.png\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("<title>Today Highlight English</title>\n");
      out.write("<meta\n");
      out.write("\tcontent='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'\n");
      out.write("\tname='viewport' />\n");
      out.write("<!--     Fonts and icons     -->\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\"\n");
      out.write("\trel=\"stylesheet\" />\n");
      out.write("<link\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!-- CSS Files -->\n");
      out.write("<link href=\"/resources/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"/resources/assets/css/paper-dashboard.css?v=2.0.1\"\n");
      out.write("\trel=\"stylesheet\" />\n");
      out.write("<!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("<link href=\"/resources/assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"\">\n");
      out.write("\t<div class=\"wrapper \">\n");
      out.write("\t\t");
      out.write('\n');


	String user_id  = (String)request.getAttribute("user_id");


      out.write("\n");
      out.write("<div class=\"sidebar\" data-color=\"white\" data-active-color=\"danger\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <a href=\"https://www.creative-tim.com\" class=\"simple-text logo-mini\">\n");
      out.write("          <div class=\"logo-image-small\">\n");
      out.write("            <img src=\"/resources/assets/img/logo-small.png\">\n");
      out.write("          </div>\n");
      out.write("          <!-- <p>CT</p> -->\n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://www.creative-tim.com\" class=\"simple-text logo-normal\">\n");
      out.write("          ");
      out.print(user_id );
      out.write("\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"active \">\n");
      out.write("            <a href=\"/test.do\">\n");
      out.write("              <i class=\"nc-icon nc-air-baloon\"></i>\n");
      out.write("              <p>메인</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./icons.html\">\n");
      out.write("              <i class=\"nc-icon nc-diamond\"></i>\n");
      out.write("              <p>Icons</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./map.html\">\n");
      out.write("              <i class=\"nc-icon nc-pin-3\"></i>\n");
      out.write("              <p>Maps</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./notifications.html\">\n");
      out.write("              <i class=\"nc-icon nc-bell-55\"></i>\n");
      out.write("              <p>Notifications</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./user.html\">\n");
      out.write("              <i class=\"nc-icon nc-single-02\"></i>\n");
      out.write("              <p>User Profile</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./tables.html\">\n");
      out.write("              <i class=\"nc-icon nc-tile-56\"></i>\n");
      out.write("              <p>Table List</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./typography.html\">\n");
      out.write("              <i class=\"nc-icon nc-caps-small\"></i>\n");
      out.write("              <p>Typography</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"active-pro\">\n");
      out.write("            <a href=\"./upgrade.html\">\n");
      out.write("              <i class=\"nc-icon nc-spaceship\"></i>\n");
      out.write("              <p>Upgrade to PRO</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("\t\t<div class=\"main-panel\">\n");
      out.write("\t\t\t<!-- Navbar -->\n");
      out.write("\t\t\t<nav\n");
      out.write("\t\t\t\tclass=\"navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-wrapper\">\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-toggle\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggler\" id=\"navbar-toggler\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"navbar-toggler-bar bar1\"></span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"navbar-toggler-bar bar2\"></span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"javascript:;\">Today Highlight\n");
      out.write("\t\t\t\t\t\t\tEnglish</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse justify-content-end\"\n");
      out.write("\t\t\t\t\t\tid=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group no-border\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group-append\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"nc-icon nc-zoom-split\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<ul class=\"navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link btn-magnify\"\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:;\"> <i class=\"nc-icon nc-layout-11\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"d-lg-none d-md-block\">Stats</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item btn-rotate dropdown\"><a\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"http://example.com\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\"\n");
      out.write("\t\t\t\t\t\t\t\taria-haspopup=\"true\" aria-expanded=\"false\"> <i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"nc-icon nc-bell-55\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"d-lg-none d-md-block\">Some Actions</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Action</a> <a\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Another action</a> <a\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link btn-rotate\"\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:;\"> <i class=\"nc-icon nc-settings-gear-65\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"d-lg-none d-md-block\">Account</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<!-- End Navbar -->\n");
      out.write("\t\t\t<!-- 뉴스 기사 삽입. -->\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"mt-0 mb-0 text-center\"><b>The New York Times</b></h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h6 class=\"m-3\" style=\"color:orange\">Today Sentence</h6>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"m-3\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"card-text\"><b>Pros and Cons of 5G Technology</b></h3>\n");
      out.write("\t\t\t\t\t\t<h6 style=\"color:grey\">Writer's name</h6>\n");
      out.write("\t\t\t\t\t\t<h6 style=\"color:grey\">2020, Dec 11</h6>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<p class=\"m-4\" style=\"font-size:1.5em\">\n");
      out.write("\t\t\t\t\t\tSelf-diriving cars, smart cities, fully \n");
      out.write("\t\t\t\t\t\tconnected homes, robots. This is the future and it will 2be powered\n");
      out.write("\t\t\t\t\t\tby 5G.\n");
      out.write("\t\t\t\t\t\t<!--  The G stands for 3generation as in next <b>generation</b> wireless network\n");
      out.write("\t\t\t\t\t\tand it's going to be fast. About 10 times faster than 4G network on your phone\n");
      out.write("\t\t\t\t\t\tright now. Today it takes about six minutes to download a 3D movies with 4G.\n");
      out.write("\t\t\t\t\t\tWith 5G, it will be 30 seconds. but 5G is about more than just super fast downloads\n");
      out.write("\t\t\t\t\t\tand fewer dropped calls, really about connecting the 4 Internet of things. All those... -->\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<h6 style=\"color:orange\">Korean</h6>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<p class=\"m-4\" style=\"font-size:1.5em\">자율 주행차, 스마트 시티, 완전히 연결된 주택, 로봇, 이것이 미래이며 5G로 구동될 것입니다. \n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<!-- 뉴스 기사 끝. -->\n");
      out.write("\t\t\t<!-- 다음으로 넘어가는 버튼 만들기  -->\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t<input style=\"float:right;\" class=\"btn btn-outline-warning\" type=\"button\" value=\"Next\" onclick=\"location='YWS/TodayExam.do'\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<!-- --------------------------------------------------------------------------- -->\n");
      out.write("\t\t\t<!-- footer -->\n");
      out.write("\t\t\t<footer class=\"footer footer-black  footer-white \">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<nav class=\"footer-nav\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.creative-tim.com\" target=\"_blank\">Creative\n");
      out.write("\t\t\t\t\t\t\t\t\t\tTim</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.creative-tim.com/blog\"\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"_blank\">Blog</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.creative-tim.com/license\"\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"_blank\">Licenses</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t<div class=\"credits ml-auto\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"copyright\"> © <script>\n");
      out.write("\t\t\t\t\t\t\t\tdocument.write(new Date().getFullYear())\n");
      out.write("\t\t\t\t\t\t\t</script>, made with <i class=\"fa fa-heart heart\"></i> by Creative Tim\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--   Core JS Files   -->\n");
      out.write("\t<script src=\"/resources/assets/js/core/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"/resources/assets/js/core/popper.min.js\"></script>\n");
      out.write("\t<script src=\"/resources/assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"/resources/assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("\t<!--  Google Maps Plugin    -->\n");
      out.write("\t<script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\t<!-- Chart JS -->\n");
      out.write("\t<script src=\"/resources/assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("\t<!--  Notifications Plugin    -->\n");
      out.write("\t<script src=\"/resources/assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("\t<!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("\t<script src=\"/resources/assets/js/paper-dashboard.min.js?v=2.0.1\"\n");
      out.write("\t\ttype=\"text/javascript\"></script>\n");
      out.write("\t<!-- Paper Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"/resources/assets/demo/demo.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t// Javascript method's body can be found in assets/assets-for-demo/js/demo.js\n");
      out.write("\t\t\tdemo.initChartsPages();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\"#navbar-toggler\").on('click', function() {\n");
      out.write("\t\t\tif ($(this).hasClass(\"toggled\")) {\n");
      out.write("\t\t\t\t$(this).removeClass(\"toggled\");\n");
      out.write("\t\t\t\t$(\"html\").first().removeClass(\"nav-open\");\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$(this).addClass(\"toggled\");\n");
      out.write("\t\t\t\t$(\"html\").first().addClass(\"nav-open\");\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
