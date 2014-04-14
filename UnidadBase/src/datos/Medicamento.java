/**
 * Medicamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class Medicamento  implements java.io.Serializable {
    private int codigoError;

    private java.lang.String dosis;

    private java.lang.String fechaFin;

    private java.lang.String fechainicio;

    private java.lang.String frecuencia;

    private java.lang.String nombreMedicamento;

    private java.lang.String viaAdministracion;

    public Medicamento() {
    }

    public Medicamento(
           int codigoError,
           java.lang.String dosis,
           java.lang.String fechaFin,
           java.lang.String fechainicio,
           java.lang.String frecuencia,
           java.lang.String nombreMedicamento,
           java.lang.String viaAdministracion) {
           this.codigoError = codigoError;
           this.dosis = dosis;
           this.fechaFin = fechaFin;
           this.fechainicio = fechainicio;
           this.frecuencia = frecuencia;
           this.nombreMedicamento = nombreMedicamento;
           this.viaAdministracion = viaAdministracion;
    }


    /**
     * Gets the codigoError value for this Medicamento.
     * 
     * @return codigoError
     */
    public int getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this Medicamento.
     * 
     * @param codigoError
     */
    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the dosis value for this Medicamento.
     * 
     * @return dosis
     */
    public java.lang.String getDosis() {
        return dosis;
    }


    /**
     * Sets the dosis value for this Medicamento.
     * 
     * @param dosis
     */
    public void setDosis(java.lang.String dosis) {
        this.dosis = dosis;
    }


    /**
     * Gets the fechaFin value for this Medicamento.
     * 
     * @return fechaFin
     */
    public java.lang.String getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this Medicamento.
     * 
     * @param fechaFin
     */
    public void setFechaFin(java.lang.String fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the fechainicio value for this Medicamento.
     * 
     * @return fechainicio
     */
    public java.lang.String getFechainicio() {
        return fechainicio;
    }


    /**
     * Sets the fechainicio value for this Medicamento.
     * 
     * @param fechainicio
     */
    public void setFechainicio(java.lang.String fechainicio) {
        this.fechainicio = fechainicio;
    }


    /**
     * Gets the frecuencia value for this Medicamento.
     * 
     * @return frecuencia
     */
    public java.lang.String getFrecuencia() {
        return frecuencia;
    }


    /**
     * Sets the frecuencia value for this Medicamento.
     * 
     * @param frecuencia
     */
    public void setFrecuencia(java.lang.String frecuencia) {
        this.frecuencia = frecuencia;
    }


    /**
     * Gets the nombreMedicamento value for this Medicamento.
     * 
     * @return nombreMedicamento
     */
    public java.lang.String getNombreMedicamento() {
        return nombreMedicamento;
    }


    /**
     * Sets the nombreMedicamento value for this Medicamento.
     * 
     * @param nombreMedicamento
     */
    public void setNombreMedicamento(java.lang.String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }


    /**
     * Gets the viaAdministracion value for this Medicamento.
     * 
     * @return viaAdministracion
     */
    public java.lang.String getViaAdministracion() {
        return viaAdministracion;
    }


    /**
     * Sets the viaAdministracion value for this Medicamento.
     * 
     * @param viaAdministracion
     */
    public void setViaAdministracion(java.lang.String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Medicamento)) return false;
        Medicamento other = (Medicamento) obj;
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
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            ((this.fechainicio==null && other.getFechainicio()==null) || 
             (this.fechainicio!=null &&
              this.fechainicio.equals(other.getFechainicio()))) &&
            ((this.frecuencia==null && other.getFrecuencia()==null) || 
             (this.frecuencia!=null &&
              this.frecuencia.equals(other.getFrecuencia()))) &&
            ((this.nombreMedicamento==null && other.getNombreMedicamento()==null) || 
             (this.nombreMedicamento!=null &&
              this.nombreMedicamento.equals(other.getNombreMedicamento()))) &&
            ((this.viaAdministracion==null && other.getViaAdministracion()==null) || 
             (this.viaAdministracion!=null &&
              this.viaAdministracion.equals(other.getViaAdministracion())));
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
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        if (getFechainicio() != null) {
            _hashCode += getFechainicio().hashCode();
        }
        if (getFrecuencia() != null) {
            _hashCode += getFrecuencia().hashCode();
        }
        if (getNombreMedicamento() != null) {
            _hashCode += getNombreMedicamento().hashCode();
        }
        if (getViaAdministracion() != null) {
            _hashCode += getViaAdministracion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Medicamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datos/", "medicamento"));
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
        elemField.setFieldName("fechaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechainicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechainicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frecuencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frecuencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreMedicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreMedicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viaAdministracion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viaAdministracion"));
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
