/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 201811610
 */
public class NotAlphabetException extends Exception {
    @Override
    public String getMessage(){
        return "Input contains non alphabetic characters";
    }
}
