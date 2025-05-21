package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.dkhi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, Parcelable {
    public static final Parcelable.Creator CREATOR = new dkhi();
    public final String a;
    public final String b;
    public final String c;

    public ChannelImpl(String str, String str2, String str3) {
        arwm.s(str);
        this.a = str;
        arwm.s(str2);
        this.b = str2;
        arwm.s(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.a.equals(channelImpl.a) && arwb.b(channelImpl.b, this.b) && arwb.b(channelImpl.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + trim + ", nodeId=" + this.b + ", path=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
