package com.google.android.gms.chimera.container.dynamite;

import android.content.Context;
import android.database.Cursor;
import defpackage.aqbd;
import defpackage.aqfb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsProcessDynamiteLoaderImpl implements aqbd {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        defpackage.aqfq.e().a(r23, 101);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe A[SYNTHETIC] */
    @Override // defpackage.aqbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Context loadModule(android.content.Context r23, java.lang.String r24, int r25, android.database.Cursor r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.dynamite.GmsProcessDynamiteLoaderImpl.loadModule(android.content.Context, java.lang.String, int, android.database.Cursor):android.content.Context");
    }

    @Override // defpackage.aqbd
    public final Cursor queryForDynamiteModule(Context context, String str, boolean z) {
        return aqfb.b(aqfb.d().e(context, null, 0L, str, z, false, context.getPackageName()));
    }
}
