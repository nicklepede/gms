package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccqh;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class PlaceAlias extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccqh();
    public static final PlaceAlias a = new PlaceAlias("Home");
    public final String b;

    public PlaceAlias(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceAlias) {
            return atyq.b(this.b, ((PlaceAlias) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("alias", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a2);
    }
}
