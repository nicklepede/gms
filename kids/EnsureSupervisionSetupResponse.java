package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.brai;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class EnsureSupervisionSetupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brai();
    public int a;

    private EnsureSupervisionSetupResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnsureSupervisionSetupResponse) {
            return atyq.b(Integer.valueOf(this.a), Integer.valueOf(((EnsureSupervisionSetupResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public EnsureSupervisionSetupResponse(int i) {
        this.a = i;
    }
}
