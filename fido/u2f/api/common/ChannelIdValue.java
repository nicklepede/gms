package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bcqh;
import defpackage.bcqi;
import defpackage.bcqj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcqj();
    public static final ChannelIdValue a = new ChannelIdValue();
    public final ChannelIdValueType b;
    public final String c;
    public final String d;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator CREATOR = new bcqh();
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
        throw new bcqi(i);
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
        int a2 = arxc.a(parcel);
        ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
        arxc.o(parcel, 2, this.b.d);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a2);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.b = a(i);
            this.c = str;
            this.d = str2;
        } catch (bcqi e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.c = str;
        this.b = ChannelIdValueType.STRING;
        this.d = null;
    }
}
