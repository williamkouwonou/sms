/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.server.repository;

import com.sms.server.entity.Variable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kouwonou
 */
public interface VariableRepository extends JpaRepository<Variable, Long>{
    
}
