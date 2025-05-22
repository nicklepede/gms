package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atzr;
import defpackage.dlvg;
import defpackage.dmta;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmta();
    public final ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(dlvg dlvgVar) {
        int i = this.b;
        if (i == 1) {
            dlvgVar.D(this.a);
            return;
        }
        if (i == 2) {
            dlvgVar.E(this.a);
            return;
        }
        if (i == 3) {
            dlvgVar.F(this.a);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", a.j(i, "Unknown type: "));
        } else {
            dlvgVar.G(this.a);
        }
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + num + ", closeReason=" + (i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL") + ", appErrorCode=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.c(parcel, a);
    }
}
