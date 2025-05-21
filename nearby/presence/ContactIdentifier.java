package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckjb;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ContactIdentifier extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new ckjb();
    public final int a;
    public final String b;

    public ContactIdentifier(int i, String str) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContactIdentifier clone() {
        try {
            return (ContactIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactIdentifier) {
            ContactIdentifier contactIdentifier = (ContactIdentifier) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(contactIdentifier.a)) && arwb.b(this.b, contactIdentifier.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return String.format(Locale.US, "ContactIdentifier<type: %s, value: %s>", Integer.valueOf(this.a), this.b);
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
