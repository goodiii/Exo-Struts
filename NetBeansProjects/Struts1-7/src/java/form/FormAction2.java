package form;

import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class FormAction2 extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        FormBean bean = (FormBean) form;

        if (isCancelled(request)) {
            bean.setl(null);
            bean.setf(null);
            return mapping.findForward("Page2");
        }

        bean.setproduit();
        bean.setproduit2();

        return (mapping.findForward("suite"));
    }
}
