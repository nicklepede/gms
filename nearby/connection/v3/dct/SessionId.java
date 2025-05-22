package com.google.android.gms.nearby.connection.v3.dct;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SessionId extends DctDeviceDataElement {
    private static final Charset d = Charset.forName("UTF-8");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SessionId(byte[] r5) {
        /*
            r4 = this;
            int r0 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r0)
            r1 = 1
            r2 = 6
            r4.<init>(r1, r2, r5)
            if (r0 != r2) goto Ld
            return
        Ld:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r2[r1] = r0
            java.lang.String r5 = "Incorrect size for Session Id: expected %d, actual %d"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            java.lang.String r0 = "SessionId"
            android.util.Log.i(r0, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incorrect size for Session Id."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.connection.v3.dct.SessionId.<init>(byte[]):void");
    }

    public final byte[] b() {
        byte[] bArr = this.c;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SessionId) {
            return Arrays.equals(this.c, ((SessionId) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return new String(this.c, d);
    }
}
