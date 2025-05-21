package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.clnx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ContactFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clnx();
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public String d;

    public ContactFilter() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactFilter) {
            ContactFilter contactFilter = (ContactFilter) obj;
            if (arwb.b(this.a, contactFilter.a) && arwb.b(this.b, contactFilter.b) && arwb.b(this.c, contactFilter.c) && arwb.b(this.d, contactFilter.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.z(parcel, 1, this.a);
        arxc.z(parcel, 2, this.b);
        arxc.z(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public ContactFilter(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = str;
    }
}
