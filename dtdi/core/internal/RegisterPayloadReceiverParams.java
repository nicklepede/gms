package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywv;
import defpackage.ayxe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RegisterPayloadReceiverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxe();
    public TokenWrapper a;
    public arbp b;
    public String c;
    public ChannelInfo d;
    public aywv e;

    private RegisterPayloadReceiverParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterPayloadReceiverParams) {
            RegisterPayloadReceiverParams registerPayloadReceiverParams = (RegisterPayloadReceiverParams) obj;
            if (arwb.b(this.a, registerPayloadReceiverParams.a) && arwb.b(this.e, registerPayloadReceiverParams.e) && arwb.b(this.b, registerPayloadReceiverParams.b) && arwb.b(this.c, registerPayloadReceiverParams.c) && arwb.b(this.d, registerPayloadReceiverParams.d)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.e.a);
        arxc.D(parcel, 3, this.b.asBinder());
        arxc.v(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }

    public RegisterPayloadReceiverParams(TokenWrapper tokenWrapper, IBinder iBinder, IBinder iBinder2, String str, ChannelInfo channelInfo) {
        aywv aywvVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnPayloadReceivedCallback");
            aywvVar = queryLocalInterface instanceof aywv ? (aywv) queryLocalInterface : new aywv(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = tokenWrapper;
        this.e = aywvVar;
        this.b = arbpVar;
        this.c = str;
        this.d = channelInfo;
    }
}
