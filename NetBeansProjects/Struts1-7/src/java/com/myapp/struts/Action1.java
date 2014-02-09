package com.myapp.struts;

import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class Action1 extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        Bean bean = (Bean) form;

        if (isCancelled(request)) {
            bean.setn(null);
            bean.setm(null);
            return mapping.findForward("index");
        }

        bean.setproduit();
        return (mapping.findForward("suite"));
    }
}
