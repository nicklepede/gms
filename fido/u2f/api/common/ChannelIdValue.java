package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.beru;
import defpackage.berv;
import defpackage.berw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new berw();
    public static final ChannelIdValue a = new ChannelIdValue();
    public final ChannelIdValueType b;
    public final String c;
    public final String d;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator CREATOR = new beru();
        public final int d;

        ChannelIdValueType(int i) {
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
        }
    }

    static {
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.b = ChannelIdValueType.ABSENT;
        this.d = null;
        this.c = null;
    }

    public static ChannelIdValueType a(int i) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.d) {
                return channelIdValueType;
            }
        }
        throw new berv(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = this.b;
        if (!channelIdValueType.equals(channelIdValue.b)) {
            return false;
        }
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.c.equals(channelIdValue.c);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.d.equals(channelIdValue.d);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        ChannelIdValueType channelIdValueType = this.b;
        int hashCode2 = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.c.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.d.hashCode();
        }
        return i + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
        atzr.o(parcel, 2, this.b.d);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a2);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.b = a(i);
            this.c = str;
            this.d = str2;
        } catch (berv e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.c = str;
        this.b = ChannelIdValueType.STRING;
        this.d = null;
    }
}
