package com.google.android.gms.icing.appindexing;

import android.content.Context;
import android.net.Uri;
import defpackage.blfp;
import defpackage.blks;
import defpackage.blln;
import defpackage.blpf;
import defpackage.bltn;
import defpackage.blyx;
import defpackage.fpaz;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AppIndexingChimeraContentProvider extends blpf {
    private bltn a;

    final blfp a() {
        bltn bltnVar = this.a;
        if (bltnVar == null) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext != null && fpaz.j()) {
                this.a = bltn.c(applicationContext);
            }
            bltnVar = this.a;
            if (bltnVar == null) {
                return null;
            }
        }
        return bltnVar.a();
    }

    @Override // defpackage.blpf
    public final String b(Uri uri) {
        blks a = blln.a(getContext(), uri);
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
    
        r0 = defpackage.tsz.a(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
    
        defpackage.blfw.r("Returning document cursor with %d rows. Incarnation %s.", java.lang.Integer.valueOf(r0.getCount()), defpackage.tsz.b(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        if (r1 != null) goto L35;
     */
    @Override // defpackage.blpf
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
        blyx.a(getContext(), printWriter, strArr, a());
    }
}
