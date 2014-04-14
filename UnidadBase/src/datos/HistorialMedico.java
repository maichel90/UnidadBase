/**
 * HistorialMedico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class HistorialMedico  implements java.io.Serializable {
    private java.lang.String idPaciente;

    private java.lang.String idPregunta;

    private java.lang.String idRespuesta;

    public HistorialMedico() {
    }

    public HistorialMedico(
           java.lang.String idPaciente,
           java.lang.String idPregunta,
           java.lang.String idRespuesta) {
           this.idPaciente = idPaciente;
           this.idPregunta = idPregunta;
           this.idRespuesta = idRespuesta;
    }


    /**
     * Gets the idPaciente value for this HistorialMedico.
     * 
     * @return idPaciente
     */
    public java.lang.String getIdPaciente() {
        return idPaciente;
    }


    /**
     * Sets the idPaciente value for this HistorialMedico.
     * 
     * @param idPaciente
     */
    public void setIdPaciente(java.lang.String idPaciente) {
        this.idPaciente = idPaciente;
    }


    /**
     * Gets the idPregunta value for this HistorialMedico.
     * 
     * @return idPregunta
     */
    public java.lang.String getIdPregunta() {
        return idPregunta;
    }


    /**
     * Sets the idPregunta value for this HistorialMedico.
     * 
     * @param idPregunta
     */
    public void setIdPregunta(java.lang.String idPregunta) {
        this.idPregunta = idPregunta;
    }


    /**
     * Gets the idRespuesta value for this HistorialMedico.
     * 
     * @return idRespuesta
     */
    public java.lang.String getIdRespuesta() {
        return idRespuesta;
    }


    /**
     * Sets the idRespuesta value for this HistorialMedico.
     * 
     * @param idRespuesta
     */
    public void setIdRespuesta(java.lang.String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistorialMedico)) return false;
        HistorialMedico other = (HistorialMedico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPaciente==null && other.getIdPaciente()==null) || 
             (this.idPaciente!=null &&
              this.idPaciente.equals(other.getIdPaciente()))) &&
            ((this.idPregunta==null && other.getIdPregunta()==null) || 
             (this.idPregunta!=null &&
              this.idPregunta.equals(other.getIdPregunta()))) &&
            ((this.idRespuesta==null && other.getIdRespuesta()==null) || 
             (this.idRespuesta!=null &&
              this.idRespuesta.equals(other.getIdRespuesta())));
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
        if (getIdPaciente() != null) {
            _hashCode += getIdPaciente().hashCode();
        }
        if (getIdPregunta() != null) {
            _hashCode += getIdPregunta().hashCode();
        }
        if (getIdRespuesta() != null) {
            _hashCode += getIdRespuesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistorialMedico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "historialMedico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPaciente"));
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
