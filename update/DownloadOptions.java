package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhcp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DownloadOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhcp();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public DownloadOptions(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadOptions)) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) obj;
        return this.a == downloadOptions.a && this.b == downloadOptions.b && this.c == downloadOptions.c && this.d == downloadOptions.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("ignoreNetworkCondition", Boolean.valueOf(this.a), arrayList);
        arwa.b("ignoreOffpeakWindow", Boolean.valueOf(this.b), arrayList);
        arwa.b("ignoreDeviceIdleCondition", Boolean.valueOf(this.c), arrayList);
        arwa.b("allowedNetwork", Integer.valueOf(this.d), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
