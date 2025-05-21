package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.clny;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactInfo extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new clny();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(contactInfo.a)) && arwb.b(this.b, contactInfo.b)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
