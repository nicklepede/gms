package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbap;
import defpackage.bbay;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RegisterPayloadReceiverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbay();
    public TokenWrapper a;
    public atee b;
    public String c;
    public ChannelInfo d;
    public bbap e;

    private RegisterPayloadReceiverParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterPayloadReceiverParams) {
            RegisterPayloadReceiverParams registerPayloadReceiverParams = (RegisterPayloadReceiverParams) obj;
            if (atyq.b(this.a, registerPayloadReceiverParams.a) && atyq.b(this.e, registerPayloadReceiverParams.e) && atyq.b(this.b, registerPayloadReceiverParams.b) && atyq.b(this.c, registerPayloadReceiverParams.c) && atyq.b(this.d, registerPayloadReceiverParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.e, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.D(parcel, 2, this.e.a);
        atzr.D(parcel, 3, this.b.asBinder());
        atzr.v(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }

    public RegisterPayloadReceiverParams(TokenWrapper tokenWrapper, IBinder iBinder, IBinder iBinder2, String str, ChannelInfo channelInfo) {
        bbap bbapVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbapVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnPayloadReceivedCallback");
            bbapVar = queryLocalInterface instanceof bbap ? (bbap) queryLocalInterface : new bbap(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = tokenWrapper;
        this.e = bbapVar;
        this.b = ateeVar;
        this.c = str;
        this.d = channelInfo;
    }
}
