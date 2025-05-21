package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AddItemsConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbk();
    public boolean a;

    private AddItemsConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddItemsConfig) {
            return arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(((AddItemsConfig) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public AddItemsConfig(boolean z) {
        this.a = z;
    }
}
