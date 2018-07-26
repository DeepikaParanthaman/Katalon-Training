<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>li_To       var datepickerDate</name>
   <tag></tag>
   <elementGuidId>ad5f50a3-91a1-486f-8b76-e212e71ba982</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>li</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>To
   

    var datepickerDateFormat = 'yy-mm-dd';
    var displayDateFormat = datepickerDateFormat.replace('yy', 'yyyy');

    $(document).ready(function(){
        
        var dateFieldValue = $.trim($(&quot;#calToDate&quot;).val());
        if (dateFieldValue == '') {
            $(&quot;#calToDate&quot;).val(displayDateFormat);
        }

        daymarker.bindElement(&quot;#calToDate&quot;,
        {
            showOn: &quot;both&quot;,
            dateFormat: datepickerDateFormat,
            buttonImage: &quot;/webres_5acde3dbd3adc6.90334155/themes/default/images/calendar.png&quot;,
            buttonText:&quot;&quot;,
            buttonImageOnly: true,
            changeMonth: true,
            changeYear: true,
            yearRange: &quot;-100:+100&quot;,
            firstDay: 1,
            onClose: function() {
                $(&quot;#calToDate&quot;).trigger('blur');
            }            
        });
        
        //$(&quot;img.ui-datepicker-trigger&quot;).addClass(&quot;editable&quot;);
        
        $(&quot;#calToDate&quot;).click(function(){
            daymarker.show(&quot;#calToDate&quot;);
            if ($(this).val() == displayDateFormat) {
                $(this).val('');
            }
        });
    
    });


</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frmFilterLeave&quot;)/fieldset[1]/ol[1]/li[2]</value>
   </webElementProperties>
</WebElementEntity>
