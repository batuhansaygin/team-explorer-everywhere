// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildServiceHost;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildServiceHost
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String uri;
    protected String name;
    protected String baseUrl;
    protected boolean requireClientCertificates;
    protected boolean isVirtual;

    // No elements    
    public _BuildServiceHost()
    {
        super();
    }

    public _BuildServiceHost(
        final String uri,
        final String name,
        final String baseUrl,
        final boolean requireClientCertificates,
        final boolean isVirtual)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUri(uri);
        setName(name);
        setBaseUrl(baseUrl);
        setRequireClientCertificates(requireClientCertificates);
        setIsVirtual(isVirtual);
    }

    public String getUri()
    {
        return this.uri;
    }

    public void setUri(final String value)
    {
        this.uri = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public String getBaseUrl()
    {
        return this.baseUrl;
    }

    public void setBaseUrl(final String value)
    {
        this.baseUrl = value;
    }

    public boolean isRequireClientCertificates()
    {
        return this.requireClientCertificates;
    }

    public void setRequireClientCertificates(final boolean value)
    {
        this.requireClientCertificates = value;
    }

    public boolean isIsVirtual()
    {
        return this.isVirtual;
    }

    public void setIsVirtual(final boolean value)
    {
        this.isVirtual = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Uri",
            this.uri);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "BaseUrl",
            this.baseUrl);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "RequireClientCertificates",
            this.requireClientCertificates);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "IsVirtual",
            this.isVirtual);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("Uri"))
            {
                this.uri = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("BaseUrl"))
            {
                this.baseUrl = attributeValue;
            }
            else if (localName.equalsIgnoreCase("RequireClientCertificates"))
            {
                this.requireClientCertificates = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("IsVirtual"))
            {
                this.isVirtual = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
