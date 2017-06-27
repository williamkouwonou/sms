/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.server.entity;

import com.sms.server.enumeration.Statut;
import java.util.Date;

/**
 *
 * @author kouwonou
 */
public class Message {
    private String content;
    private Compte compte;
    private TemplateMessage templateMessage;
    private Date dateEnvoie;
    private Statut statut;
    
}
