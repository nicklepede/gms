package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnwf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ContactFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnwf();
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
            if (atyq.b(this.a, contactFilter.a) && atyq.b(this.b, contactFilter.b) && atyq.b(this.c, contactFilter.c) && atyq.b(this.d, contactFilter.d)) {
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
        int a = atzr.a(parcel);
        atzr.z(parcel, 1, this.a);
        atzr.z(parcel, 2, this.b);
        atzr.z(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public ContactFilter(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = str;
    }
}
