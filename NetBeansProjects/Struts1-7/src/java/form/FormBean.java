package form;

import org.apache.struts.action.ActionForm;

public class FormBean extends ActionForm {

    private Integer n;
    private Integer m;
    private Integer produit;
    private Integer l;
    private Integer f;
    private Integer produit2;

    public FormBean() {
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
