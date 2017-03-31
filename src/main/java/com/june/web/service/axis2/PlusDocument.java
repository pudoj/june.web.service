/*
 * An XML document type.
 * Localname: plus
 * Namespace: http://axis2.service.web.june.com
 * Java type: com.june.web.service.axis2.PlusDocument
 *
 * Automatically generated - do not modify.
 */
package com.june.web.service.axis2;


/**
 * A document containing one plus(@http://axis2.service.web.june.com) element.
 *
 * This is a complex type.
 */
public interface PlusDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlusDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAD2CEF9C21845A6A3A99D004FC44B15D").resolveHandle("plus4b0adoctype");
    
    /**
     * Gets the "plus" element
     */
    com.june.web.service.axis2.PlusDocument.Plus getPlus();
    
    /**
     * Sets the "plus" element
     */
    void setPlus(com.june.web.service.axis2.PlusDocument.Plus plus);
    
    /**
     * Appends and returns a new empty "plus" element
     */
    com.june.web.service.axis2.PlusDocument.Plus addNewPlus();
    
    /**
     * An XML plus(@http://axis2.service.web.june.com).
     *
     * This is a complex type.
     */
    public interface Plus extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Plus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAD2CEF9C21845A6A3A99D004FC44B15D").resolveHandle("plus3594elemtype");
        
        /**
         * Gets the "x" element
         */
        float getX();
        
        /**
         * Gets (as xml) the "x" element
         */
        org.apache.xmlbeans.XmlFloat xgetX();
        
        /**
         * Sets the "x" element
         */
        void setX(float x);
        
        /**
         * Sets (as xml) the "x" element
         */
        void xsetX(org.apache.xmlbeans.XmlFloat x);
        
        /**
         * Gets the "y" element
         */
        float getY();
        
        /**
         * Gets (as xml) the "y" element
         */
        org.apache.xmlbeans.XmlFloat xgetY();
        
        /**
         * Sets the "y" element
         */
        void setY(float y);
        
        /**
         * Sets (as xml) the "y" element
         */
        void xsetY(org.apache.xmlbeans.XmlFloat y);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.june.web.service.axis2.PlusDocument.Plus newInstance() {
              return (com.june.web.service.axis2.PlusDocument.Plus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.june.web.service.axis2.PlusDocument.Plus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.june.web.service.axis2.PlusDocument.Plus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.june.web.service.axis2.PlusDocument newInstance() {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.june.web.service.axis2.PlusDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.june.web.service.axis2.PlusDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.june.web.service.axis2.PlusDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.june.web.service.axis2.PlusDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.june.web.service.axis2.PlusDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.june.web.service.axis2.PlusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
