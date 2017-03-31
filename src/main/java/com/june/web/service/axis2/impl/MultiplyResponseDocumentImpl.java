/*
 * An XML document type.
 * Localname: multiplyResponse
 * Namespace: http://axis2.service.web.june.com
 * Java type: com.june.web.service.axis2.MultiplyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.june.web.service.axis2.impl;
/**
 * A document containing one multiplyResponse(@http://axis2.service.web.june.com) element.
 *
 * This is a complex type.
 */
public class MultiplyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.MultiplyResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiplyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis2.service.web.june.com", "multiplyResponse");
    
    
    /**
     * Gets the "multiplyResponse" element
     */
    public com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse getMultiplyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse target = null;
            target = (com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse)get_store().find_element_user(MULTIPLYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiplyResponse" element
     */
    public void setMultiplyResponse(com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse multiplyResponse)
    {
        generatedSetterHelperImpl(multiplyResponse, MULTIPLYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiplyResponse" element
     */
    public com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse addNewMultiplyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse target = null;
            target = (com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse)get_store().add_element_user(MULTIPLYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML multiplyResponse(@http://axis2.service.web.june.com).
     *
     * This is a complex type.
     */
    public static class MultiplyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.MultiplyResponseDocument.MultiplyResponse
    {
        private static final long serialVersionUID = 1L;
        
        public MultiplyResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
