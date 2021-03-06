package org.apache.jsp.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Jobseeker;
import com.daos.JobApplyDao;
import com.beans.JobApply;
import java.util.ArrayList;
import com.daos.JsDao;

public final class ViewShortlisted_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../plugins/images/favicon.png\">\n");
      out.write("    <title>Dashboard|Jobs Applied</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("     ");

        if(session.getAttribute("company")==null)
        {
            
            response.sendRedirect("login.jsp");
            return;
        }
              
        
      out.write("\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("            <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"2\" stroke-miterlimit=\"10\" />\n");
      out.write("        </svg>\n");
      out.write("    </div>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Wrapper -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("        <!-- End Top Navigation -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Left Sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-title\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                        <h4 class=\"page-title\">Shortlisted Candidates</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                       \n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Shortlisted Candidates</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            \n");
      out.write("                            ");

                                int jid=request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
                                String title=request.getParameter("title");
                                JobApplyDao ja=new JobApplyDao();
                               JsDao js=new JsDao();
                                  
                                int i=1;
                                ArrayList<JobApply> jobapplylist=ja.getApprovedCandidates(jid);
                               boolean listempty=jobapplylist.isEmpty();
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                              \n");
      out.write("                            \n");
      out.write("                            <h4 class=\"box-title\">Shortlisted Candidates </h4>\n");
      out.write("                          \n");
      out.write("                           <h4><p class=\"text-muted\"> <code>For Job Title: ");
      out.print(title);
      out.write("</code></p></h4>\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                 \n");
      out.write("                                <table class=\"table\">\n");
      out.write("\n");
      out.write("                               ");
if(listempty==true){
      out.write("\n");
      out.write("                                    <h4> No candidate shortlisted for this job.</h4>\n");
      out.write("                                     ");
}
                                     else{
      out.write("\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>#</th>\n");
      out.write("                                            <th>Applied On</th>\n");
      out.write("                                            <th>Candidate Name</th>\n");
      out.write("                                            <th>Resume</th>\n");
      out.write("                                            <th>Action</th>\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");

                               
                                for(JobApply jobapply:jobapplylist)
                                {
                                    int jsid=jobapply.getJsid();
                                    int jaid=jobapply.getJaid();
                                    
                                    
                                    ArrayList<Jobseeker> jobseekerlist=js.getJobseekersInfo(jsid);
                                    
                                    for(Jobseeker jobseeker:jobseekerlist)
                                    {
                                    
                             
      out.write("\n");
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                     \n");
      out.write("                                            <td>");
      out.print(i);
      out.write(' ');
      out.print(jaid);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(jobapply.getApplicationDate());
      out.write("\n");
      out.write("                                             <td>");
      out.print(jobseeker.getFirst_name());
      out.write(' ');
      out.print(jobseeker.getLast_name());
      out.write("</td>\n");
      out.write("                                             <td><a href=\"../");
      out.print(jobapply.getResume());
      out.write("\" class=\"btn btn btn-rounded btn-default btn-outline m-r-5\"><i class=\"ti-check text-success m-r-5\"></i>View Resume</a> </td>\n");
      out.write("                                            \n");
      out.write("                                           \n");
      out.write("                                             <td>\n");
      out.write("\n");
      out.write("                                                 \n");
      out.write("                                                 <a href=\"SendMail.jsp\"\n");
      out.write("                                                   \n");
      out.write("                                                    class=\"btn btn btn-rounded btn-default btn-outline m-r-5\">\n");
      out.write("                                                     <i class=\"ti-check text-success m-r-5\"></i>Send Mail\n");
      out.write("                                                 </a>\n");
      out.write("                                                    \n");
      out.write("                                                                                                \n");
      out.write("                                             </td>\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                       \n");
      out.write("                                     ");
}
                                        i++;
                                    }
      out.write("\n");
      out.write("                                        \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"../Main_template/plugins/bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"../Main_template/html/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"../Main_template/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\n");
      out.write("    <!--slimscroll JavaScript -->\n");
      out.write("    <script src=\"../Main_template/html/js/jquery.slimscroll.js\"></script>\n");
      out.write("    <!--Wave Effects -->\n");
      out.write("    <script src=\"../Main_template/html/js/waves.js\"></script>\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"../Main_template/html/js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
