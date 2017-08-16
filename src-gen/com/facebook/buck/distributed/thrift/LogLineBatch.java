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
public class LogLineBatch implements org.apache.thrift.TBase<LogLineBatch, LogLineBatch._Fields>, java.io.Serializable, Cloneable, Comparable<LogLineBatch> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LogLineBatch");

  private static final org.apache.thrift.protocol.TField BATCH_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("batchNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LINES_FIELD_DESC = new org.apache.thrift.protocol.TField("lines", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_LENGTH_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("totalLengthBytes", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LogLineBatchStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LogLineBatchTupleSchemeFactory());
  }

  public int batchNumber; // optional
  public List<String> lines; // optional
  public int totalLengthBytes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BATCH_NUMBER((short)1, "batchNumber"),
    LINES((short)2, "lines"),
    TOTAL_LENGTH_BYTES((short)3, "totalLengthBytes");

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
        case 1: // BATCH_NUMBER
          return BATCH_NUMBER;
        case 2: // LINES
          return LINES;
        case 3: // TOTAL_LENGTH_BYTES
          return TOTAL_LENGTH_BYTES;
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
  private static final int __BATCHNUMBER_ISSET_ID = 0;
  private static final int __TOTALLENGTHBYTES_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BATCH_NUMBER,_Fields.LINES,_Fields.TOTAL_LENGTH_BYTES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BATCH_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("batchNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LINES, new org.apache.thrift.meta_data.FieldMetaData("lines", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.TOTAL_LENGTH_BYTES, new org.apache.thrift.meta_data.FieldMetaData("totalLengthBytes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LogLineBatch.class, metaDataMap);
  }

  public LogLineBatch() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogLineBatch(LogLineBatch other) {
    __isset_bitfield = other.__isset_bitfield;
    this.batchNumber = other.batchNumber;
    if (other.isSetLines()) {
      List<String> __this__lines = new ArrayList<String>(other.lines);
      this.lines = __this__lines;
    }
    this.totalLengthBytes = other.totalLengthBytes;
  }

  public LogLineBatch deepCopy() {
    return new LogLineBatch(this);
  }

  @Override
  public void clear() {
    setBatchNumberIsSet(false);
    this.batchNumber = 0;
    this.lines = null;
    setTotalLengthBytesIsSet(false);
    this.totalLengthBytes = 0;
  }

  public int getBatchNumber() {
    return this.batchNumber;
  }

  public LogLineBatch setBatchNumber(int batchNumber) {
    this.batchNumber = batchNumber;
    setBatchNumberIsSet(true);
    return this;
  }

  public void unsetBatchNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BATCHNUMBER_ISSET_ID);
  }

  /** Returns true if field batchNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __BATCHNUMBER_ISSET_ID);
  }

  public void setBatchNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BATCHNUMBER_ISSET_ID, value);
  }

  public int getLinesSize() {
    return (this.lines == null) ? 0 : this.lines.size();
  }

  public java.util.Iterator<String> getLinesIterator() {
    return (this.lines == null) ? null : this.lines.iterator();
  }

  public void addToLines(String elem) {
    if (this.lines == null) {
      this.lines = new ArrayList<String>();
    }
    this.lines.add(elem);
  }

  public List<String> getLines() {
    return this.lines;
  }

  public LogLineBatch setLines(List<String> lines) {
    this.lines = lines;
    return this;
  }

  public void unsetLines() {
    this.lines = null;
  }

  /** Returns true if field lines is set (has been assigned a value) and false otherwise */
  public boolean isSetLines() {
    return this.lines != null;
  }

  public void setLinesIsSet(boolean value) {
    if (!value) {
      this.lines = null;
    }
  }

  public int getTotalLengthBytes() {
    return this.totalLengthBytes;
  }

  public LogLineBatch setTotalLengthBytes(int totalLengthBytes) {
    this.totalLengthBytes = totalLengthBytes;
    setTotalLengthBytesIsSet(true);
    return this;
  }

  public void unsetTotalLengthBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALLENGTHBYTES_ISSET_ID);
  }

  /** Returns true if field totalLengthBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalLengthBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALLENGTHBYTES_ISSET_ID);
  }

  public void setTotalLengthBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALLENGTHBYTES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BATCH_NUMBER:
      if (value == null) {
        unsetBatchNumber();
      } else {
        setBatchNumber((Integer)value);
      }
      break;

    case LINES:
      if (value == null) {
        unsetLines();
      } else {
        setLines((List<String>)value);
      }
      break;

    case TOTAL_LENGTH_BYTES:
      if (value == null) {
        unsetTotalLengthBytes();
      } else {
        setTotalLengthBytes((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BATCH_NUMBER:
      return getBatchNumber();

    case LINES:
      return getLines();

    case TOTAL_LENGTH_BYTES:
      return getTotalLengthBytes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BATCH_NUMBER:
      return isSetBatchNumber();
    case LINES:
      return isSetLines();
    case TOTAL_LENGTH_BYTES:
      return isSetTotalLengthBytes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LogLineBatch)
      return this.equals((LogLineBatch)that);
    return false;
  }

  public boolean equals(LogLineBatch that) {
    if (that == null)
      return false;

    boolean this_present_batchNumber = true && this.isSetBatchNumber();
    boolean that_present_batchNumber = true && that.isSetBatchNumber();
    if (this_present_batchNumber || that_present_batchNumber) {
      if (!(this_present_batchNumber && that_present_batchNumber))
        return false;
      if (this.batchNumber != that.batchNumber)
        return false;
    }

    boolean this_present_lines = true && this.isSetLines();
    boolean that_present_lines = true && that.isSetLines();
    if (this_present_lines || that_present_lines) {
      if (!(this_present_lines && that_present_lines))
        return false;
      if (!this.lines.equals(that.lines))
        return false;
    }

    boolean this_present_totalLengthBytes = true && this.isSetTotalLengthBytes();
    boolean that_present_totalLengthBytes = true && that.isSetTotalLengthBytes();
    if (this_present_totalLengthBytes || that_present_totalLengthBytes) {
      if (!(this_present_totalLengthBytes && that_present_totalLengthBytes))
        return false;
      if (this.totalLengthBytes != that.totalLengthBytes)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_batchNumber = true && (isSetBatchNumber());
    list.add(present_batchNumber);
    if (present_batchNumber)
      list.add(batchNumber);

    boolean present_lines = true && (isSetLines());
    list.add(present_lines);
    if (present_lines)
      list.add(lines);

    boolean present_totalLengthBytes = true && (isSetTotalLengthBytes());
    list.add(present_totalLengthBytes);
    if (present_totalLengthBytes)
      list.add(totalLengthBytes);

    return list.hashCode();
  }

  @Override
  public int compareTo(LogLineBatch other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBatchNumber()).compareTo(other.isSetBatchNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchNumber, other.batchNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLines()).compareTo(other.isSetLines());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLines()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lines, other.lines);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalLengthBytes()).compareTo(other.isSetTotalLengthBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalLengthBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalLengthBytes, other.totalLengthBytes);
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
    StringBuilder sb = new StringBuilder("LogLineBatch(");
    boolean first = true;

    if (isSetBatchNumber()) {
      sb.append("batchNumber:");
      sb.append(this.batchNumber);
      first = false;
    }
    if (isSetLines()) {
      if (!first) sb.append(", ");
      sb.append("lines:");
      if (this.lines == null) {
        sb.append("null");
      } else {
        sb.append(this.lines);
      }
      first = false;
    }
    if (isSetTotalLengthBytes()) {
      if (!first) sb.append(", ");
      sb.append("totalLengthBytes:");
      sb.append(this.totalLengthBytes);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LogLineBatchStandardSchemeFactory implements SchemeFactory {
    public LogLineBatchStandardScheme getScheme() {
      return new LogLineBatchStandardScheme();
    }
  }

  private static class LogLineBatchStandardScheme extends StandardScheme<LogLineBatch> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LogLineBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BATCH_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batchNumber = iprot.readI32();
              struct.setBatchNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LINES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.lines = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.lines.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setLinesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_LENGTH_BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalLengthBytes = iprot.readI32();
              struct.setTotalLengthBytesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LogLineBatch struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBatchNumber()) {
        oprot.writeFieldBegin(BATCH_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.batchNumber);
        oprot.writeFieldEnd();
      }
      if (struct.lines != null) {
        if (struct.isSetLines()) {
          oprot.writeFieldBegin(LINES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.lines.size()));
            for (String _iter11 : struct.lines)
            {
              oprot.writeString(_iter11);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTotalLengthBytes()) {
        oprot.writeFieldBegin(TOTAL_LENGTH_BYTES_FIELD_DESC);
        oprot.writeI32(struct.totalLengthBytes);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LogLineBatchTupleSchemeFactory implements SchemeFactory {
    public LogLineBatchTupleScheme getScheme() {
      return new LogLineBatchTupleScheme();
    }
  }

  private static class LogLineBatchTupleScheme extends TupleScheme<LogLineBatch> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LogLineBatch struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBatchNumber()) {
        optionals.set(0);
      }
      if (struct.isSetLines()) {
        optionals.set(1);
      }
      if (struct.isSetTotalLengthBytes()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBatchNumber()) {
        oprot.writeI32(struct.batchNumber);
      }
      if (struct.isSetLines()) {
        {
          oprot.writeI32(struct.lines.size());
          for (String _iter12 : struct.lines)
          {
            oprot.writeString(_iter12);
          }
        }
      }
      if (struct.isSetTotalLengthBytes()) {
        oprot.writeI32(struct.totalLengthBytes);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LogLineBatch struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.batchNumber = iprot.readI32();
        struct.setBatchNumberIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.lines = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.lines.add(_elem14);
          }
        }
        struct.setLinesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalLengthBytes = iprot.readI32();
        struct.setTotalLengthBytesIsSet(true);
      }
    }
  }

}

