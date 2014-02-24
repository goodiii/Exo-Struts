package form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class FormBean extends ActionForm {

    private Integer n;
    private Integer m;
    private Integer produit;
    private Integer l;
    private Integer f;
    private Integer produit2;

    public FormBean() {
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.n = null;
        this.m = null;
        this.l = null;
        this.f = null;
        this.produit = null;
        this.produit2 = null;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if ( n > 999 ) {            
            errors.add("error", new ActionMessage("error.n"));
        }
   /*     if ( n != ) {
            errors.add("error", new ActionMessage("Veuillez saisir uniquement des nombres"));
       }*/ 
        return errors;
    }

    public Integer getn() {
        return n;
    }

    public void setn(Integer n1) {
        n = n1;
    }

    public Integer getm() {
        return m;
    }

    public void setm(Integer m1) {
        m = m1;
    }

    public Integer getproduit() {
        return produit;
    }

    public void setproduit() {
        produit = n * m;
    }

    public Integer getl() {
        return l;
    }

    public void setl(Integer l1) {
        l = l1;
    }

    public Integer getf() {
        return f;
    }

    public void setf(Integer f1) {
        f = f1;
    }

    public void setproduit2() {
        produit2 = l + f;
    }

    public Integer getproduit2() {
        return produit2;
    }
}
