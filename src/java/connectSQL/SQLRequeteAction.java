/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectSQL;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Thomas
 */
public class SQLRequeteAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException {
        ConnectSQLBean connectSQL = (ConnectSQLBean) form;
        
            if (connectSQL.getRequete() != null) {
                connectSQL.requete(connectSQL.getRequete());
            }
        return mapping.findForward("Connect");
    }
}