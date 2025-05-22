package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atqn;
import defpackage.atqo;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.atzb;
import defpackage.atzr;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new atqq();
    public static final atqo a = new atqn(new String[0]);
    final int b;
    public final String[] c;
    public Bundle d;
    public final CursorWindow[] e;
    public final int f;
    public final Bundle g;
    int[] h;
    public int i;
    boolean j;
    private boolean k;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.j = false;
        this.k = true;
        this.b = i;
        this.c = strArr;
        this.e = cursorWindowArr;
        this.f = i2;
        this.g = bundle;
    }

    private static CursorWindow[] i(atqo atqoVar) {
        int length;
        String[] strArr = atqoVar.a;
        int length2 = strArr.length;
        if (length2 == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = atqoVar.b;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(length2);
        int i = 0;
        boolean z = false;
        while (i < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i);
                    cursorWindow.setNumColumns(strArr.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i);
                int i2 = 0;
                boolean z2 = true;
                while (true) {
                    length = strArr.length;
                    if (i2 < length) {
                        if (!z2) {
                            break;
                        }
                        String str = strArr[i2];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i, i2);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i, i2);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i, i2);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong(((Integer) obj).intValue(), i, i2);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i, i2);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i, i2);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException(a.o(str, obj, "Unsupported object for column ", ": "));
                            }
                            z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i, i2);
                        }
                        i2++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (z) {
                    throw new atqp();
                }
                cursorWindow.freeLastRow();
                cursorWindow = new CursorWindow(false);
                cursorWindow.setStartPosition(i);
                cursorWindow.setNumColumns(length);
                arrayList2.add(cursorWindow);
                i--;
                z = true;
                i++;
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((CursorWindow) arrayList2.get(i3)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    public final int a(int i) {
        int length;
        int i2 = 0;
        atzb.l(i >= 0 && i < this.i);
        while (true) {
            int[] iArr = this.h;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final String b(String str, int i, int i2) {
        c(str, i);
        return this.e[i2].getString(i, this.d.getInt(str));
    }

    public final void c(String str, int i) {
        Bundle bundle = this.d;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (g()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.i) {
            throw new CursorIndexOutOfBoundsException(i, this.i);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.e;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void d() {
        this.d = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.c;
            if (i >= strArr.length) {
                break;
            }
            this.d.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.e;
        this.h = new int[cursorWindowArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < cursorWindowArr.length; i3++) {
            this.h[i3] = i2;
            i2 += cursorWindowArr[i3].getNumRows() - (i2 - cursorWindowArr[i3].getStartPosition());
        }
        this.i = i2;
    }

    public final boolean e(String str) {
        return this.d.containsKey(str);
    }

    public final boolean f(String str, int i, int i2) {
        c(str, i);
        return this.e[i2].isNull(i, this.d.getInt(str));
    }

    protected final void finalize() {
        try {
            if (this.k && this.e.length > 0 && !g()) {
                close();
                Log.e("DataBuffer", a.b(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    public final byte[] h(String str, int i, int i2) {
        c(str, i);
        return this.e[i2].getBlob(i, this.d.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.c;
        int a2 = atzr.a(parcel);
        atzr.w(parcel, 1, strArr, false);
        atzr.J(parcel, 2, this.e, i);
        atzr.o(parcel, 3, this.f);
        atzr.g(parcel, 4, this.g, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.b);
        atzr.c(parcel, a2);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataHolder(android.database.Cursor r7) {
        /*
            r6 = this;
            aumk r0 = new aumk
            r0.<init>(r7)
            java.lang.String[] r7 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L76
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            if (r3 == 0) goto L2d
            int r5 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L76
            if (r5 != 0) goto L2d
            r3.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.a()     // Catch: java.lang.Throwable -> L76
            r1.add(r3)     // Catch: java.lang.Throwable -> L76
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L76
            goto L2e
        L2d:
            r3 = r4
        L2e:
            if (r3 >= r2) goto L62
            boolean r5 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L62
            android.database.CursorWindow r5 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L43
            r5.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.a()     // Catch: java.lang.Throwable -> L76
            goto L4e
        L43:
            android.database.CursorWindow r5 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L76
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76
            r5.setStartPosition(r3)     // Catch: java.lang.Throwable -> L76
            r0.fillWindow(r3, r5)     // Catch: java.lang.Throwable -> L76
        L4e:
            int r3 = r5.getNumRows()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L55
            goto L62
        L55:
            r1.add(r5)     // Catch: java.lang.Throwable -> L76
            int r3 = r5.getStartPosition()     // Catch: java.lang.Throwable -> L76
            int r5 = r5.getNumRows()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + r5
            goto L2e
        L62:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r1 = 0
            r6.<init>(r7, r0, r4, r1)
            return
        L76:
            r7 = move-exception
            r0.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor):void");
    }

    public DataHolder(atqo atqoVar, int i) {
        this(atqoVar.a, i(atqoVar), i, null);
    }

    public /* synthetic */ DataHolder(atqo atqoVar, int i, Bundle bundle) {
        this(atqoVar.a, i(atqoVar), i, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.j = false;
        this.k = true;
        this.b = 1;
        atzb.s(strArr);
        this.c = strArr;
        atzb.s(cursorWindowArr);
        this.e = cursorWindowArr;
        this.f = i;
        this.g = bundle;
        d();
    }
}
