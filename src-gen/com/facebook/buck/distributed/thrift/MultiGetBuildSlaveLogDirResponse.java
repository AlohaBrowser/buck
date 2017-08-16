/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-16")
public class MultiGetBuildSlaveLogDirResponse implements org.apache.thrift.TBase<MultiGetBuildSlaveLogDirResponse, MultiGetBuildSlaveLogDirResponse._Fields>, java.io.Serializable, Cloneable, Comparable<MultiGetBuildSlaveLogDirResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MultiGetBuildSlaveLogDirResponse");

  private static final org.apache.thrift.protocol.TField LOG_DIRS_FIELD_DESC = new org.apache.thrift.protocol.TField("logDirs", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MultiGetBuildSlaveLogDirResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MultiGetBuildSlaveLogDirResponseTupleSchemeFactory());
  }

  public List<LogDir> logDirs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOG_DIRS((short)1, "logDirs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOG_DIRS
          return LOG_DIRS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.LOG_DIRS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOG_DIRS, new org.apache.thrift.meta_data.FieldMetaData("logDirs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LogDir.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MultiGetBuildSlaveLogDirResponse.class, metaDataMap);
  }

  public MultiGetBuildSlaveLogDirResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiGetBuildSlaveLogDirResponse(MultiGetBuildSlaveLogDirResponse other) {
    if (other.isSetLogDirs()) {
      List<LogDir> __this__logDirs = new ArrayList<LogDir>(other.logDirs.size());
      for (LogDir other_element : other.logDirs) {
        __this__logDirs.add(new LogDir(other_element));
      }
      this.logDirs = __this__logDirs;
    }
  }

  public MultiGetBuildSlaveLogDirResponse deepCopy() {
    return new MultiGetBuildSlaveLogDirResponse(this);
  }

  @Override
  public void clear() {
    this.logDirs = null;
  }

  public int getLogDirsSize() {
    return (this.logDirs == null) ? 0 : this.logDirs.size();
  }

  public java.util.Iterator<LogDir> getLogDirsIterator() {
    return (this.logDirs == null) ? null : this.logDirs.iterator();
  }

  public void addToLogDirs(LogDir elem) {
    if (this.logDirs == null) {
      this.logDirs = new ArrayList<LogDir>();
    }
    this.logDirs.add(elem);
  }

  public List<LogDir> getLogDirs() {
    return this.logDirs;
  }

  public MultiGetBuildSlaveLogDirResponse setLogDirs(List<LogDir> logDirs) {
    this.logDirs = logDirs;
    return this;
  }

  public void unsetLogDirs() {
    this.logDirs = null;
  }

  /** Returns true if field logDirs is set (has been assigned a value) and false otherwise */
  public boolean isSetLogDirs() {
    return this.logDirs != null;
  }

  public void setLogDirsIsSet(boolean value) {
    if (!value) {
      this.logDirs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOG_DIRS:
      if (value == null) {
        unsetLogDirs();
      } else {
        setLogDirs((List<LogDir>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOG_DIRS:
      return getLogDirs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOG_DIRS:
      return isSetLogDirs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiGetBuildSlaveLogDirResponse)
      return this.equals((MultiGetBuildSlaveLogDirResponse)that);
    return false;
  }

  public boolean equals(MultiGetBuildSlaveLogDirResponse that) {
    if (that == null)
      return false;

    boolean this_present_logDirs = true && this.isSetLogDirs();
    boolean that_present_logDirs = true && that.isSetLogDirs();
    if (this_present_logDirs || that_present_logDirs) {
      if (!(this_present_logDirs && that_present_logDirs))
        return false;
      if (!this.logDirs.equals(that.logDirs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_logDirs = true && (isSetLogDirs());
    list.add(present_logDirs);
    if (present_logDirs)
      list.add(logDirs);

    return list.hashCode();
  }

  @Override
  public int compareTo(MultiGetBuildSlaveLogDirResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLogDirs()).compareTo(other.isSetLogDirs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogDirs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logDirs, other.logDirs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MultiGetBuildSlaveLogDirResponse(");
    boolean first = true;

    if (isSetLogDirs()) {
      sb.append("logDirs:");
      if (this.logDirs == null) {
        sb.append("null");
      } else {
        sb.append(this.logDirs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MultiGetBuildSlaveLogDirResponseStandardSchemeFactory implements SchemeFactory {
    public MultiGetBuildSlaveLogDirResponseStandardScheme getScheme() {
      return new MultiGetBuildSlaveLogDirResponseStandardScheme();
    }
  }

  private static class MultiGetBuildSlaveLogDirResponseStandardScheme extends StandardScheme<MultiGetBuildSlaveLogDirResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MultiGetBuildSlaveLogDirResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOG_DIRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list114 = iprot.readListBegin();
                struct.logDirs = new ArrayList<LogDir>(_list114.size);
                LogDir _elem115;
                for (int _i116 = 0; _i116 < _list114.size; ++_i116)
                {
                  _elem115 = new LogDir();
                  _elem115.read(iprot);
                  struct.logDirs.add(_elem115);
                }
                iprot.readListEnd();
              }
              struct.setLogDirsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MultiGetBuildSlaveLogDirResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.logDirs != null) {
        if (struct.isSetLogDirs()) {
          oprot.writeFieldBegin(LOG_DIRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.logDirs.size()));
            for (LogDir _iter117 : struct.logDirs)
            {
              _iter117.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MultiGetBuildSlaveLogDirResponseTupleSchemeFactory implements SchemeFactory {
    public MultiGetBuildSlaveLogDirResponseTupleScheme getScheme() {
      return new MultiGetBuildSlaveLogDirResponseTupleScheme();
    }
  }

  private static class MultiGetBuildSlaveLogDirResponseTupleScheme extends TupleScheme<MultiGetBuildSlaveLogDirResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveLogDirResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLogDirs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLogDirs()) {
        {
          oprot.writeI32(struct.logDirs.size());
          for (LogDir _iter118 : struct.logDirs)
          {
            _iter118.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveLogDirResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list119 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.logDirs = new ArrayList<LogDir>(_list119.size);
          LogDir _elem120;
          for (int _i121 = 0; _i121 < _list119.size; ++_i121)
          {
            _elem120 = new LogDir();
            _elem120.read(iprot);
            struct.logDirs.add(_elem120);
          }
        }
        struct.setLogDirsIsSet(true);
      }
    }
  }

}

