package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnwg;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactInfo extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cnwg();
    public final int a;
    public final String b;

    public ContactInfo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static String b(int i) {
        return i != 1 ? i != 2 ? "Unknown" : "EmailAddress" : "PhoneNumber";
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContactInfo clone() {
        try {
            return (ContactInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactInfo) {
            ContactInfo contactInfo = (ContactInfo) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(contactInfo.a)) && atyq.b(this.b, contactInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return String.format(Locale.US, "ContactInfo<type: %s, value: %s>", b(this.a), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
