/*
 * An XML document type.
 * Localname: divideResponse
 * Namespace: http://axis2.service.web.june.com
 * Java type: com.june.web.service.axis2.DivideResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.june.web.service.axis2.impl;
/**
 * A document containing one divideResponse(@http://axis2.service.web.june.com) element.
 *
 * This is a complex type.
 */
public class DivideResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.DivideResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DivideResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIVIDERESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis2.service.web.june.com", "divideResponse");
    
    
    /**
     * Gets the "divideResponse" element
     */
    public com.june.web.service.axis2.DivideResponseDocument.DivideResponse getDivideResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.DivideResponseDocument.DivideResponse target = null;
            target = (com.june.web.service.axis2.DivideResponseDocument.DivideResponse)get_store().find_element_user(DIVIDERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "divideResponse" element
     */
    public void setDivideResponse(com.june.web.service.axis2.DivideResponseDocument.DivideResponse divideResponse)
    {
        generatedSetterHelperImpl(divideResponse, DIVIDERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "divideResponse" element
     */
    public com.june.web.service.axis2.DivideResponseDocument.DivideResponse addNewDivideResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.DivideResponseDocument.DivideResponse target = null;
            target = (com.june.web.service.axis2.DivideResponseDocument.DivideResponse)get_store().add_element_user(DIVIDERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML divideResponse(@http://axis2.service.web.june.com).
     *
     * This is a complex type.
     */
    public static class DivideResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.DivideResponseDocument.DivideResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DivideResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://axis2.service.web.june.com", "return");
        
        
        /**
         * Gets the "return" element
         */
        public float getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlFloat xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(float xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setFloatValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlFloat xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
    }
}
