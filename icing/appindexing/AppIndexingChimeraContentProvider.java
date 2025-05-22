package com.google.android.gms.icing.appindexing;

import android.content.Context;
import android.net.Uri;
import defpackage.bnmh;
import defpackage.bnrk;
import defpackage.bnsf;
import defpackage.bnvx;
import defpackage.boaf;
import defpackage.bofp;
import defpackage.frug;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppIndexingChimeraContentProvider extends bnvx {
    private boaf a;

    final bnmh a() {
        boaf boafVar = this.a;
        if (boafVar == null) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext != null && frug.j()) {
                this.a = boaf.c(applicationContext);
            }
            boafVar = this.a;
            if (boafVar == null) {
                return null;
            }
        }
        return boafVar.a();
    }

    @Override // defpackage.bnvx
    public final String b(Uri uri) {
        bnrk a = bnsf.a(getContext(), uri);
        if (a == null) {
            return null;
        }
        return "vnd.android.cursor.dir/vnd.".concat(String.valueOf(a.a.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ea, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        r0 = defpackage.voz.a(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
    
        defpackage.bnmo.r("Returning document cursor with %d rows. Incarnation %s.", java.lang.Integer.valueOf(r0.getCount()), defpackage.voz.b(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        if (r1 != null) goto L35;
     */
    @Override // defpackage.bnvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor c(android.net.Uri r20, java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.appindexing.AppIndexingChimeraContentProvider.c(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (getContext() == null || a() == null) {
            return;
        }
        bofp.a(getContext(), printWriter, strArr, a());
    }
}
