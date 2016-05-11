/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author sb
 */
import javax.inject.Named;

/**
 *
 * @author sb
 */
@Named
public class Calculadora {
 public int suma(int valor1, int valor2){
  //return valor1 + valor2+3; con este codigo nos arroja error
  return valor1 + valor2; 
 }
  
 public int restar(int valor1, int valor2){
  //return valor1 - valor2+3; sentencia que nos arroja la falla
  return valor1 - valor2;
 }
  
 public int multiplicar(int valor1, int valor2){
  //return valor1 * valor2+3; //sentencia que nos arroja la falla
  return valor1 * valor2;
 }
  
 public int dividir(int valor1, int valor2){
  //return valor1 / valor2+3; sentencia que nos arroja la falla
  return valor1 / valor2;
 
 }
 public int resto(int valor1, int valor2){
  //return valor1 % valor2+3; sentencia que nos arroja la falla
  return valor1 % valor2;
 
 }
}