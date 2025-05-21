package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cubx;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ParcelableGetOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cubx();
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final Bundle e;

    public ParcelableGetOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("useOfflineDatabase", Boolean.valueOf(this.a), arrayList);
        arwa.b("useWebData", Boolean.valueOf(this.b), arrayList);
        arwa.b("endpoint", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.g(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
