package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmxr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmxr();
    public final int a;
    public final ChannelImpl b;

    public OpenChannelResponse(int i, ChannelImpl channelImpl) {
        this.a = i;
        this.b = channelImpl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.c(parcel, a);
    }
}
