package com.google.android.gms.icing.proxy;

import android.net.Uri;
import defpackage.blpf;
import defpackage.blpm;
import defpackage.blrw;
import defpackage.eitj;
import defpackage.tsx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AppsContentChimeraProvider extends blpf {
    private static final blrw a;
    private static final String[] b;

    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.apps");
        a = new blrw();
        List asList = Arrays.asList(blpm.a);
        eitj eitjVar = tsx.a;
        ArrayList arrayList = new ArrayList(tsx.a.size() + 17);
        arrayList.addAll(tsx.a);
        arrayList.add("created_timestamp");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add(tsx.a((String) it.next()));
        }
        b = (String[]) arrayList.toArray(new String[0]);
    }

    @Override // defpackage.blpf
    public final String b(Uri uri) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.blpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor c(android.net.Uri r20, java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.proxy.AppsContentChimeraProvider.c(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }
}
