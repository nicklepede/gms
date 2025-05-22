package com.google.android.gms.personalsafety.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cyhd;
import defpackage.ekti;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TagDeviceData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cyhd();
    public final int a;
    public final String b;
    public final Integer c;

    public TagDeviceData(int i, String str, Integer num) {
        this.a = i;
        this.b = str;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TagDeviceData) {
            TagDeviceData tagDeviceData = (TagDeviceData) obj;
            if (this.a == tagDeviceData.a && ekti.e(this.b, tagDeviceData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return String.format("Device data:<Device Type: %s, Mac Address: %s>", Integer.valueOf(this.a), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.F(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public TagDeviceData(int i, String str) {
        this(i, str, null);
    }
}
