package serial;

import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class SerialAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        SerialBean serial = (SerialBean) form;

   //     SerialBean serial = new SerialBean("Test","test",105);
        serial.serialiser(serial);
        serial.deserialiser("personne.ser");
        return (mapping.findForward("suite"));
    }
}
