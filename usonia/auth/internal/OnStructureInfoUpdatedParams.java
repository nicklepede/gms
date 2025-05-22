package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkgl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class OnStructureInfoUpdatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgl();
    public TrustedId[] a;
    public HomeGraphId[] b;

    private OnStructureInfoUpdatedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStructureInfoUpdatedParams) {
            OnStructureInfoUpdatedParams onStructureInfoUpdatedParams = (OnStructureInfoUpdatedParams) obj;
            if (Arrays.equals(this.a, onStructureInfoUpdatedParams.a) && Arrays.equals(this.b, onStructureInfoUpdatedParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.J(parcel, 2, this.b, i);
        atzr.c(parcel, a);
    }

    public OnStructureInfoUpdatedParams(TrustedId[] trustedIdArr, HomeGraphId[] homeGraphIdArr) {
        this.a = trustedIdArr;
        this.b = homeGraphIdArr;
    }
}
