package com.google.android.gms.mdocstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cfnz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MdocStoreApiError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfnz();
    public String a;
    public int b;

    private MdocStoreApiError() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdocStoreApiError) {
            MdocStoreApiError mdocStoreApiError = (MdocStoreApiError) obj;
            if (atyq.b(this.a, mdocStoreApiError.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(mdocStoreApiError.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public MdocStoreApiError(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
