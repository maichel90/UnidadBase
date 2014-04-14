/**
 * Preguntas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class Preguntas  implements java.io.Serializable {
    private java.lang.String enunciado;

    private java.lang.String idPregunta;

    public Preguntas() {
    }

    public Preguntas(
           java.lang.String enunciado,
           java.lang.String idPregunta) {
           this.enunciado = enunciado;
           this.idPregunta = idPregunta;
    }


    /**
     * Gets the enunciado value for this Preguntas.
     * 
     * @return enunciado
     */
    public java.lang.String getEnunciado() {
        return enunciado;
    }


    /**
     * Sets the enunciado value for this Preguntas.
     * 
     * @param enunciado
     */
    public void setEnunciado(java.lang.String enunciado) {
        this.enunciado = enunciado;
    }


    /**
     * Gets the idPregunta value for this Preguntas.
     * 
     * @return idPregunta
     */
    public java.lang.String getIdPregunta() {
        return idPregunta;
    }


    /**
     * Sets the idPregunta value for this Preguntas.
     * 
     * @param idPregunta
     */
    public void setIdPregunta(java.lang.String idPregunta) {
        this.idPregunta = idPregunta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Preguntas)) return false;
        Preguntas other = (Preguntas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enunciado==null && other.getEnunciado()==null) || 
             (this.enunciado!=null &&
              this.enunciado.equals(other.getEnunciado()))) &&
            ((this.idPregunta==null && other.getIdPregunta()==null) || 
             (this.idPregunta!=null &&
              this.idPregunta.equals(other.getIdPregunta())));
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
        if (getEnunciado() != null) {
            _hashCode += getEnunciado().hashCode();
        }
        if (getIdPregunta() != null) {
            _hashCode += getIdPregunta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Preguntas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "preguntas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enunciado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enunciado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPregunta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPregunta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
