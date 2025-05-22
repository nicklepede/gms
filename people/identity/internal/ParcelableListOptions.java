package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.cwlf;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ParcelableListOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwlf();
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final Bundle e;

    public ParcelableListOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("useOfflineDatabase", Boolean.valueOf(this.a), arrayList);
        atyp.b("useWebData", Boolean.valueOf(this.b), arrayList);
        atyp.b("useCP2", Boolean.valueOf(this.d), arrayList);
        atyp.b("endpoint", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.g(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
