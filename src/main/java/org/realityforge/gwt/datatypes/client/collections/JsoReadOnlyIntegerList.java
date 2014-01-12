package org.realityforge.gwt.datatypes.client.collections;

import com.google.gwt.core.client.JsArrayInteger;
import java.util.AbstractList;
import java.util.List;

/**
 * An adapter converting the JsArrayInteger to support a List interface.
 */
public final class JsoReadOnlyIntegerList
  extends AbstractList<Integer>
  implements List<Integer>
{
  private final JsArrayInteger _data;

  public JsoReadOnlyIntegerList( final JsArrayInteger data )
  {
    _data = data;
  }

  public JsArrayInteger asArray()
  {
    return _data;
  }

  @Override
  public Integer get( final int index )
  {
    return _data.get( index );
  }

  @Override
  public int size()
  {
    return _data.length();
  }
}
