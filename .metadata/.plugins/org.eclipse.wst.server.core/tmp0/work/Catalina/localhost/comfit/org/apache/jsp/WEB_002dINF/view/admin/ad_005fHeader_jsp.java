/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2022-06-24 07:16:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ad_005fHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1655638592940L));
    _jspx_dependants.put("jar:file:/C:/Final_Project_ComFIt/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/comfit/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- 기기별 크기 담당 -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\", initial-scale=\"1\">\r\n");
      out.write("<!-- 디자인 담당 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css\">\r\n");
      out.write("<!-- 폰트 적용 -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("  /* 사이드바 래퍼 스타일 */\r\n");
      out.write("  *{font-family: 'Noto Sans KR', sans-serif;}\r\n");
      out.write("  \r\n");
      out.write("  #page-wrapper {\r\n");
      out.write("    padding-left: 250px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #sidebar-wrapper {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    margin-left: -250px;\r\n");
      out.write("    background: white;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    overflow-y: auto;\r\n");
      out.write("    box-shadow: 0 1px 3px 0 rgba(0,0,0,0.50);\r\n");
      out.write("  }\r\n");
      out.write("body {\r\n");
      out.write("  min-height: 100vh;\r\n");
      out.write("  min-height: -webkit-fill-available;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("  height: -webkit-fill-available;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("main {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-wrap: nowrap;\r\n");
      out.write("  height: 100vh;\r\n");
      out.write("  height: -webkit-fill-available;\r\n");
      out.write("  max-height: 100vh;\r\n");
      out.write("  overflow-x: auto;\r\n");
      out.write("  overflow-y: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b-example-divider {\r\n");
      out.write("  flex-shrink: 0;\r\n");
      out.write("  width: 1.5rem;\r\n");
      out.write("  height: 100vh;\r\n");
      out.write("  background-color: rgba(0, 0, 0, .1);\r\n");
      out.write("  border: solid rgba(0, 0, 0, .15);\r\n");
      out.write("  border-width: 1px 0;\r\n");
      out.write("  box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bi {\r\n");
      out.write("  vertical-align: -.125em;\r\n");
      out.write("  pointer-events: none;\r\n");
      out.write("  fill: currentColor;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-toggle { outline: 0; }\r\n");
      out.write("\r\n");
      out.write(".nav-flush .nav-link {\r\n");
      out.write("  border-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-toggle {\r\n");
      out.write("  display: inline-flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding: .25rem .5rem;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  color: rgba(0, 0, 0, .65);\r\n");
      out.write("  background-color: transparent;\r\n");
      out.write("  border: 0;\r\n");
      out.write("}\r\n");
      out.write(".btn-toggle:hover,\r\n");
      out.write(".btn-toggle:focus {\r\n");
      out.write("  color: rgba(0, 0, 0, .85);\r\n");
      out.write("  background-color: #d2f4ea;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-toggle::before {\r\n");
      out.write("  width: 1.25em;\r\n");
      out.write("  line-height: 0;\r\n");
      out.write("  content: url(\"data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' width='16' height='16' viewBox='0 0 16 16'%3e%3cpath fill='none' stroke='rgba%280,0,0,.5%29' stroke-linecap='round' stroke-linejoin='round' stroke-width='2' d='M5 14l6-6-6-6'/%3e%3c/svg%3e\");\r\n");
      out.write("  transition: transform .35s ease;\r\n");
      out.write("  transform-origin: .5em 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-toggle[aria-expanded=\"true\"] {\r\n");
      out.write("  color: rgba(0, 0, 0, .85);\r\n");
      out.write("}\r\n");
      out.write(".btn-toggle[aria-expanded=\"true\"]::before {\r\n");
      out.write("  transform: rotate(90deg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-toggle-nav a {\r\n");
      out.write("  display: inline-flex;\r\n");
      out.write("  padding: .1875rem .5rem;\r\n");
      out.write("  margin-top: .125rem;\r\n");
      out.write("  margin-left: 1.25rem;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".btn-toggle-nav a:hover,\r\n");
      out.write(".btn-toggle-nav a:focus {\r\n");
      out.write("  background-color: #d2f4ea;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".scrollarea {\r\n");
      out.write("  overflow-y: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fw-semibold { font-weight: 600; }\r\n");
      out.write(".lh-tight { line-height: 1.25; }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("body{background-color: #edf2f9;}\r\n");
      out.write("table {box-shadow: 0 1px 3px 0 rgba(0,0,0,0.20);} \r\n");
      out.write("table > thead {background-color: white;}\r\n");
      out.write("tbody {background-color: white;} \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- 사이드바 스타일 참조 안먹는 이유??? -->\r\n");
      out.write("<!-- <link href=\"css/sidebars.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- 사이드바 -->\r\n");
      out.write("  <div id=\"sidebar-wrapper\">\r\n");
      out.write("    <a href=\"\" class=\"d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom\">\r\n");
      out.write("      <svg class=\"bi me-2\" width=\"30\" height=\"24\"><!-- <use xlink:href=\"admin_main.jsp\"/> --></svg>\r\n");
      out.write("      <img alt=\"\" src=\"images/logo-admin.png\" style=\"width: 100%; margin-top: 10px\">\r\n");
      out.write("    </a>  \r\n");
      out.write("  \r\n");
      out.write("    <ul class=\"list-unstyled ps-0\">\r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("      <div class=\"d-grid gap-2\">         \r\n");
      out.write("        <button class=\"btn-toggle\" data-bs-toggle=\"collapse\" data-bs-target=\"#home-collapse\" aria-expanded=\"true\">\r\n");
      out.write("          회원관리\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("        <div class=\"collapse\" id=\"home-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("            <li><a href=\"admin_userlist.action\" class=\"link-dark rounded\">일반회원 관리</a></li>\r\n");
      out.write("            <li><a href=\"admin_bannedlist.action\" class=\"link-dark rounded\">차단회원 관리</a></li>\r\n");
      out.write("            <li><a href=\"admin_userout_list.action\" class=\"link-dark rounded\">탈퇴회원 관리</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <hr />\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("      <div class=\"d-grid gap-2\">\r\n");
      out.write("        <button class=\"btn-toggle\" data-bs-toggle=\"collapse\" data-bs-target=\"#dashboard-collapse\" aria-expanded=\"false\">\r\n");
      out.write("          거래관리\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>  \r\n");
      out.write("        <div class=\"collapse\" id=\"dashboard-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("            <li><a href=\"admin_product_list.action\" class=\"link-dark rounded\">상품관리</a></li>\r\n");
      out.write("            <li><a href=\"admin_money_list.action\" class=\"link-dark rounded\">입출금관리</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <hr /> \r\n");
      out.write("      \r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("      <div class=\"d-grid gap-2\">\r\n");
      out.write("        <button class=\"btn-toggle\" data-bs-toggle=\"collapse\" data-bs-target=\"#orders-collapse\" aria-expanded=\"false\" onclick=\"location.href='/comfit/admin_category_list.action'\">\r\n");
      out.write("          카테고리 관리\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>  \r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <hr />\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("      <div class=\"d-grid gap-2\">      \r\n");
      out.write("        <button class=\"btn-toggle\" data-bs-toggle=\"collapse\" data-bs-target=\"#account-collapse\" aria-expanded=\"false\">\r\n");
      out.write("          고객센터\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("        <div class=\"collapse\" id=\"account-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("            <li><a href=\"admin_report_list.action\" class=\"link-dark rounded\">신고관리</a></li>\r\n");
      out.write("            <li><a href=\"admin_ask_list.action\" class=\"link-dark rounded\">문의관리</a></li>\r\n");
      out.write("            <li><a href=\"admin_notice_list.action\" class=\"link-dark rounded\">공지사항</a></li>\r\n");
      out.write("            <li><a href=\"admin_faq_list.action\" class=\"link-dark rounded\">FAQ</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>      \r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- 본문 -->\r\n");
      out.write("  <div class=\"container-fluid\" style=\"height: 30px; width: 25; background-color: #f3f8ff;\">\r\n");
      out.write("  <span style=\"color: #bbbbbb\">관리자페이지입니다</span>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /본문 -->\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
