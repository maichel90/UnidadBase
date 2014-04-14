/**
 * ConsultaEncuenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class ConsultaEncuenta  implements java.io.Serializable {
    private datos.Preguntas[] listaPreguinstas;

    private datos.Respuestas[] listaRespuesta;

    public ConsultaEncuenta() {
    }

    public ConsultaEncuenta(
           datos.Preguntas[] listaPreguinstas,
           datos.Respuestas[] listaRespuesta) {
           this.listaPreguinstas = listaPreguinstas;
           this.listaRespuesta = listaRespuesta;
    }


    /**
     * Gets the listaPreguinstas value for this ConsultaEncuenta.
     * 
     * @return listaPreguinstas
     */
    public datos.Preguntas[] getListaPreguinstas() {
        return listaPreguinstas;
    }


    /**
     * Sets the listaPreguinstas value for this ConsultaEncuenta.
     * 
     * @param listaPreguinstas
     */
    public void setListaPreguinstas(datos.Preguntas[] listaPreguinstas) {
        this.listaPreguinstas = listaPreguinstas;
    }

    public datos.Preguntas getListaPreguinstas(int i) {
        return this.listaPreguinstas[i];
    }

    public void setListaPreguinstas(int i, datos.Preguntas _value) {
        this.listaPreguinstas[i] = _value;
    }


    /**
     * Gets the listaRespuesta value for this ConsultaEncuenta.
     * 
     * @return listaRespuesta
     */
    public datos.Respuestas[] getListaRespuesta() {
        return listaRespuesta;
    }


    /**
     * Sets the listaRespuesta value for this ConsultaEncuenta.
     * 
     * @param listaRespuesta
     */
    public void setListaRespuesta(datos.Respuestas[] listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }

    public datos.Respuestas getListaRespuesta(int i) {
        return this.listaRespuesta[i];
    }

    public void setListaRespuesta(int i, datos.Respuestas _value) {
        this.listaRespuesta[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaEncuenta)) return false;
        ConsultaEncuenta other = (ConsultaEncuenta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaPreguinstas==null && other.getListaPreguinstas()==null) || 
             (this.listaPreguinstas!=null &&
              java.util.Arrays.equals(this.listaPreguinstas, other.getListaPreguinstas()))) &&
            ((this.listaRespuesta==null && other.getListaRespuesta()==null) || 
             (this.listaRespuesta!=null &&
              java.util.Arrays.equals(this.listaRespuesta, other.getListaRespuesta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListaPreguinstas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaPreguinstas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaPreguinstas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaRespuesta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaRespuesta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaRespuesta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaEncuenta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "consultaEncuenta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaPreguinstas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaPreguinstas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datos/", "preguntas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datos/", "respuestas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
