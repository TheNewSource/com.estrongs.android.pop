package com.estrongs.android.a;

import com.estrongs.android.a.b.q;
import java.util.Comparator;

class ae
  implements Comparator<q>
{
  ae(ab paramab) {}
  
  public int a(q paramq1, q paramq2)
  {
    long l = paramq1.d();
    l = paramq2.d() - l;
    if (l == 0L) {
      return 0;
    }
    if (l < 0L) {
      return -1;
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.estrongs.android.a.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */