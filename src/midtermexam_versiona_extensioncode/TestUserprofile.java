/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner k  = new Scanner(System.in);
        System.out.println("enter your user ID:");
        String name = k.nextLine();
        System.out.println("enter your genre from Comedy Drama, Action, Mystery:");
        String genre = k.nextLine();
        
        UserProfile n1 = new UserProfile(name,genre);
        System.out.println("userProfile was created");
    }


}
