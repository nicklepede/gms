package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfz;
import defpackage.cpgb;
import defpackage.cpjh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ProviderSendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjh();
    public String a;
    public ShareTarget b;
    public cpgb c;

    public ProviderSendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSendParams) {
            ProviderSendParams providerSendParams = (ProviderSendParams) obj;
            if (atyq.b(this.a, providerSendParams.a) && atyq.b(this.b, providerSendParams.b) && atyq.b(this.c, providerSendParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public ProviderSendParams(String str, ShareTarget shareTarget, IBinder iBinder) {
        cpgb cpfzVar;
        if (iBinder == null) {
            cpfzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cpfzVar = queryLocalInterface instanceof cpgb ? (cpgb) queryLocalInterface : new cpfz(iBinder);
        }
        this.a = str;
        this.b = shareTarget;
        this.c = cpfzVar;
    }
}
