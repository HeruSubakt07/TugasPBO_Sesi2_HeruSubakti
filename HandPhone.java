/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone;

/**
 *
 * @author Heru Subakti
 */
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHP(){
        return jenis_hp;
        
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args){
        HandPhone hp = new HandPhone ();
        
        hp.setDataHP("SAMSUNG A50", 2019);
        
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}