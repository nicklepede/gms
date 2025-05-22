package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnwh;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DeviceAccountId extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cnwh();
    public final String a;
    public final String b;

    public DeviceAccountId(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DeviceAccountId clone() {
        try {
            return (DeviceAccountId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceAccountId) {
            DeviceAccountId deviceAccountId = (DeviceAccountId) obj;
            if (atyq.b(this.a, deviceAccountId.a) && atyq.b(this.b, deviceAccountId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format(Locale.US, "DeviceAccountId<device_id: %s, account_id: %s>", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
