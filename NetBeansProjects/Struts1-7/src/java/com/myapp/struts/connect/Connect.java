/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.connect;

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
public class Connect extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException {
        ConnectSQL connectSQL = (ConnectSQL) form;
        if (connectSQL.getCon() == null) {
            connectSQL.connexion();
        } else {
            if (connectSQL.getCon().isClosed() == true) {
                connectSQL.connexion();
            } else {
                connectSQL.close();
            }
        }
        return mapping.findForward("Connect");
    }
}
