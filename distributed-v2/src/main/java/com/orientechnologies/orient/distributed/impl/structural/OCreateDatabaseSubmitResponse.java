package com.orientechnologies.orient.distributed.impl.structural;

import com.orientechnologies.orient.distributed.impl.coordinator.OCoordinateMessagesFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class OCreateDatabaseSubmitResponse implements OStructuralSubmitResponse {
  @Override
  public void serialize(DataOutput output) throws IOException {

  }

  @Override
  public void deserialize(DataInput input) throws IOException {

  }

  @Override
  public int getResponseType() {
    return OCoordinateMessagesFactory.CREATE_DATABASE_SUBMIT_RESPONSE;
  }
}
