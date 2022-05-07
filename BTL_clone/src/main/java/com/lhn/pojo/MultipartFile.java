/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.pojo;

import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
public class MultipartFile {
    @Transient
    private org.springframework.web.multipart.MultipartFile file;
    
    
    /**
     * @return the file
     */
    public org.springframework.web.multipart.MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(org.springframework.web.multipart.MultipartFile file) {
        this.file = file;
    }
}
