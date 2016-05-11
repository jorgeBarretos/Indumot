/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class CalculadoraTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClass(Calculadora.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    Calculadora calculadora;

    @Test
    public void testSuma() {
        Assert.assertEquals(7,calculadora.suma(5, 2));
    }
    @Test
    public void testRestar() {
        Assert.assertEquals(3,calculadora.restar(5, 2));
    }
    @Test
    public void testMultiplicar() {
        Assert.assertEquals(10,calculadora.multiplicar(5, 2));
    }
    @Test
    public void testDividir() {
        Assert.assertEquals(5,calculadora.dividir(10, 2));
    }
    @Test
    public void testResto() {
        Assert.assertEquals(1,calculadora.resto(10, 3));
    }    
}
