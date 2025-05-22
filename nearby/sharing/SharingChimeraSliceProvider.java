package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import androidx.slice.Slice;
import defpackage.conm;
import defpackage.ctrp;
import defpackage.ctsa;
import defpackage.ctsi;
import defpackage.ctsj;
import defpackage.rwy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SharingChimeraSliceProvider extends rwy {
    private final Map a = new ArrayMap();

    private final ctsj h(Uri uri) {
        Map map = this.a;
        ctsj ctsjVar = (ctsj) map.get(uri);
        if (ctsjVar == null) {
            Context context = getContext();
            if (context == null) {
                conm.a.e().p("SliceProvider creating failed since context is null", new Object[0]);
                return null;
            }
            if (ctsj.e.equals(uri)) {
                ctsjVar = new ctsi(context);
            }
            if (ctsj.f.equals(uri)) {
                ctsjVar = new ctsa(context);
            }
            if (ctsj.g.equals(uri)) {
                ctsjVar = new ctrp(context);
            }
            if (ctsjVar != null) {
                map.put(uri, ctsjVar);
            }
        }
        return ctsjVar;
    }

    @Override // defpackage.rwy
    public final synchronized Slice a(Uri uri) {
        ctsj h = h(uri);
        if (h != null) {
            return h.a(uri);
        }
        conm.a.b().p("onBindSlice failed since slice uri does not match", new Object[0]);
        return null;
    }

    @Override // defpackage.rwy
    public final synchronized void d(Uri uri) {
        ctsj h = h(uri);
        if (h != null) {
            h.jD(uri);
        } else {
            conm.a.b().p("onSlicePinned failed since slice uri does not match", new Object[0]);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.write("\n");
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.SharingSliceProvider"));
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((ctsj) it.next()).g(printWriter);
        }
        printWriter.flush();
    }

    @Override // defpackage.rwy
    public final synchronized void e(Uri uri) {
        ctsj h = h(uri);
        if (h != null) {
            h.jE(uri);
        } else {
            conm.a.b().p("onSliceUnpinned failed since slice uri does not match", new Object[0]);
        }
    }

    @Override // defpackage.rwy
    public final void f() {
    }
}
