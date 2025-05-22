package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpis;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnInstallUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpis();
    public ShareTarget a;
    public AppInstallMetadata b;

    public OnInstallUpdateParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnInstallUpdateParams) {
            OnInstallUpdateParams onInstallUpdateParams = (OnInstallUpdateParams) obj;
            if (atyq.b(this.a, onInstallUpdateParams.a) && atyq.b(this.b, onInstallUpdateParams.b)) {
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
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public OnInstallUpdateParams(ShareTarget shareTarget, AppInstallMetadata appInstallMetadata) {
        this.a = shareTarget;
        this.b = appInstallMetadata;
    }
}
