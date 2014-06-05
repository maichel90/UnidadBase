/**
 * Respuestas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class Respuestas  implements java.io.Serializable {
    private int codigoError;

    private java.lang.String enunciado;

    private java.lang.String idPregunta;

    private java.lang.String idRespuesta;

    private java.lang.String mensage;

    public Respuestas() {
    }

    public Respuestas(
           int codigoError,
           java.lang.String enunciado,
           java.lang.String idPregunta,
           java.lang.String idRespuesta,
           java.lang.String mensage) {
           this.codigoError = codigoError;
           this.enunciado = enunciado;
           this.idPregunta = idPregunta;
           this.idRespuesta = idRespuesta;
           this.mensage = mensage;
    }


    /**
     * Gets the codigoError value for this Respuestas.
     * 
     * @return codigoError
     */
    public int getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this Respuestas.
     * 
     * @param codigoError
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the enunciado value for this Respuestas.
     * 
     * @return enunciado
     */
    public java.lang.String getEnunciado() {
        return enunciado;
    }


    /**
     * Sets the enunciado value for this Respuestas.
     * 
     * @param enunciado
     */
    public void setEnunciado(java.lang.String enunciado) {
        this.enunciado = enunciado;
    }


    /**
     * Gets the idPregunta value for this Respuestas.
     * 
     * @return idPregunta
     */
    public java.lang.String getIdPregunta() {
        return idPregunta;
    }


    /**
     * Sets the idPregunta value for this Respuestas.
     * 
     * @param idPregunta
     */
    public void setIdPregunta(java.lang.String idPregunta) {
        this.idPregunta = idPregunta;
    }


    /**
     * Gets the idRespuesta value for this Respuestas.
     * 
     * @return idRespuesta
     */
    public java.lang.String getIdRespuesta() {
        return idRespuesta;
    }


    /**
     * Sets the idRespuesta value for this Respuestas.
     * 
     * @param idRespuesta
     */
    public void setIdRespuesta(java.lang.String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }


    /**
     * Gets the mensage value for this Respuestas.
     * 
     * @return mensage
     */
    public java.lang.String getMensage() {
        return mensage;
    }


    /**
     * Sets the mensage value for this Respuestas.
     * 
     * @param mensage
     */
    public void setMensage(java.lang.String mensage) {
        this.mensage = mensage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Respuestas)) return false;
        Respuestas other = (Respuestas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoError == other.getCodigoError() &&
            ((this.enunciado==null && other.getEnunciado()==null) || 
             (this.enunciado!=null &&
              this.enunciado.equals(other.getEnunciado()))) &&
            ((this.idPregunta==null && other.getIdPregunta()==null) || 
             (this.idPregunta!=null &&
              this.idPregunta.equals(other.getIdPregunta()))) &&
            ((this.idRespuesta==null && other.getIdRespuesta()==null) || 
             (this.idRespuesta!=null &&
              this.idRespuesta.equals(other.getIdRespuesta()))) &&
            ((this.mensage==null && other.getMensage()==null) || 
             (this.mensage!=null &&
              this.mensage.equals(other.getMensage())));
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
        _hashCode += getCodigoError();
        if (getEnunciado() != null) {
            _hashCode += getEnunciado().hashCode();
        }
        if (getIdPregunta() != null) {
            _hashCode += getIdPregunta().hashCode();
        }
        if (getIdRespuesta() != null) {
            _hashCode += getIdRespuesta().hashCode();
        }
        if (getMensage() != null) {
            _hashCode += getMensage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Respuestas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "respuestas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensage"));
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
