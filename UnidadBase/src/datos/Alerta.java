/**
 * Alerta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class Alerta  implements java.io.Serializable {
    private java.lang.String identificacion;

    private java.lang.String signoVital;

    private java.lang.String valorActual;

    public Alerta() {
    }

    public Alerta(
           java.lang.String identificacion,
           java.lang.String signoVital,
           java.lang.String valorActual) {
           this.identificacion = identificacion;
           this.signoVital = signoVital;
           this.valorActual = valorActual;
    }


    /**
     * Gets the identificacion value for this Alerta.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this Alerta.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the signoVital value for this Alerta.
     * 
     * @return signoVital
     */
    public java.lang.String getSignoVital() {
        return signoVital;
    }


    /**
     * Sets the signoVital value for this Alerta.
     * 
     * @param signoVital
     */
    public void setSignoVital(java.lang.String signoVital) {
        this.signoVital = signoVital;
    }


    /**
     * Gets the valorActual value for this Alerta.
     * 
     * @return valorActual
     */
    public java.lang.String getValorActual() {
        return valorActual;
    }


    /**
     * Sets the valorActual value for this Alerta.
     * 
     * @param valorActual
     */
    public void setValorActual(java.lang.String valorActual) {
        this.valorActual = valorActual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Alerta)) return false;
        Alerta other = (Alerta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.signoVital==null && other.getSignoVital()==null) || 
             (this.signoVital!=null &&
              this.signoVital.equals(other.getSignoVital()))) &&
            ((this.valorActual==null && other.getValorActual()==null) || 
             (this.valorActual!=null &&
              this.valorActual.equals(other.getValorActual())));
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
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getSignoVital() != null) {
            _hashCode += getSignoVital().hashCode();
        }
        if (getValorActual() != null) {
            _hashCode += getValorActual().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Alerta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "alerta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signoVital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signoVital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorActual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorActual"));
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
