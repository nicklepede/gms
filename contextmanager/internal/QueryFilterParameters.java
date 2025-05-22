package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avvw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvw();
    public final int a;
    public final int b;
    public final int[] c;

    public QueryFilterParameters(int i, int i2, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
    }

    public final boolean a() {
        return this.c != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            if (r10 != r9) goto L4
            return r0
        L4:
            boolean r1 = r10 instanceof com.google.android.gms.contextmanager.internal.QueryFilterParameters
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.contextmanager.internal.QueryFilterParameters r10 = (com.google.android.gms.contextmanager.internal.QueryFilterParameters) r10
            int r1 = r10.b
            int r3 = r9.b
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r10.a
            int r3 = r9.a
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r9.a()
            boolean r3 = r10.a()
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r9.a()
            if (r1 == 0) goto L52
            int[] r1 = r9.c
            if (r1 == 0) goto L4c
            int[] r3 = r10.c
            if (r3 != 0) goto L34
            goto L4c
        L34:
            int r10 = r1.length
            int r4 = r3.length
            if (r10 != r4) goto L4b
            r10 = r2
        L39:
            if (r10 >= r4) goto L52
            r5 = r3[r10]
            int r6 = r1.length
            r7 = r2
        L3f:
            if (r7 >= r6) goto L4b
            r8 = r1[r7]
            if (r8 != r5) goto L48
            int r10 = r10 + 1
            goto L39
        L48:
            int r7 = r7 + 1
            goto L3f
        L4b:
            return r2
        L4c:
            int[] r10 = r10.c
            if (r1 != r10) goto L51
            return r0
        L51:
            return r2
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contextmanager.internal.QueryFilterParameters.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.c;
        if (iArr != null) {
            i = 0;
            for (int i2 : iArr) {
                i += i2 * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.p(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}
