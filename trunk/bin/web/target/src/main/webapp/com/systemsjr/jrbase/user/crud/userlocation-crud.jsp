<!-- Generated by pages/crud/manageable.jsp.vsl in cartridge andromda-bpm4struts -->
<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="user.location.page.title"/>
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

            function setAction(crud) { document.forms['manageUserLocationForm'].elements['crud'].value = crud; }

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
                setFields("","","","","","",form);
            }

            function setFields(status,fromDate,toDate,id,location,user,form)
            {
                setSelect(false,form,"status",status);
                form.elements["fromDateAsString"].value = fromDate;
                form.elements["toDateAsString"].value = toDate;
                form.elements["id"].value = id;
                setSelect(false,form,"location",location);
                setSelect(false,form,"user",user);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="user.location.page.title"/></h1>
        </div>

        <html:form styleId="manageUserLocationForm" action="/UserLocation/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="user.location.status"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:select name="manageableForm" property="status">
                                    <option value=""><bean:message key="select.option.blank"/></option>
                                    <html:option value="ACTIVE">ACTIVE</html:option>
                                    <html:option value="CLOSED">CLOSED</html:option>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="user.location.from.date"/></td>
                            <td>
                                <html:text name="manageableForm" property="fromDateAsString" styleClass="criteriaField" styleId="fromDate"/>
                                <html:img page="/layout/calendar/calendar.gif" styleId="fromDate_trigger" styleClass="calendar"/>
                                <script type="text/javascript">
                                //<!--
                                    Calendar.setup({
                                        inputField     :    "fromDate",
                                        ifFormat       :    "%m/%d/%Y",
                                        daFormat       :    "%m/%d/%Y",
                                        showsTime      :    false,
                                        button         :    "fromDate_trigger",
                                        singleClick    :    true
                                    });
                                //-->
                                </script>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="user.location.to.date"/></td>
                            <td>
                                <html:text name="manageableForm" property="toDateAsString" styleClass="criteriaField" styleId="toDate"/>
                                <html:img page="/layout/calendar/calendar.gif" styleId="toDate_trigger" styleClass="calendar"/>
                                <script type="text/javascript">
                                //<!--
                                    Calendar.setup({
                                        inputField     :    "toDate",
                                        ifFormat       :    "%m/%d/%Y",
                                        daFormat       :    "%m/%d/%Y",
                                        showsTime      :    false,
                                        button         :    "toDate_trigger",
                                        singleClick    :    true
                                    });
                                //-->
                                </script>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                    <nobr><html:link action="/Location/Manage"><bean:message key="user.location.location"/></html:link> <div class="important">*</div></nobr>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.locationBackingList}">
                                        <select name="location" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="location">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.locationBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.location}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                    <nobr><html:link action="/User/Manage"><bean:message key="user.location.user"/></html:link> <div class="important">*</div></nobr>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.userBackingList}">
                                        <select name="user" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="user">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.userBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.user}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
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
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_UserLocation='+this.form.elements['id'].value;">
            <option value="<html:rewrite page="/ClearanceLevel/Manage.do"/>"><bean:message key="clearance.level"/></option>
            <option value="<html:rewrite page="/Counter/Manage.do"/>"><bean:message key="counter"/></option>
            <option value="<html:rewrite page="/Individual/Manage.do"/>"><bean:message key="individual"/></option>
            <option value="<html:rewrite page="/Location/Manage.do"/>"><bean:message key="location"/></option>
            <option value="<html:rewrite page="/LocationType/Manage.do"/>"><bean:message key="location.type"/></option>
            <option value="<html:rewrite page="/LoginSession/Manage.do"/>"><bean:message key="login.session"/></option>
            <option value="<html:rewrite page="/Menu/Manage.do"/>"><bean:message key="menu"/></option>
            <option value="<html:rewrite page="/Organisation/Manage.do"/>"><bean:message key="organisation"/></option>
            <option value="<html:rewrite page="/OrganisationType/Manage.do"/>"><bean:message key="organisation.type"/></option>
            <option value="<html:rewrite page="/Program/Manage.do"/>"><bean:message key="program"/></option>
            <option value="<html:rewrite page="/Role/Manage.do"/>"><bean:message key="role"/></option>
            <option value="<html:rewrite page="/User/Manage.do"/>"><bean:message key="user"/><bean:message key="referencing.entity.marker"/></option>
            <option selected="selected" value="<html:rewrite page="/UserLocation/Manage.do"/>"><bean:message key="user.location"/></option>
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
                            <fmt:formatDate var="fromDateFormatted" value="${row.fromDate}" pattern="MM/dd/yyyy"/>
                            <fmt:formatDate var="toDateFormatted" value="${row.toDate}" pattern="MM/dd/yyyy"/>
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${row.status}</formatting:escape>','<formatting:escape language="javascript">${fromDateFormatted}</formatting:escape>','<formatting:escape language="javascript">${toDateFormatted}</formatting:escape>','<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.location}</formatting:escape>','<formatting:escape language="javascript">${row.user}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="status"
                            titleKey="user.location.status"/>
                        <display:column media="html"
                            headerClass="status" paramId="status" maxLength="47"
                            sortProperty="status" sortable="true"
                            titleKey="user.location.status"><nobr><formatting:escape language="javascript,html">${row.status}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf" titleKey="user.location.from.date">${fromDateFormatted}</display:column>
                        <display:column media="html"
                            headerClass="fromDate" paramId="fromDate" maxLength="47"
                            sortProperty="fromDate" sortable="true"
                            titleKey="user.location.from.date"><nobr>${fromDateFormatted}</nobr></display:column>
                        <display:column media="xml csv excel pdf" titleKey="user.location.to.date">${toDateFormatted}</display:column>
                        <display:column media="html"
                            headerClass="toDate" paramId="toDate" maxLength="47"
                            sortProperty="toDate" sortable="true"
                            titleKey="user.location.to.date"><nobr>${toDateFormatted}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="locationLabel"
                            titleKey="user.location.location"/>
                        <display:column media="html"
                            headerClass="location" paramId="location" maxLength="47"
                            sortProperty="locationLabel" sortable="true"
                            titleKey="user.location.location"><nobr><formatting:escape language="javascript,html">${row.locationLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="userLabel"
                            titleKey="user.location.user"/>
                        <display:column media="html"
                            headerClass="user" paramId="user" maxLength="47"
                            sortProperty="userLabel" sortable="true"
                            titleKey="user.location.user"><nobr><formatting:escape language="javascript,html">${row.userLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/UserLocation/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

