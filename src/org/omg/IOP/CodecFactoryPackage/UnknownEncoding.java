package org.omg.IOP.CodecFactoryPackage;


/**
* org/omg/IOP/CodecFactoryPackage/UnknownEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u291/1294/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, April 8, 2021 2:17:40 AM BST
*/

public final class UnknownEncoding extends org.omg.CORBA.UserException
{

  public UnknownEncoding ()
  {
    super(UnknownEncodingHelper.id());
  } // ctor


  public UnknownEncoding (String $reason)
  {
    super(UnknownEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class UnknownEncoding
