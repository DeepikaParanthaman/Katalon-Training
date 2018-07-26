<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_function validatepasswords</name>
   <tag></tag>
   <elementGuidId>cdb2e40c-c28a-4038-a77f-f0d84b3937ee</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col-md-4 col-xs-4 col-sm-4</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                                                           function validatepasswords(input)                 {                     var password1= document.getElementById(&quot;firstpassword&quot;).value;                     var password2=document.getElementById(&quot;secondpassword&quot;).value;                     if (!(password1==password2))                     {                         input.setCustomValidity('Passwords dont match');                     }                     else                     {                         input.setCustomValidity('');                     }                 }                 function validatepattern(input)                 {                     var password1= document.getElementById(&quot;firstpassword&quot;).value;                     var pattern =/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]){4,6}(?!.*\s ).*$/;                     if (!(pattern.test(input.value)))                     {                         input.setCustomValidity('Please Enter an UpperCase,LowerCase Alphabet and a Number');                     }                     else                     {                         input.setCustomValidity('');                     }                 }                 
                        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;basicBootstrapForm&quot;)/div[@class=&quot;form-group&quot;]/div[@class=&quot;col-md-4 col-xs-4 col-sm-4&quot;]</value>
   </webElementProperties>
</WebElementEntity>
