package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpjt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjt();
    public ShareTarget a;
    public Intent b;
    public atee c;
    public boolean d;

    public SendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendParams) {
            SendParams sendParams = (SendParams) obj;
            if (atyq.b(this.a, sendParams.a) && atyq.b(this.b, sendParams.b) && atyq.b(this.c, sendParams.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(sendParams.d))) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public SendParams(ShareTarget shareTarget, Intent intent, IBinder iBinder, boolean z) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = shareTarget;
        this.b = intent;
        this.c = atecVar;
        this.d = z;
    }
}
