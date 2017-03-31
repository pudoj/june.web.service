/*
 * An XML document type.
 * Localname: multiply
 * Namespace: http://axis2.service.web.june.com
 * Java type: com.june.web.service.axis2.MultiplyDocument
 *
 * Automatically generated - do not modify.
 */
package com.june.web.service.axis2.impl;
/**
 * A document containing one multiply(@http://axis2.service.web.june.com) element.
 *
 * This is a complex type.
 */
public class MultiplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.MultiplyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLY$0 = 
        new javax.xml.namespace.QName("http://axis2.service.web.june.com", "multiply");
    
    
    /**
     * Gets the "multiply" element
     */
    public com.june.web.service.axis2.MultiplyDocument.Multiply getMultiply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.MultiplyDocument.Multiply target = null;
            target = (com.june.web.service.axis2.MultiplyDocument.Multiply)get_store().find_element_user(MULTIPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiply" element
     */
    public void setMultiply(com.june.web.service.axis2.MultiplyDocument.Multiply multiply)
    {
        generatedSetterHelperImpl(multiply, MULTIPLY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiply" element
     */
    public com.june.web.service.axis2.MultiplyDocument.Multiply addNewMultiply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.june.web.service.axis2.MultiplyDocument.Multiply target = null;
            target = (com.june.web.service.axis2.MultiplyDocument.Multiply)get_store().add_element_user(MULTIPLY$0);
            return target;
        }
    }
    /**
     * An XML multiply(@http://axis2.service.web.june.com).
     *
     * This is a complex type.
     */
    public static class MultiplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.june.web.service.axis2.MultiplyDocument.Multiply
    {
        private static final long serialVersionUID = 1L;
        
        public MultiplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName X$0 = 
            new javax.xml.namespace.QName("http://axis2.service.web.june.com", "x");
        private static final javax.xml.namespace.QName Y$2 = 
            new javax.xml.namespace.QName("http://axis2.service.web.june.com", "y");
        
        
        /**
         * Gets the "x" element
         */
        public float getX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "x" element
         */
        public org.apache.xmlbeans.XmlFloat xgetX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(X$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "x" element
         */
        public void setX(float x)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X$0);
                }
                target.setFloatValue(x);
            }
        }
        
        /**
         * Sets (as xml) the "x" element
         */
        public void xsetX(org.apache.xmlbeans.XmlFloat x)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(X$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(X$0);
                }
                target.set(x);
            }
        }
        
        /**
         * Gets the "y" element
         */
        public float getY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "y" element
         */
        public org.apache.xmlbeans.XmlFloat xgetY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(Y$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "y" element
         */
        public void setY(float y)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$2);
                }
                target.setFloatValue(y);
            }
        }
        
        /**
         * Sets (as xml) the "y" element
         */
        public void xsetY(org.apache.xmlbeans.XmlFloat y)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(Y$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(Y$2);
                }
                target.set(y);
            }
        }
    }
}
