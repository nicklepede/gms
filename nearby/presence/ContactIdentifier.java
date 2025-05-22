package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmrg;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactIdentifier extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cmrg();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(contactIdentifier.a)) && atyq.b(this.b, contactIdentifier.b)) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
