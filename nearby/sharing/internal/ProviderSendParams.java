package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmxr;
import defpackage.cmxt;
import defpackage.cnaz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ProviderSendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnaz();
    public String a;
    public ShareTarget b;
    public cmxt c;

    public ProviderSendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSendParams) {
            ProviderSendParams providerSendParams = (ProviderSendParams) obj;
            if (arwb.b(this.a, providerSendParams.a) && arwb.b(this.b, providerSendParams.b) && arwb.b(this.c, providerSendParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public ProviderSendParams(String str, ShareTarget shareTarget, IBinder iBinder) {
        cmxt cmxrVar;
        if (iBinder == null) {
            cmxrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cmxrVar = queryLocalInterface instanceof cmxt ? (cmxt) queryLocalInterface : new cmxr(iBinder);
        }
        this.a = str;
        this.b = shareTarget;
        this.c = cmxrVar;
    }
}
