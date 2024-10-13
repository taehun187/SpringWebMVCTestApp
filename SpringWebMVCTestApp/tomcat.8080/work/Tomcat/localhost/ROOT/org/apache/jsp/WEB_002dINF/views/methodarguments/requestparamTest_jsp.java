/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-10-13 16:49:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.methodarguments;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class requestparamTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Test Request Params, Search Pets, and Process Form</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Test Request Params, Search Pets, and Process Form</h1>\n");
      out.write("\n");
      out.write("    <!-- Test /requestparam endpoint -->\n");
      out.write("    <h2>Test RequestParam (name)</h2>\n");
      out.write("    <form action=\"requestparam\" method=\"get\">\n");
      out.write("        <label for=\"name\">Enter your name:</label>\n");
      out.write("        <input type=\"text\" id=\"name\" name=\"name\">\n");
      out.write("        <button type=\"button\" onclick=\"sendRequest()\">Submit with Name</button>\n");
      out.write("        <button type=\"button\" onclick=\"sendRequestWithoutName()\">Submit Without Name</button>\n");
      out.write("    </form>\n");
      out.write("    <h3>Result from /requestparam:</h3>\n");
      out.write("    <h2 id=\"requestParamResult\"></h2>\n");
      out.write("\n");
      out.write("    <!-- Test /search endpoint -->\n");
      out.write("    <h2>Test Search Pets (types)</h2>\n");
      out.write("    <form action=\"search\" method=\"get\">\n");
      out.write("        <label for=\"type1\">Enter pet type 1:</label>\n");
      out.write("        <input type=\"text\" id=\"type1\" name=\"type\">\n");
      out.write("        <br>\n");
      out.write("        <label for=\"type2\">Enter pet type 2:</label>\n");
      out.write("        <input type=\"text\" id=\"type2\" name=\"type\">\n");
      out.write("        <br>\n");
      out.write("        <button type=\"button\" onclick=\"sendSearchRequest()\">Search Pets</button>\n");
      out.write("    </form>\n");
      out.write("    <h3>Result from /search:</h3>\n");
      out.write("    <h2 id=\"searchResult\"></h2>\n");
      out.write("\n");
      out.write("    <!-- Test /process endpoint -->\n");
      out.write("    <h2>Test Process Form</h2>\n");
      out.write("    <form id=\"processForm\">\n");
      out.write("        <label for=\"key1\">Key 1:</label>\n");
      out.write("        <input type=\"text\" id=\"key1\" name=\"key1\">\n");
      out.write("        <br>\n");
      out.write("        <label for=\"key2\">Key 2:</label>\n");
      out.write("        <input type=\"text\" id=\"key2\" name=\"key2\">\n");
      out.write("        <br>\n");
      out.write("        <button type=\"button\" onclick=\"sendProcessForm()\">Submit Form</button>\n");
      out.write("    </form>\n");
      out.write("    <h3>Result from /process:</h3>\n");
      out.write("    <h2 id=\"processResult\"></h2>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Function to test /requestparam endpoint with a name parameter\n");
      out.write("        function sendRequest() {\n");
      out.write("            var name = document.getElementById(\"name\").value;\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"GET\", \"/requestparam?name=\" + encodeURIComponent(name), true);\n");
      out.write("            xhr.onreadystatechange = function () {\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                    document.getElementById(\"requestParamResult\").innerHTML = xhr.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Function to test /requestparam endpoint without a name parameter\n");
      out.write("        function sendRequestWithoutName() {\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"GET\", \"/requestparam\", true); // name 파라미터 없이 전송\n");
      out.write("            xhr.onreadystatechange = function () {\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                    document.getElementById(\"requestParamResult\").innerHTML = xhr.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Function to test /search endpoint with pet types\n");
      out.write("        function sendSearchRequest() {\n");
      out.write("            var type1 = document.getElementById(\"type1\").value;\n");
      out.write("            var type2 = document.getElementById(\"type2\").value;\n");
      out.write("            \n");
      out.write("            var params = \"type=\" + encodeURIComponent(type1);\n");
      out.write("            if (type2) {\n");
      out.write("                params += \"&type=\" + encodeURIComponent(type2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"GET\", \"/search?\" + params, true);\n");
      out.write("            xhr.onreadystatechange = function () {\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                    document.getElementById(\"searchResult\").innerHTML = xhr.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Function to test /process endpoint with form data\n");
      out.write("        function sendProcessForm() {\n");
      out.write("            var formData = new FormData(document.getElementById(\"processForm\"));\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"POST\", \"/process\", true);\n");
      out.write("            xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("\n");
      out.write("            // Converting formData to URL-encoded format\n");
      out.write("            var params = new URLSearchParams(formData).toString();\n");
      out.write("\n");
      out.write("            xhr.onreadystatechange = function() {\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                    document.getElementById(\"processResult\").innerHTML = xhr.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send(params);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
