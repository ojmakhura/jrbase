<!-- Generated by pages/crud/manageable-help.jsp.vsl in cartridge andromda-bpm4struts -->
<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="organisation.type"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="organisation.type"/></h1>
        <p>
            <bean:message key="organisation.type.online.help"/>
        </p>
        <h2><bean:message key="organisation.type.level.code"/></h2>
        <p>
            <bean:message key="organisation.type.level.code.online.help"/>
        </p>
        <h2><bean:message key="organisation.type.name"/></h2>
        <p>
            <bean:message key="organisation.type.name.online.help"/>
        </p>
        <h2><bean:message key="organisation.type.description"/></h2>
        <p>
            <bean:message key="organisation.type.description.online.help"/>
        </p>
        <h2><bean:message key="organisation.type.organisations"/></h2>
        <p>
            <bean:message key="organisation.type.organisations.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

