/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.Article;
import entity.Fournisseur;
import entity.type;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.sessionFournisseurLocal;


/**
 *
 * @author adeline
 */
@WebServlet(name = "AccesArticle", urlPatterns = {"/AccesArticle"})
public class AccesArticle extends HttpServlet {

    @EJB
    private sessionFournisseurLocal sessionFournisseur;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String jspClient = null; 
        String act= request.getParameter("action");
        if((act ==null)||(act.equals("vide"))){
            
        jspClient="/Choix.jsp";
        request.setAttribute( "message", "pas d'informations" );
        } 
        else if (act.equals("insererF")){
            jspClient="/Choix.jsp";
            doActionInsererF(request,response);
        }
          /*else if (act.equals("insererA")){
            jspClient="/Choix.jsp";
            doActionInsererA(request,response);
        }
            else if (act.equals("insererV")){
            jspClient="/Choix.jsp";
            doActionInsererV(request,response);
        }*/
        else if (act.equals("creerAF")){
        Collection <Fournisseur> list = sessionFournisseur.tousLesFournisseur();
        request.setAttribute("listefournisseurs",list);
        jspClient = "/Fraicheur.jsp";
        //doActionInsererAF(request,response);
        }
          else if (act.equals("creerA")){
        Collection <Fournisseur> list = sessionFournisseur.tousLesFournisseur();
        request.setAttribute("listefournisseurs",list);
        jspClient = "/Article.jsp";
        //doActionInsererA(request,response);
        }
            else if (act.equals("creerV")){
        Collection <Fournisseur> list = sessionFournisseur.tousLesFournisseur();
        request.setAttribute("listefournisseurs",list);
        jspClient = "/Vetement.jsp";
        //doActionInsererV(request,response);
        }
        
            else if (act.equals("docreerV")){
        jspClient = "/Choix.jsp";
        doActionInsererV(request,response);
        }
            else if (act.equals("docreerA")){
        jspClient = "/Choix.jsp";
        doActionInsererA(request,response);
        }
            else if (act.equals("docreerAF")){
        jspClient = "/Choix.jsp";
        doActionInsererAF(request,response);
        }
            
        else if (act.equals("afficherF"))
        {
        jspClient="/AfficherFournisseur.jsp";
        Collection <Fournisseur> list = sessionFournisseur.tousLesFournisseur();
        request.setAttribute("listefournisseurs",list);
        //request.setAttribute( "message", "Liste des fournisseurs existants" );
        }
         else if (act.equals("affichertouslesA"))
        {
        jspClient="/TouslesArt.jsp";
        Collection <Article> list = sessionFournisseur.Touslesart();
        request.setAttribute("listearticle",list);
        //request.setAttribute( "message", "Liste des fournisseurs existants" );
        }
         else if (act.equals("afficherA"))
        {
            jspClient="/AfficherA.jsp";
            String ident = request.getParameter("identifiantFournisseur"); 
            Long id; 
            if(ident != null){
            id = Long.valueOf(ident);
            Collection <Article> list = sessionFournisseur.afficherArticle(id);
            request.setAttribute("listearticle",list);
            }
 
        }
                 else if (act.equals("afficherSomme"))
        {
            jspClient="/SommeFinal.jsp";
            String ident = request.getParameter("identifiantFournisseur"); 
            Long id; 
             
            if(ident != null){
            id = Long.valueOf(ident);
                double list = sessionFournisseur.SommePrix(id);
                String message = "la somme de prix est : " + list; 
            request.setAttribute("message2", message);
            }
        }
                else if (act.equals("saisirIdF")) {
        HttpSession sess = request.getSession(true);
        String ident = request.getParameter( "identifiantFournisseur" ); 
        Integer id;
        Fournisseur f;
        if (!(ident.trim().isEmpty()))
        {
        id = Integer.valueOf(ident);
        f = sessionFournisseur.rechercherFourni(id);
        jspClient="/Fournisseur2.jsp";
        sess.setAttribute("four", f);
        } else {
        jspClient="/Choix.jsp";
        }
         }

            
        
        RequestDispatcher Rd;
        Rd = getServletContext().getRequestDispatcher(jspClient); 
        Rd.forward(request, response);
   
       
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AccesArticle</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AccesArticle at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
protected void doActionInsererF(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String nom =request.getParameter("nom"); 
    String adresse = request.getParameter("adresse"); 
    String message; 
    String ty = request.getParameter("typ"); 
    
   /* if (ty.equals("National")) {
    sessionFournisseur.creerFournisseur(nom, adresse,type.National);
    } else
    {
    sessionFournisseur.creerFournisseur(nom, adresse,type.Regionial);
    }*/
   
    if (nom.trim().isEmpty()|| adresse.trim().isEmpty() || ty.trim().isEmpty())
    {
        message ="Erreur" + "<br/><a href=\"CreerFournisseur.jsp\">Cliquez ici</a> pour acceder au formulaire"; 
        
    }else{
        type typ = type.valueOf(ty);
        sessionFournisseur.creerFournisseur(nom, adresse, typ);
        message= "Fournisseur creer avec succès";
    }
    request.setAttribute("message", message); 
    
}
    protected void doActionInsererAF(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    String designation= request.getParameter("designation"); 
    String message; 
    String num = request.getParameter("identifiantFournisseur"); 
    String  prix = request.getParameter("prix"); 
    String t = request.getParameter("limit"); 
   
    if (designation.trim().isEmpty() || prix.trim().isEmpty() || t.trim().isEmpty()|| num.trim().isEmpty())
    {
        message ="Erreur" + "<br/><a href=\"Fraicheur.jsp\">Cliquez ici</a> pour acceder au formulaire"; 
        
    }else{
        Date lim = Date.valueOf(t); 
        double pr = Double.valueOf(prix); 
        long n = Long.valueOf(num);
        sessionFournisseur.creerFraicheur(designation, pr, lim, n);
        message= "Article frais creer avec succès";
    }
    request.setAttribute("message", message); 
}
protected void doActionInsererV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    String designation= request.getParameter("designation"); 
    String message; 
    String num = request.getParameter("identifiantFournisseur"); 
    String  prix = request.getParameter("prix"); 
    String coloris = request.getParameter("coloris"); 
   
    if (designation.trim().isEmpty() || prix.trim().isEmpty() || coloris.trim().isEmpty() || num.trim().isEmpty())
        {
            message ="Erreur" + "<br/><a href=\"Vetement.jsp\">Cliquez ici</a> pour acceder au formulaire"; 

        }else{
            double pr = Double.valueOf(prix); 
            long n = Long.valueOf(num); 
            sessionFournisseur.creerVetement(designation, pr, coloris, n);
            message= "Vetement creer avec succès";
        }
        request.setAttribute("message", message); 
    }
protected void doActionInsererA(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
 
    String designation= request.getParameter("designation"); 
    String num = request.getParameter("identifiantFournisseur"); 
    String message; 
    String  prix = request.getParameter("prix"); 

   
    if (designation.trim().isEmpty() || prix.trim().isEmpty() ||  num.trim().isEmpty())
        {
            message ="Erreur" + "<br/><a href=\"Article.jsp\">Cliquez ici</a> pour acceder au formulaire"; 

        }else{
            double pr = Double.valueOf(prix); 
            long n = Long.valueOf(num); 
            sessionFournisseur.creerArticle(designation, pr, n);
            message= "Article creer avec succès";
        }
        request.setAttribute("message", message); 
    }

}
