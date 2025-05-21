package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import androidx.slice.Slice;
import defpackage.cmfe;
import defpackage.cril;
import defpackage.criw;
import defpackage.crje;
import defpackage.crjf;
import defpackage.qdu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SharingChimeraSliceProvider extends qdu {
    private final Map a = new ArrayMap();

    private final crjf h(Uri uri) {
        Map map = this.a;
        crjf crjfVar = (crjf) map.get(uri);
        if (crjfVar == null) {
            Context context = getContext();
            if (context == null) {
                cmfe.a.e().p("SliceProvider creating failed since context is null", new Object[0]);
                return null;
            }
            if (crjf.e.equals(uri)) {
                crjfVar = new crje(context);
            }
            if (crjf.f.equals(uri)) {
                crjfVar = new criw(context);
            }
            if (crjf.g.equals(uri)) {
                crjfVar = new cril(context);
            }
            if (crjfVar != null) {
                map.put(uri, crjfVar);
            }
        }
        return crjfVar;
    }

    @Override // defpackage.qdu
    public final synchronized Slice a(Uri uri) {
        crjf h = h(uri);
        if (h != null) {
            return h.a(uri);
        }
        cmfe.a.b().p("onBindSlice failed since slice uri does not match", new Object[0]);
        return null;
    }

    @Override // defpackage.qdu
    public final synchronized void d(Uri uri) {
        crjf h = h(uri);
        if (h != null) {
            h.jo(uri);
        } else {
            cmfe.a.b().p("onSlicePinned failed since slice uri does not match", new Object[0]);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.write("\n");
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.SharingSliceProvider"));
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((crjf) it.next()).g(printWriter);
        }
        printWriter.flush();
    }

    @Override // defpackage.qdu
    public final synchronized void e(Uri uri) {
        crjf h = h(uri);
        if (h != null) {
            h.jp(uri);
        } else {
            cmfe.a.b().p("onSliceUnpinned failed since slice uri does not match", new Object[0]);
        }
    }

    @Override // defpackage.qdu
    public final void f() {
    }
}
