/*
 * An XML document type.
 * Localname: plusResponse
 * Namespace: http://axis2.service.web.june.com
 * Java type: com.june.web.service.axis2.PlusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.june.web.service.axis2.impl;
/**
 * A document containing one plusResponse(@http://axis2.service.web.june.com) element.
 *
 * This is a complex type.
 */
public class PlusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.PlusResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis2.service.web.june.com", "plusResponse");
    
    
    /**
     * Gets the "plusResponse" element
     */
    public com.june.web.service.axis2.PlusResponseDocument.PlusResponse getPlusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.PlusResponseDocument.PlusResponse target = null;
            target = (com.june.web.service.axis2.PlusResponseDocument.PlusResponse)get_store().find_element_user(PLUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "plusResponse" element
     */
    public void setPlusResponse(com.june.web.service.axis2.PlusResponseDocument.PlusResponse plusResponse)
    {
        generatedSetterHelperImpl(plusResponse, PLUSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "plusResponse" element
     */
    public com.june.web.service.axis2.PlusResponseDocument.PlusResponse addNewPlusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.PlusResponseDocument.PlusResponse target = null;
            target = (com.june.web.service.axis2.PlusResponseDocument.PlusResponse)get_store().add_element_user(PLUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML plusResponse(@http://axis2.service.web.june.com).
     *
     * This is a complex type.
     */
    public static class PlusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.PlusResponseDocument.PlusResponse
    {
        private static final long serialVersionUID = 1L;
        
        public PlusResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
