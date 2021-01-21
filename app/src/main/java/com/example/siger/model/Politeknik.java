
package com.example.siger.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Politeknik {

    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("deskripsi")
    @Expose
    private String deskripsi;
    @SerializedName("informasi_umum")
    @Expose
    private String informasiUmum;
    @SerializedName("akreditasi")
    @Expose
    private String akreditasi;
    @SerializedName("biaya")
    @Expose
    private String biaya;
    @SerializedName("jumlahdosen")
    @Expose
    private String jumlahdosen;
    @SerializedName("jumlahsiswa")
    @Expose
    private String jumlahsiswa;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("telpon")
    @Expose
    private String telpon;
    @SerializedName("fakultas")
    @Expose
    private String fakultas;
    @SerializedName("alamat")
    @Expose
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getInformasiUmum() {
        return informasiUmum;
    }

    public void setInformasiUmum(String informasiUmum) {
        this.informasiUmum = informasiUmum;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public String getJumlahdosen() {
        return jumlahdosen;
    }

    public void setJumlahdosen(String jumlahdosen) {
        this.jumlahdosen = jumlahdosen;
    }

    public String getJumlahsiswa() {
        return jumlahsiswa;
    }

    public void setJumlahsiswa(String jumlahsiswa) {
        this.jumlahsiswa = jumlahsiswa;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
