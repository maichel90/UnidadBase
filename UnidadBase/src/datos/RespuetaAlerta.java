/**
 * RespuetaAlerta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class RespuetaAlerta  implements java.io.Serializable {
    private int codigoError;

    private java.lang.String dosis;

    private java.lang.String idMedicamento;

    private java.lang.String medicamento;

    private java.lang.String recomendacion;

    private java.lang.String resultado;

    public RespuetaAlerta() {
    }

    public RespuetaAlerta(
           int codigoError,
           java.lang.String dosis,
           java.lang.String idMedicamento,
           java.lang.String medicamento,
           java.lang.String recomendacion,
           java.lang.String resultado) {
           this.codigoError = codigoError;
           this.dosis = dosis;
           this.idMedicamento = idMedicamento;
           this.medicamento = medicamento;
           this.recomendacion = recomendacion;
           this.resultado = resultado;
    }


    /**
     * Gets the codigoError value for this RespuetaAlerta.
     * 
     * @return codigoError
     */
    public int getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this RespuetaAlerta.
     * 
     * @param codigoError
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the dosis value for this RespuetaAlerta.
     * 
     * @return dosis
     */
    public java.lang.String getDosis() {
        return dosis;
    }


    /**
     * Sets the dosis value for this RespuetaAlerta.
     * 
     * @param dosis
     */
    public void setDosis(java.lang.String dosis) {
        this.dosis = dosis;
    }


    /**
     * Gets the idMedicamento value for this RespuetaAlerta.
     * 
     * @return idMedicamento
     */
    public java.lang.String getIdMedicamento() {
        return idMedicamento;
    }


    /**
     * Sets the idMedicamento value for this RespuetaAlerta.
     * 
     * @param idMedicamento
     */
    public void setIdMedicamento(java.lang.String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }


    /**
     * Gets the medicamento value for this RespuetaAlerta.
     * 
     * @return medicamento
     */
    public java.lang.String getMedicamento() {
        return medicamento;
    }


    /**
     * Sets the medicamento value for this RespuetaAlerta.
     * 
     * @param medicamento
     */
    public void setMedicamento(java.lang.String medicamento) {
        this.medicamento = medicamento;
    }


    /**
     * Gets the recomendacion value for this RespuetaAlerta.
     * 
     * @return recomendacion
     */
    public java.lang.String getRecomendacion() {
        return recomendacion;
    }


    /**
     * Sets the recomendacion value for this RespuetaAlerta.
     * 
     * @param recomendacion
     */
    public void setRecomendacion(java.lang.String recomendacion) {
        this.recomendacion = recomendacion;
    }


    /**
     * Gets the resultado value for this RespuetaAlerta.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this RespuetaAlerta.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuetaAlerta)) return false;
        RespuetaAlerta other = (RespuetaAlerta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoError == other.getCodigoError() &&
            ((this.dosis==null && other.getDosis()==null) || 
             (this.dosis!=null &&
              this.dosis.equals(other.getDosis()))) &&
            ((this.idMedicamento==null && other.getIdMedicamento()==null) || 
             (this.idMedicamento!=null &&
              this.idMedicamento.equals(other.getIdMedicamento()))) &&
            ((this.medicamento==null && other.getMedicamento()==null) || 
             (this.medicamento!=null &&
              this.medicamento.equals(other.getMedicamento()))) &&
            ((this.recomendacion==null && other.getRecomendacion()==null) || 
             (this.recomendacion!=null &&
              this.recomendacion.equals(other.getRecomendacion()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado())));
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
        if (getDosis() != null) {
            _hashCode += getDosis().hashCode();
        }
        if (getIdMedicamento() != null) {
            _hashCode += getIdMedicamento().hashCode();
        }
        if (getMedicamento() != null) {
            _hashCode += getMedicamento().hashCode();
        }
        if (getRecomendacion() != null) {
            _hashCode += getRecomendacion().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuetaAlerta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "respuetaAlerta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dosis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dosis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMedicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMedicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recomendacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recomendacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
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
