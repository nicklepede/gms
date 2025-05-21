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
import defpackage.ayxg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxg();
    public TokenWrapper a;
    public byte[] b;
    public arbp c;
    public String d;
    public ChannelInfo e;

    private SendPayloadParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendPayloadParams) {
            SendPayloadParams sendPayloadParams = (SendPayloadParams) obj;
            if (arwb.b(this.a, sendPayloadParams.a) && Arrays.equals(this.b, sendPayloadParams.b) && arwb.b(this.c, sendPayloadParams.c) && arwb.b(this.d, sendPayloadParams.d) && arwb.b(this.e, sendPayloadParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }

    public SendPayloadParams(TokenWrapper tokenWrapper, byte[] bArr, IBinder iBinder, String str, ChannelInfo channelInfo) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = tokenWrapper;
        this.b = bArr;
        this.c = arbnVar;
        this.d = str;
        this.e = channelInfo;
    }
}
