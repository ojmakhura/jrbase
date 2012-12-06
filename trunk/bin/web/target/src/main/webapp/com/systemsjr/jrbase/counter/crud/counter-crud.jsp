<!-- Generated by pages/crud/manageable.jsp.vsl in cartridge andromda-bpm4struts -->
<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="counter.page.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/layout/default-manageable.css"/>"></link>
        <link rel="stylesheet" type="text/css" media="all" href="<html:rewrite page="/layout/default-calendar.css"/>"/>
    </tiles:put>

    <tiles:put name="javascript" type="string">
        <script type="text/javascript" src="<html:rewrite action="/calendar"/>"></script>
        <script type="text/javascript">
        //<!--
            function setSelect(multi, form, name, value)
            {
                var select = form.elements[name];
                var options = select.options;

                // for browser compatibility's sake we go through the options ourselves
                for (var i=0; i<options.length; i++)
                {
                    if (multi)
                    {
                        // Array.indexOf is defined in Javascript 1.5, not before
                        options[i].selected = arrayContainsElement(value,options[i].value);
                    }
                    else
                    {
                        if (options[i].value == value)
                        {
                            select.selectedIndex = i;
                            break;
                        }
                    }

                }
            }

            function arrayContainsElement(array, element)
            {
              var containsElement = false;
              for (var i=0; i<array.length && !containsElement; i++) containsElement = (array[i] == element);
              return containsElement;
            }

            function setAction(crud) { document.forms['manageCounterForm'].elements['crud'].value = crud; }

            function enableUpdate(enabled) { document.getElementById("updateButton").disabled = !enabled; }

            var selectionCount = 0;

            function verifyEnableDelete(checkbox)
            {
                if (checkbox.checked) selectionCount++; else selectionCount--;
                document.getElementById("deleteButton").disabled = (selectionCount < 1);
            }

            function clearFields(form)
            {
                form.reset();
                enableUpdate(false);
                setFields("","","","",form);
            }

            function setFields(counterName,format,currentCount,id,form)
            {
                form.elements["counterName"].value = counterName;
                form.elements["format"].value = format;
                form.elements["currentCount"].value = currentCount;
                form.elements["id"].value = id;
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="counter.page.title"/></h1>
        </div>

        <html:form styleId="manageCounterForm" action="/Counter/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="counter.counter.name"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="counterName" styleClass="criteriaField" styleId="counterName"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="counter.format"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="format" styleClass="criteriaField" styleId="format"/>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="counter.current.count"/></td>
                            <td>
                                <html:text name="manageableForm" property="currentCount" styleClass="criteriaField" styleId="currentCount"/>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                    </table>

                    <input type="submit" id="readButton" class="button" value="<bean:message key="button.read"/>" onclick="this.form.elements['id'].value='';setAction('read');"/>
                    <input type="submit" id="createButton" class="button" value="<bean:message key="button.create"/>" onclick="setAction('create');"/>
                    <input type="submit" id="deleteButton" class="button" value="<bean:message key="button.delete"/>" disabled="disabled" onclick="setAction('delete');"/>
                    <input type="submit" id="updateButton" class="button" value="<bean:message key="button.update"/>" disabled="disabled" onclick="setAction('update');return validateUpdate();"/>
                    <input type="button" id="clearButton" class="button" value="<bean:message key="button.clear"/>" onclick="clearFields(this.form);"/>
                </c:if>

<div id="entitySwitcher">
    <nobr>
        <bean:message key="select.other.entity"/>
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_Counter='+this.form.elements['id'].value;">
            <option value="<html:rewrite page="/ClearanceLevel/Manage.do"/>"><bean:message key="clearance.level"/></option>
            <option selected="selected" value="<html:rewrite page="/Counter/Manage.do"/>"><bean:message key="counter"/></option>
            <option value="<html:rewrite page="/Individual/Manage.do"/>"><bean:message key="individual"/></option>
            <option value="<html:rewrite page="/Location/Manage.do"/>"><bean:message key="location"/></option>
            <option value="<html:rewrite page="/LocationType/Manage.do"/>"><bean:message key="location.type"/></option>
            <option value="<html:rewrite page="/LoginSession/Manage.do"/>"><bean:message key="login.session"/></option>
            <option value="<html:rewrite page="/Menu/Manage.do"/>"><bean:message key="menu"/></option>
            <option value="<html:rewrite page="/Organisation/Manage.do"/>"><bean:message key="organisation"/></option>
            <option value="<html:rewrite page="/OrganisationType/Manage.do"/>"><bean:message key="organisation.type"/></option>
            <option value="<html:rewrite page="/Program/Manage.do"/>"><bean:message key="program"/></option>
            <option value="<html:rewrite page="/Role/Manage.do"/>"><bean:message key="role"/></option>
            <option value="<html:rewrite page="/User/Manage.do"/>"><bean:message key="user"/></option>
            <option value="<html:rewrite page="/UserLocation/Manage.do"/>"><bean:message key="user.location"/></option>
        </select>
    </nobr>
</div>

            </div>

            <div id="manageableList" class="table">
                <c:if test="${!empty manageableForm.manageableList}">
                    <display:table name="${manageableForm.manageableList}" id="row" requestURI="${pageContext.request.requestURI}"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${row.counterName}</formatting:escape>','<formatting:escape language="javascript">${row.format}</formatting:escape>','<formatting:escape language="javascript">${row.currentCount}</formatting:escape>','<formatting:escape language="javascript">${row.id}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="counterName"
                            titleKey="counter.counter.name"/>
                        <display:column media="html"
                            headerClass="counterName" paramId="counterName" maxLength="47"
                            sortProperty="counterName" sortable="true"
                            titleKey="counter.counter.name"><nobr><formatting:escape language="javascript,html">${row.counterName}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="format"
                            titleKey="counter.format"/>
                        <display:column media="html"
                            headerClass="format" paramId="format" maxLength="47"
                            sortProperty="format" sortable="true"
                            titleKey="counter.format"><nobr><formatting:escape language="javascript,html">${row.format}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="currentCount"
                            titleKey="counter.current.count"/>
                        <display:column media="html"
                            headerClass="currentCount" paramId="currentCount" maxLength="47"
                            sortProperty="currentCount" sortable="true"
                            titleKey="counter.current.count"><nobr><formatting:escape language="javascript,html">${row.currentCount}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/Counter/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

