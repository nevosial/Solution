package com.datastructs.java;

import java.net.*;
import java.util.*;
import java.util.LinkedList;

public class BookmarkOrg {

    public void URLManager(List<String> urllist) {

        //Sort the list.
        Collections.sort(urllist);
        //Collections.sort(urllist, Collections.reverseOrder());

        //Map<String, List<String>> mymap = new HashMap<String, List<String>>();
        LinkedList<String> secureUrl = new LinkedList<String>();
        LinkedList<String> plainUrl = new LinkedList<String>();


        for (String s: urllist){

            System.out.println(s +" - "+s.length());
            if(s.startsWith("https://")){
                secureUrl.add(s);
            }else{
                plainUrl.add(s);
            }

        }

        System.out.println("Secure Urls: "+secureUrl);
        System.out.println("Plain Urls: "+plainUrl);

        Collections.sort(secureUrl);
        System.out.println("sorted: "+secureUrl);

    }

    public static void main(String[] args) {

        ArrayList<String> myurls = new ArrayList<String>();
        myurls.add("https://mail.google.com/mail/u/0/#inbox");
        myurls.add("http://www.aol.com/index.html");
        myurls.add("https://github.com/");

        BookmarkOrg bomk = new BookmarkOrg();
        bomk.URLManager(myurls);

    }



}

