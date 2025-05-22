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
import defpackage.bbba;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbba();
    public TokenWrapper a;
    public byte[] b;
    public atee c;
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
            if (atyq.b(this.a, sendPayloadParams.a) && Arrays.equals(this.b, sendPayloadParams.b) && atyq.b(this.c, sendPayloadParams.c) && atyq.b(this.d, sendPayloadParams.d) && atyq.b(this.e, sendPayloadParams.e)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public SendPayloadParams(TokenWrapper tokenWrapper, byte[] bArr, IBinder iBinder, String str, ChannelInfo channelInfo) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = tokenWrapper;
        this.b = bArr;
        this.c = atecVar;
        this.d = str;
        this.e = channelInfo;
    }
}
