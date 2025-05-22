package com.google.android.gms.learning;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzr;
import defpackage.bsml;
import defpackage.ekvl;
import defpackage.evla;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class InAppTrainerOptions extends BaseOptions {
    public static final Parcelable.Creator CREATOR = new bsml();
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final Uri f;
    public final InAppTrainingConstraints g;
    public final long h;
    public final Uri i;
    public final TrainingInterval j;
    public final Uri k;
    public final Bundle l;
    public final byte[] m;
    private final byte[] n;

    public InAppTrainerOptions(String str, int i, boolean z, String str2, int i2, Uri uri, InAppTrainingConstraints inAppTrainingConstraints, long j, Uri uri2, TrainingInterval trainingInterval, byte[] bArr, Uri uri3, Bundle bundle, byte[] bArr2) {
        boolean z2 = true;
        ekvl.a(!str.isEmpty());
        ekvl.a(i != 0);
        if (uri != null && str2 == null) {
            ekvl.a(i2 == 3);
            ekvl.y(uri2);
            ekvl.y(trainingInterval);
            if (uri3 == null && (bundle == null || bundle == Bundle.EMPTY)) {
                z2 = false;
            }
            ekvl.a(z2);
        } else {
            if (uri != null || str2 == null) {
                if (uri != null) {
                    throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
                }
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            ekvl.a(true ^ str2.isEmpty());
            ekvl.a(b(i2));
        }
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = uri;
        this.i = uri2;
        this.g = inAppTrainingConstraints;
        this.h = j;
        this.j = trainingInterval;
        this.n = bArr == null ? new byte[0] : bArr;
        this.k = uri3;
        this.l = bundle;
        this.m = bArr2 == null ? evla.a.r() : bArr2;
    }

    public static void a(Uri uri) {
        ekvl.f(uri.isAbsolute(), "%s is not absolute.", uri);
        ekvl.f(uri.isHierarchical(), "%s is not hierarchical.", uri);
        ekvl.b(uri.getAuthority() == null, "Uri cannot have authority.");
        ekvl.b(uri.getFragment() == null, "Uri cannot have fragment part.");
        ekvl.b(uri.getQuery() == null, "Uri cannot have query part.");
        ekvl.f("appfiles".equals(uri.getScheme()) || "appcache".equals(uri.getScheme()) || "appdir".equals(uri.getScheme()), "Unsupported scheme: %s", uri.getScheme());
    }

    public static boolean b(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public final byte[] c() {
        byte[] bArr = this.n;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        if (r1 == r3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.learning.InAppTrainerOptions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.learning.InAppTrainerOptions r8 = (com.google.android.gms.learning.InAppTrainerOptions) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            int r1 = r7.b
            int r3 = r8.b
            if (r1 != r3) goto Lc4
            boolean r1 = r7.c
            boolean r3 = r8.c
            if (r1 != r3) goto Lc4
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            int r1 = r7.e
            int r3 = r8.e
            if (r1 != r3) goto Lc4
            android.net.Uri r1 = r7.f
            android.net.Uri r3 = r8.f
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            android.net.Uri r1 = r7.i
            android.net.Uri r3 = r8.i
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            com.google.android.gms.learning.InAppTrainingConstraints r1 = r7.g
            com.google.android.gms.learning.InAppTrainingConstraints r3 = r8.g
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            long r3 = r7.h
            long r5 = r8.h
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc4
            com.google.android.gms.learning.TrainingInterval r1 = r7.j
            com.google.android.gms.learning.TrainingInterval r3 = r8.j
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            byte[] r1 = r7.n
            byte[] r3 = r8.n
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto Lc4
            android.net.Uri r1 = r7.k
            android.net.Uri r3 = r8.k
            boolean r1 = defpackage.ekus.a(r1, r3)
            if (r1 == 0) goto Lc4
            android.os.Bundle r1 = r7.l
            android.os.Bundle r3 = r8.l
            if (r1 == 0) goto Lb7
            if (r3 != 0) goto L7f
            goto Lb7
        L7f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L8a
            goto Lc4
        L8a:
            java.util.Set r4 = r1.keySet()
            java.util.Set r5 = r3.keySet()
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto Lc4
            java.util.Iterator r4 = r4.iterator()
        L9c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.get(r5)
            java.lang.Object r5 = r3.get(r5)
            boolean r5 = defpackage.ekus.a(r6, r5)
            if (r5 != 0) goto L9c
            goto Lc4
        Lb7:
            if (r1 != r3) goto Lc4
        Lb9:
            byte[] r1 = r7.m
            byte[] r8 = r8.m
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 == 0) goto Lc4
            return r0
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.InAppTrainerOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, this.i, this.g, Long.valueOf(this.h), this.j, Integer.valueOf(Arrays.hashCode(this.n)), this.k, this.l, Integer.valueOf(Arrays.hashCode(this.m))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 9, this.g, i, false);
        atzr.q(parcel, 10, this.h);
        atzr.t(parcel, 11, this.i, i, false);
        atzr.t(parcel, 12, this.j, i, false);
        atzr.i(parcel, 13, c(), false);
        atzr.t(parcel, 14, this.k, i, false);
        atzr.g(parcel, 15, this.l, false);
        atzr.i(parcel, 16, this.m, false);
        atzr.c(parcel, a);
    }
}
