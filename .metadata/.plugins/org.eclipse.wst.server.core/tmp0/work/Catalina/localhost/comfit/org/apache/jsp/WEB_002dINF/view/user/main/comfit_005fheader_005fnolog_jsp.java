/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2022-06-30 04:32:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comfit_005fheader_005fnolog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write('\r');
      out.write('\n');

   request.setCharacterEncoding("UTF-8");
   String cp = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>comfit 나만의 컴퓨터</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css\">\r\n");
      out.write("<!-- 폰트 적용 -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("*{font-family: 'Noto Sans KR', sans-serif;}\r\n");
      out.write(".navbar\r\n");
      out.write("{\r\n");
      out.write("\t background-color:white !important;\r\n");
      out.write("\t box-shadow: 0 1px 3px 0 rgba(0,0,0,0.20);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li a{\r\n");
      out.write("\tbackground-color:red;\r\n");
      out.write("} \r\n");
      out.write("\t\r\n");
      out.write(".nav .active a\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:orange !important;\r\n");
      out.write("}    \r\n");
      out.write("    \r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      .input-group\r\n");
      out.write("      {\r\n");
      out.write("         width: 50%;\r\n");
      out.write("         margin-left: 14px;\r\n");
      out.write("         \r\n");
      out.write("      }\r\n");
      out.write("      #mypage\r\n");
      out.write("      {\r\n");
      out.write("         font-family: 맑은 고딕;\r\n");
      out.write("         font-weight: bold;\r\n");
      out.write("         font-size: 18pt;\r\n");
      out.write("      }\r\n");
      out.write("      #sellBtn\r\n");
      out.write("      {\r\n");
      out.write("         width: 200px;\r\n");
      out.write("      }\r\n");
      out.write("      #dropdown-item\r\n");
      out.write("      {\r\n");
      out.write("         width: 200px;\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("<link href=\"headers.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$(\"#loginBtn0\").click(function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//alert(\"ㅎㅇ\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$(\"#login\").submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#searchBtn\").click(function()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (!$(\"#searchProduct\").val() == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(location).attr(\"href\", \"searchlist.action?searchKey=\"+$(\"#searchProduct\").val()\r\n");
      out.write("\t\t\t\t\t\t+\"&sort=1\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"검색어를 입력해 주세요.\");\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#searchProduct\").on(\"keyup\", function(key)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (key.keyCode == 13)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#searchBtn\").click();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("\t<form style=\"display: none\" action=\"loginform.action\" method=\"POST\" id=\"login\" name=\"login\">\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <header>\r\n");
      out.write("    <!-- nav 상단 고정-->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-white\"> \r\n");
      out.write("    \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a href=\"comfit.action\" > \r\n");
      out.write("\t           <img alt=\"logo\" src=\"");
      out.print(cp);
      out.write("/images/logo.png\" style=\"width: 200px;\">\r\n");
      out.write("\t        </a>\r\n");
      out.write("\t        \r\n");
      out.write("              \t<button class=\"navbar-toggler \" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t    </button>\r\n");
      out.write("            \r\n");
      out.write("              \t<div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarSupportedContent\">\r\n");
      out.write("              \t\t<br />\r\n");
      out.write("                 \t<form class=\"form-inline\" style=\"width: 100%;\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t\t\t     \t<div class=\"input-group\" style=\"width:75%; padding-left: 20%\">\r\n");
      out.write("\t\t\t\t\t\t     <input id=\"searchProduct\" type=\"text\" class=\"form-control\" placeholder=\"원하시는 상품을 검색하세요.\">\r\n");
      out.write("\t\t\t\t\t         <button id=\"searchBtn\" type=\"button\" class=\"btn btn-outline-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t <i class=\"bi bi-search\"></i>\r\n");
      out.write("\t\t\t\t\t         </button>\t\t\t\t\t\t\t     \r\n");
      out.write("\t  \t\t\t\t\t</div>\r\n");
      out.write("                \t</form>\r\n");
      out.write("                </div>\t\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li class=\"nav-item \">    \r\n");
      out.write("                    \r\n");
      out.write("                        <a class=\"nav-link primary active\" aria-current=\"page\" id=\"loginBtn0\" onclick=\"login()\">로그인</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link active\" href=\"registform.action\" style=\"\">회원가입</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      \t<a class=\"nav-link active\" href=\"svc.action\">고객센터</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    <br />\r\n");
      out.write("    <div class=\"text-end \" style=\"\">\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("  </header>\r\n");
      out.write("</div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>  \r\n");
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
