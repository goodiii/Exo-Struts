package form;

import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class FormAction1 extends Action {

    ActionMapping mapping;

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        FormBean bean = (FormBean) form;
        
        if (bean.getm() != null) {
            bean.setproduit();
        }

        if (bean.getl() != null) {
            bean.setproduit2();
        }
        
        if (isCancelled(request)) {
            bean.reset(mapping, request);
        }
        return (mapping.findForward("suite"));
    }
}