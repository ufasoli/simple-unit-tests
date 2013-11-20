package com.ufasoli;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 20.11.13
 * Time: 15:13
 */
public class PMD {

    public void duplicateCode(){

          for(int i = 0; i <10; i++){

              System.out.println(i);
          }


        for(int i = 0; i <10; i++){

            System.out.println(i);
        }

        for(int i = 0; i <10; i++){

            System.out.println(i);
        }




    }
}
