package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.daig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new daig();
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;
    public byte[] f;
    public File g;

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.a = str;
        this.b = dataHolder;
        this.c = parcelFileDescriptor;
        this.d = j;
        this.e = bArr;
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            android.os.ParcelFileDescriptor r0 = r4.c
            r1 = 0
            if (r0 != 0) goto L63
            byte[] r0 = r4.f
            if (r0 == 0) goto L63
            java.io.File r0 = r4.g
            if (r0 != 0) goto Lf
        Ld:
            r2 = r1
            goto L3b
        Lf:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r3 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r4.c = r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            if (r0 == 0) goto L3b
            r0.delete()
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
            goto L2e
        L2d:
            r5 = move-exception
        L2e:
            if (r1 == 0) goto L33
            r1.delete()
        L33:
            throw r5
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto Ld
            r0.delete()
            goto Ld
        L3b:
            if (r2 == 0) goto L63
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r0)
            byte[] r0 = r4.f     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            int r0 = r0.length     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            byte[] r0 = r4.f     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r2.write(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            a(r2)
            r6 = r6 | 1
            defpackage.daig.a(r4, r5, r6)
            goto L66
        L5b:
            r5 = move-exception
            a(r2)
            throw r5
        L60:
            a(r2)
        L63:
            defpackage.daig.a(r4, r5, r6)
        L66:
            r4.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    public SafeBrowsingData(String str) {
        this(str, null, null, 0L, null);
    }
}
