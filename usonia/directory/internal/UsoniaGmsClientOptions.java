package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkiv;
import defpackage.eukx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UsoniaGmsClientOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkiv();
    public eukx a;

    public UsoniaGmsClientOptions() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UsoniaGmsClientOptions) {
            return atyq.b(this.a, ((UsoniaGmsClientOptions) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        eukx eukxVar = this.a;
        atzr.i(parcel, 1, eukxVar == null ? null : eukxVar.r(), false);
        atzr.c(parcel, a);
    }

    public UsoniaGmsClientOptions(eukx eukxVar) {
        this.a = eukxVar;
    }
}
