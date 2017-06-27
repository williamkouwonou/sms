/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.server.entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author kouwonou
 */
@Entity
public class TemplateMessage implements Serializable {
    private Long id;
    private String content;
    private String identifiantSource;
}
