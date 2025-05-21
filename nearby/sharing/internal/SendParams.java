package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cnbl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbl();
    public ShareTarget a;
    public Intent b;
    public arbp c;
    public boolean d;

    public SendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendParams) {
            SendParams sendParams = (SendParams) obj;
            if (arwb.b(this.a, sendParams.a) && arwb.b(this.b, sendParams.b) && arwb.b(this.c, sendParams.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(sendParams.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public SendParams(ShareTarget shareTarget, Intent intent, IBinder iBinder, boolean z) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = shareTarget;
        this.b = intent;
        this.c = arbnVar;
        this.d = z;
    }
}
