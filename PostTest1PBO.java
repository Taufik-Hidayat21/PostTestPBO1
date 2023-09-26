/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1pbo;

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;
public class PostTest1PBO {
    public static void main(String[] args) {
        ArrayList<MemberGym> memberGyms = new ArrayList<>();

        // Menambahkan 5 objek buku ke dalam ArrayList
        memberGyms.add(new MemberGym("Taufik Hidayat",18, "Mahasiswa", "11/10/2023"));
        memberGyms.add(new MemberGym("Rangga Sanjaya",20, "Biasa", "21/12/2023"));
        memberGyms.add(new MemberGym("Fandi Perdana",16, "Siswa", "28/10/2023"));
        memberGyms.add(new MemberGym("Akmal Hidayat",20, "Mahasiswa", "5/11/2023"));
        memberGyms.add(new MemberGym("Dimas Kanjeng",40, "Biasa", "29/1/2024"));

        // Menampilkan informasi buku-buku
        System.out.println("Daftar Member Gym:");
        for (MemberGym member : memberGyms) {
            System.out.println("Nama : " + member.namamember);
            System.out.println("Umur : " + member.umurmember);
            System.out.println("Status : " + member.statusmember);
            System.out.println("Expired Date : " + member.expiredmember);
            System.out.println();
        }
    }
}

