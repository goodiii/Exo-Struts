/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import com.myapp.struts.connect.ConnectSQL;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.Connection;

/**
 *
 * @author Thomas
 */
public class Connect extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ConnectSQL connectSQL = (ConnectSQL) form;
        if (connectSQL.getCon().isValid(1) == false) {
            connectSQL.close();
            return mapping.findForward("Connect");

        } else {
            connectSQL.connexion();
            return mapping.findForward("Connect");
        }
    }
}
