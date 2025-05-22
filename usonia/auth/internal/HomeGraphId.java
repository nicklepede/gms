package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkfm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class HomeGraphId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkfm();
    public String a;
    public String b;

    private HomeGraphId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeGraphId) {
            HomeGraphId homeGraphId = (HomeGraphId) obj;
            if (atyq.b(this.a, homeGraphId.a) && atyq.b(this.b, homeGraphId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public HomeGraphId(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
