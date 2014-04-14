/**
 * Consulta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class Consulta  implements java.io.Serializable {
    private int codigoError;

    private datos.Medicamento medicamento;

    private java.lang.String mesajeError;

    private datos.DatosPaciente paciente;

    private datos.Rango rango;

    public Consulta() {
    }

    public Consulta(
           int codigoError,
           datos.Medicamento medicamento,
           java.lang.String mesajeError,
           datos.DatosPaciente paciente,
           datos.Rango rango) {
           this.codigoError = codigoError;
           this.medicamento = medicamento;
           this.mesajeError = mesajeError;
           this.paciente = paciente;
           this.rango = rango;
    }


    /**
     * Gets the codigoError value for this Consulta.
     * 
     * @return codigoError
     */
    public int getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this Consulta.
     * 
     * @param codigoError
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the medicamento value for this Consulta.
     * 
     * @return medicamento
     */
    public datos.Medicamento getMedicamento() {
        return medicamento;
    }


    /**
     * Sets the medicamento value for this Consulta.
     * 
     * @param medicamento
     */
    public void setMedicamento(datos.Medicamento medicamento) {
        this.medicamento = medicamento;
    }


    /**
     * Gets the mesajeError value for this Consulta.
     * 
     * @return mesajeError
     */
    public java.lang.String getMesajeError() {
        return mesajeError;
    }


    /**
     * Sets the mesajeError value for this Consulta.
     * 
     * @param mesajeError
     */
    public void setMesajeError(java.lang.String mesajeError) {
        this.mesajeError = mesajeError;
    }


    /**
     * Gets the paciente value for this Consulta.
     * 
     * @return paciente
     */
    public datos.DatosPaciente getPaciente() {
        return paciente;
    }


    /**
     * Sets the paciente value for this Consulta.
     * 
     * @param paciente
     */
    public void setPaciente(datos.DatosPaciente paciente) {
        this.paciente = paciente;
    }


    /**
     * Gets the rango value for this Consulta.
     * 
     * @return rango
     */
    public datos.Rango getRango() {
        return rango;
    }


    /**
     * Sets the rango value for this Consulta.
     * 
     * @param rango
     */
    public void setRango(datos.Rango rango) {
        this.rango = rango;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consulta)) return false;
        Consulta other = (Consulta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoError == other.getCodigoError() &&
            ((this.medicamento==null && other.getMedicamento()==null) || 
             (this.medicamento!=null &&
              this.medicamento.equals(other.getMedicamento()))) &&
            ((this.mesajeError==null && other.getMesajeError()==null) || 
             (this.mesajeError!=null &&
              this.mesajeError.equals(other.getMesajeError()))) &&
            ((this.paciente==null && other.getPaciente()==null) || 
             (this.paciente!=null &&
              this.paciente.equals(other.getPaciente()))) &&
            ((this.rango==null && other.getRango()==null) || 
             (this.rango!=null &&
              this.rango.equals(other.getRango())));
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
        if (getMedicamento() != null) {
            _hashCode += getMedicamento().hashCode();
        }
        if (getMesajeError() != null) {
            _hashCode += getMesajeError().hashCode();
        }
        if (getPaciente() != null) {
            _hashCode += getPaciente().hashCode();
        }
        if (getRango() != null) {
            _hashCode += getRango().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consulta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "consulta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datos/", "medicamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesajeError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paciente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datos/", "datosPaciente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rango");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rango"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datos/", "rango"));
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
