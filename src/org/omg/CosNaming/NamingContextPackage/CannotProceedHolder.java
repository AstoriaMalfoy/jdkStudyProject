package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/CannotProceedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u291/1294/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, April 8, 2021 2:17:40 AM BST
*/

public final class CannotProceedHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.CannotProceed value = null;

  public CannotProceedHolder ()
  {
  }

  public CannotProceedHolder (org.omg.CosNaming.NamingContextPackage.CannotProceed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.type ();
  }

}
