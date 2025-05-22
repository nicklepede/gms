package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImportGivenOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexj();
    public boolean a;

    public ImportGivenOwnerKeyResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImportGivenOwnerKeyResponse) {
            return atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(((ImportGivenOwnerKeyResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public ImportGivenOwnerKeyResponse(boolean z) {
        this.a = z;
    }
}
