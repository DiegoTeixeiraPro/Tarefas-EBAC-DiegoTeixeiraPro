package br.com.diego;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class, TesteClienteTest.class})
public class AllTests {
}