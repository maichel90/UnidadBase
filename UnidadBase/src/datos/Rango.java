/**
 * Rango.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class Rango  implements java.io.Serializable {
    private int codigoError;

    private java.lang.String enfermedad;

    private java.lang.String rangoMax;

    private java.lang.String rangoMin;

    private java.lang.String signoVital;

    public Rango() {
    }

    public Rango(
           int codigoError,
           java.lang.String enfermedad,
           java.lang.String rangoMax,
           java.lang.String rangoMin,
           java.lang.String signoVital) {
           this.codigoError = codigoError;
           this.enfermedad = enfermedad;
           this.rangoMax = rangoMax;
           this.rangoMin = rangoMin;
           this.signoVital = signoVital;
    }


    /**
     * Gets the codigoError value for this Rango.
     * 
     * @return codigoError
     */
    public int getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this Rango.
     * 
     * @param codigoError
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the enfermedad value for this Rango.
     * 
     * @return enfermedad
     */
    public java.lang.String getEnfermedad() {
        return enfermedad;
    }


    /**
     * Sets the enfermedad value for this Rango.
     * 
     * @param enfermedad
     */
    public void setEnfermedad(java.lang.String enfermedad) {
        this.enfermedad = enfermedad;
    }


    /**
     * Gets the rangoMax value for this Rango.
     * 
     * @return rangoMax
     */
    public java.lang.String getRangoMax() {
        return rangoMax;
    }


    /**
     * Sets the rangoMax value for this Rango.
     * 
     * @param rangoMax
     */
    public void setRangoMax(java.lang.String rangoMax) {
        this.rangoMax = rangoMax;
    }


    /**
     * Gets the rangoMin value for this Rango.
     * 
     * @return rangoMin
     */
    public java.lang.String getRangoMin() {
        return rangoMin;
    }


    /**
     * Sets the rangoMin value for this Rango.
     * 
     * @param rangoMin
     */
    public void setRangoMin(java.lang.String rangoMin) {
        this.rangoMin = rangoMin;
    }


    /**
     * Gets the signoVital value for this Rango.
     * 
     * @return signoVital
     */
    public java.lang.String getSignoVital() {
        return signoVital;
    }


    /**
     * Sets the signoVital value for this Rango.
     * 
     * @param signoVital
     */
    public void setSignoVital(java.lang.String signoVital) {
        this.signoVital = signoVital;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rango)) return false;
        Rango other = (Rango) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoError == other.getCodigoError() &&
            ((this.enfermedad==null && other.getEnfermedad()==null) || 
             (this.enfermedad!=null &&
              this.enfermedad.equals(other.getEnfermedad()))) &&
            ((this.rangoMax==null && other.getRangoMax()==null) || 
             (this.rangoMax!=null &&
              this.rangoMax.equals(other.getRangoMax()))) &&
            ((this.rangoMin==null && other.getRangoMin()==null) || 
             (this.rangoMin!=null &&
              this.rangoMin.equals(other.getRangoMin()))) &&
            ((this.signoVital==null && other.getSignoVital()==null) || 
             (this.signoVital!=null &&
              this.signoVital.equals(other.getSignoVital())));
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
        if (getEnfermedad() != null) {
            _hashCode += getEnfermedad().hashCode();
        }
        if (getRangoMax() != null) {
            _hashCode += getRangoMax().hashCode();
        }
        if (getRangoMin() != null) {
            _hashCode += getRangoMin().hashCode();
        }
        if (getSignoVital() != null) {
            _hashCode += getSignoVital().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rango.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "rango"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enfermedad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enfermedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoMin"));
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
