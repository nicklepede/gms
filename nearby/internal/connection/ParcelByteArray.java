package com.google.android.gms.nearby.internal.connection;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cllb;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ParcelByteArray extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllb();
    public byte[] a;
    public ParcelFileDescriptor b;

    public ParcelByteArray() {
        this.a = new byte[0];
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelByteArray) {
            return Arrays.equals(this.a, ((ParcelByteArray) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x009b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:156), block:B:48:0x009b */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ParcelByteArray"
            byte[] r1 = r7.a
            r2 = 0
            if (r1 == 0) goto La2
            android.os.ParcelFileDescriptor r3 = r7.b
            if (r3 == 0) goto Ld
            goto La2
        Ld:
            java.io.File r3 = defpackage.cllm.a     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            if (r3 == 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L86
            java.lang.String r5 = "teleporter"
            r4.<init>(r5)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L86
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L86
            r4.append(r5)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L86
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L86
            java.lang.String r5 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L86
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L5c java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            r4.<init>(r3)     // Catch: java.io.FileNotFoundException -> L5c java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            r5 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r3, r5)     // Catch: java.io.FileNotFoundException -> L5c java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            r3.delete()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            android.util.Pair r3 = android.util.Pair.create(r4, r5)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.lang.Object r5 = r3.first     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            int r4 = r1.length     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> L9a
            r5.writeInt(r4)     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> L9a
            r5.write(r1)     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> L9a
            java.lang.Object r1 = r3.second     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> L9a
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> L9a
            a(r5)
            goto L97
        L58:
            r1 = move-exception
            goto L7a
        L5a:
            r1 = move-exception
            goto L88
        L5c:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.lang.String r4 = "Temporary file is somehow already deleted"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            throw r3     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
        L65:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.lang.String r4 = "Could not create temporary file"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            throw r3     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            java.lang.String r3 = "Must set temp dir before writing this object to a parcel"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
            throw r1     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L86
        L76:
            r8 = move-exception
            goto L9c
        L78:
            r1 = move-exception
            r5 = r2
        L7a:
            java.lang.String r3 = "Could not write into unlinked file. "
            java.lang.String r1 = defpackage.a.Q(r1, r3)     // Catch: java.lang.Throwable -> L9a
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L96
            goto L93
        L86:
            r1 = move-exception
            r5 = r2
        L88:
            java.lang.String r3 = "Could not create unlinked file. "
            java.lang.String r1 = defpackage.a.Q(r1, r3)     // Catch: java.lang.Throwable -> L9a
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L96
        L93:
            a(r5)
        L96:
            r1 = r2
        L97:
            r7.b = r1
            goto La2
        L9a:
            r8 = move-exception
            r2 = r5
        L9c:
            if (r2 == 0) goto La1
            a(r2)
        La1:
            throw r8
        La2:
            r0 = 1
            r9 = r9 | r0
            int r1 = defpackage.atzr.a(r8)
            android.os.ParcelFileDescriptor r3 = r7.b
            r4 = 0
            defpackage.atzr.t(r8, r0, r3, r9, r4)
            defpackage.atzr.c(r8, r1)
            r7.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.internal.connection.ParcelByteArray.writeToParcel(android.os.Parcel, int):void");
    }

    public ParcelByteArray(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new byte[0];
        this.b = parcelFileDescriptor;
    }
}
