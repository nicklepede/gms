package com.google.android.gms.icing.proxy;

import android.net.Uri;
import defpackage.bnvx;
import defpackage.bnwe;
import defpackage.bnyo;
import defpackage.elgo;
import defpackage.vox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppsContentChimeraProvider extends bnvx {
    private static final bnyo a;
    private static final String[] b;

    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.apps");
        a = new bnyo();
        List asList = Arrays.asList(bnwe.a);
        elgo elgoVar = vox.a;
        ArrayList arrayList = new ArrayList(vox.a.size() + 17);
        arrayList.addAll(vox.a);
        arrayList.add("created_timestamp");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add(vox.a((String) it.next()));
        }
        b = (String[]) arrayList.toArray(new String[0]);
    }

    @Override // defpackage.bnvx
    public final String b(Uri uri) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.bnvx
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
