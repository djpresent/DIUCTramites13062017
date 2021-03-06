package ucuenca.tramitesdiuc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class tramite implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "TRAMITE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "TRAMITE_ID_SEQ", name = "TRAMITE_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String solicitante;

   private java.lang.String convocatoria;

   private java.lang.Integer nro_tramite;

   private java.util.Date fecha_solicitud;

   private java.lang.String titulo_proyecto;

   private java.lang.String telefono_contacto;

   private java.lang.String codigo_proyecto;

   private java.lang.String observaciones_validacion;

   private java.lang.String observaciones_aprobacion;

   private java.util.Date fecha_validacion;

   private java.lang.String respuesta;

   private java.util.Date fecha_aprobacion;

   private java.util.Date fecha_actualizacion;

   private java.lang.String observaciones_actualizacion;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private ucuenca.tramitesdiuc.miembro miembro;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private java.util.List<ucuenca.tramitesdiuc.miembros> miembros;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private ucuenca.tramitesdiuc.prorroga prorroga;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private ucuenca.tramitesdiuc.presupuesto presupuesto;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private ucuenca.tramitesdiuc.informe_avance informe_avance;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private ucuenca.tramitesdiuc.informe_final informe_final;

   private java.lang.String estado_tramite;

   private java.lang.String tipo_tramite;

   public tramite()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getSolicitante()
   {
      return this.solicitante;
   }

   public void setSolicitante(java.lang.String solicitante)
   {
      this.solicitante = solicitante;
   }

   public java.lang.String getConvocatoria()
   {
      return this.convocatoria;
   }

   public void setConvocatoria(java.lang.String convocatoria)
   {
      this.convocatoria = convocatoria;
   }

   public java.lang.Integer getNro_tramite()
   {
      return this.nro_tramite;
   }

   public void setNro_tramite(java.lang.Integer nro_tramite)
   {
      this.nro_tramite = nro_tramite;
   }

   public java.util.Date getFecha_solicitud()
   {
      return this.fecha_solicitud;
   }

   public void setFecha_solicitud(java.util.Date fecha_solicitud)
   {
      this.fecha_solicitud = fecha_solicitud;
   }

   public java.lang.String getTitulo_proyecto()
   {
      return this.titulo_proyecto;
   }

   public void setTitulo_proyecto(java.lang.String titulo_proyecto)
   {
      this.titulo_proyecto = titulo_proyecto;
   }

   public java.lang.String getTelefono_contacto()
   {
      return this.telefono_contacto;
   }

   public void setTelefono_contacto(java.lang.String telefono_contacto)
   {
      this.telefono_contacto = telefono_contacto;
   }

   public java.lang.String getCodigo_proyecto()
   {
      return this.codigo_proyecto;
   }

   public void setCodigo_proyecto(java.lang.String codigo_proyecto)
   {
      this.codigo_proyecto = codigo_proyecto;
   }

   public java.lang.String getObservaciones_validacion()
   {
      return this.observaciones_validacion;
   }

   public void setObservaciones_validacion(
         java.lang.String observaciones_validacion)
   {
      this.observaciones_validacion = observaciones_validacion;
   }

   public java.lang.String getObservaciones_aprobacion()
   {
      return this.observaciones_aprobacion;
   }

   public void setObservaciones_aprobacion(
         java.lang.String observaciones_aprobacion)
   {
      this.observaciones_aprobacion = observaciones_aprobacion;
   }

   public java.util.Date getFecha_validacion()
   {
      return this.fecha_validacion;
   }

   public void setFecha_validacion(java.util.Date fecha_validacion)
   {
      this.fecha_validacion = fecha_validacion;
   }

   public java.lang.String getRespuesta()
   {
      return this.respuesta;
   }

   public void setRespuesta(java.lang.String respuesta)
   {
      this.respuesta = respuesta;
   }

   public java.util.Date getFecha_aprobacion()
   {
      return this.fecha_aprobacion;
   }

   public void setFecha_aprobacion(java.util.Date fecha_aprobacion)
   {
      this.fecha_aprobacion = fecha_aprobacion;
   }

   public java.util.Date getFecha_actualizacion()
   {
      return this.fecha_actualizacion;
   }

   public void setFecha_actualizacion(java.util.Date fecha_actualizacion)
   {
      this.fecha_actualizacion = fecha_actualizacion;
   }

   public java.lang.String getObservaciones_actualizacion()
   {
      return this.observaciones_actualizacion;
   }

   public void setObservaciones_actualizacion(
         java.lang.String observaciones_actualizacion)
   {
      this.observaciones_actualizacion = observaciones_actualizacion;
   }

   public ucuenca.tramitesdiuc.miembro getMiembro()
   {
      return this.miembro;
   }

   public void setMiembro(ucuenca.tramitesdiuc.miembro miembro)
   {
      this.miembro = miembro;
   }

   public java.util.List<ucuenca.tramitesdiuc.miembros> getMiembros()
   {
      return this.miembros;
   }

   public void setMiembros(java.util.List<ucuenca.tramitesdiuc.miembros> miembros)
   {
      this.miembros = miembros;
   }

   public ucuenca.tramitesdiuc.prorroga getProrroga()
   {
      return this.prorroga;
   }

   public void setProrroga(ucuenca.tramitesdiuc.prorroga prorroga)
   {
      this.prorroga = prorroga;
   }

   public ucuenca.tramitesdiuc.presupuesto getPresupuesto()
   {
      return this.presupuesto;
   }

   public void setPresupuesto(ucuenca.tramitesdiuc.presupuesto presupuesto)
   {
      this.presupuesto = presupuesto;
   }

   public ucuenca.tramitesdiuc.informe_avance getInforme_avance()
   {
      return this.informe_avance;
   }

   public void setInforme_avance(ucuenca.tramitesdiuc.informe_avance informe_avance)
   {
      this.informe_avance = informe_avance;
   }

   public ucuenca.tramitesdiuc.informe_final getInforme_final()
   {
      return this.informe_final;
   }

   public void setInforme_final(ucuenca.tramitesdiuc.informe_final informe_final)
   {
      this.informe_final = informe_final;
   }

   public java.lang.String getEstado_tramite()
   {
      return this.estado_tramite;
   }

   public void setEstado_tramite(java.lang.String estado_tramite)
   {
      this.estado_tramite = estado_tramite;
   }

   public java.lang.String getTipo_tramite()
   {
      return this.tipo_tramite;
   }

   public void setTipo_tramite(java.lang.String tipo_tramite)
   {
      this.tipo_tramite = tipo_tramite;
   }

   public tramite(java.lang.Long id, java.lang.String solicitante,
         java.lang.String convocatoria, java.lang.Integer nro_tramite,
         java.util.Date fecha_solicitud, java.lang.String titulo_proyecto,
         java.lang.String telefono_contacto, java.lang.String codigo_proyecto,
         java.lang.String observaciones_validacion,
         java.lang.String observaciones_aprobacion,
         java.util.Date fecha_validacion, java.lang.String respuesta,
         java.util.Date fecha_aprobacion, java.util.Date fecha_actualizacion,
         java.lang.String observaciones_actualizacion,
         ucuenca.tramitesdiuc.miembro miembro,
         java.util.List<ucuenca.tramitesdiuc.miembros> miembros,
         ucuenca.tramitesdiuc.prorroga prorroga,
         ucuenca.tramitesdiuc.presupuesto presupuesto,
         ucuenca.tramitesdiuc.informe_avance informe_avance,
         ucuenca.tramitesdiuc.informe_final informe_final,
         java.lang.String estado_tramite, java.lang.String tipo_tramite)
   {
      this.id = id;
      this.solicitante = solicitante;
      this.convocatoria = convocatoria;
      this.nro_tramite = nro_tramite;
      this.fecha_solicitud = fecha_solicitud;
      this.titulo_proyecto = titulo_proyecto;
      this.telefono_contacto = telefono_contacto;
      this.codigo_proyecto = codigo_proyecto;
      this.observaciones_validacion = observaciones_validacion;
      this.observaciones_aprobacion = observaciones_aprobacion;
      this.fecha_validacion = fecha_validacion;
      this.respuesta = respuesta;
      this.fecha_aprobacion = fecha_aprobacion;
      this.fecha_actualizacion = fecha_actualizacion;
      this.observaciones_actualizacion = observaciones_actualizacion;
      this.miembro = miembro;
      this.miembros = miembros;
      this.prorroga = prorroga;
      this.presupuesto = presupuesto;
      this.informe_avance = informe_avance;
      this.informe_final = informe_final;
      this.estado_tramite = estado_tramite;
      this.tipo_tramite = tipo_tramite;
   }

}