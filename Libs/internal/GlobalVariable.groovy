package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URLPath
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object seturl
     
    /**
     * <p></p>
     */
    public static Object setURL
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URLPath' : 'https://opensource-demo.orangehrmlive.com/', 'username' : 'Admin', 'Password' : 'hUKwJTbofgPU9eVlw/CnDQ=='])
        allVariables.put('Env1', allVariables['default'] + ['seturl' : 'http://demo.automationtesting.in/Register.html'])
        allVariables.put('Env2', allVariables['default'] + [:])
        allVariables.put('Exercise', allVariables['default'] + ['setURL' : 'www.seleniumeasy.com/test/'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        URLPath = selectedVariables['URLPath']
        username = selectedVariables['username']
        Password = selectedVariables['Password']
        seturl = selectedVariables['seturl']
        setURL = selectedVariables['setURL']
        
    }
}
