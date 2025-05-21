package com.google.android.gms.dtdi.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.azeu;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DiscoveryStartedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azeu();
    public final int a;
    public final List b;

    public DiscoveryStartedParams(int i, List list) {
        fvbo.f(list, "identityTypes");
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryStartedParams)) {
            return false;
        }
        DiscoveryStartedParams discoveryStartedParams = (DiscoveryStartedParams) obj;
        return this.a == discoveryStartedParams.a && fvbo.n(this.b, discoveryStartedParams.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DiscoveryStartedParams(identitySource=" + this.a + ", identityTypes=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.E(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
